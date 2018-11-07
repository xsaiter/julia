package lia;

public interface SolveStrategy {
    Vector solve(Matrix a, Vector b);

    static SolveStrategy getJacobiMethod() {
        return new JacobiMethod();
    }

    static SolveStrategy getGaussSeidelMethod() {
        return new GaussSeidelMethod();
    }
}
