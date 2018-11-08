package lia;

public class LinearSystem {
    private final Matrix _a;
    private final Vector _b;

    public LinearSystem(Matrix a, Vector b) {
        _a = a;
        _b = b;
    }

    public Vector solve(Solver solver) {
        return solver.solve(_a, _b);
    }

    public interface Solver {
        Vector solve(Matrix a, Vector b);

        static Solver makeJacobiMethod() {
            return new JacobiMethod();
        }

        static Solver makeGaussSeidelMethod() {
            return new GaussSeidelMethod();
        }
    }
}
