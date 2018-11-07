package lia;

public class LinearSystem {
    private final Matrix _a;
    private final Vector _b;

    public LinearSystem(Matrix a, Vector b) {
        _a = a;
        _b = b;
    }

    public Vector solve(SolveStrategy strategy) {
        return strategy.solve(_a, _b);
    }

    public interface SolveStrategy {
        Vector solve(Matrix a, Vector b);

        static SolveStrategy makeJacobiMethod() {
            return new JacobiMethod();
        }

        static SolveStrategy makeGaussSeidelMethod() {
            return new GaussSeidelMethod();
        }
    }
}
