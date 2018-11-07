package lia;

import common.Helper;

public class JacobiMethod implements LinearSystem.SolveStrategy {

    @Override
    public Vector solve(Matrix a, Vector b) {
        final int n = b.length();

        Vector res = new Vector(n);
        res.setAll(1.0);

        Vector buf = new Vector(n);

        double norm;

        do {
            for (int i = 0; i < n; ++i) {
                buf.set(i, b.get(i));

                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        buf.setToSub(i, a.get(i, j) * res.get(j));
                    }
                }

                buf.setToDiv(i, a.get(i, i));
            }

            norm = Math.abs(res.get(0) - buf.get(0));

            for (int i = 0; i < n; ++i) {
                if (Math.abs(res.get(i) - buf.get(i)) > norm) {
                    norm = Math.abs(res.get(i) - buf.get(i));
                }
                res.set(i, buf.get(i));
            }
        } while (norm > Helper.EPSILON);

        return res;
    }
}
