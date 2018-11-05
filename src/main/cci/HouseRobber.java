package cci;

public class HouseRobber {
    public int execute(int[] a) {
        final int n = a.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return a[0];
        }

        int[] b = new int[n];
        b[0] = a[0];
        b[1] = Math.max(a[0], a[1]);

        for (int i = 2; i < n; ++i) {
            b[i] = Math.max(b[i - 2] + a[i], b[i - 1]);
        }

        return b[n - 1];
    }
}

