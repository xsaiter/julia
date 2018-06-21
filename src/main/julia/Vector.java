package julia;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Vector {
    private double[] _a;
    private int _n;

    public Vector(int length) {
        this(new double[length]);
    }

    public Vector(double[] array) {
        _n = array.length;
        _a = array;
    }

    public int length() {
        return _n;
    }

    public void set(int i, double value) {
        _a[i] = value;
    }

    public double get(int i) {
        return _a[i];
    }

    public Vector mul(double value) {
        double[] res = Arrays.stream(_a).map(x -> x * value).toArray();
        return new Vector(res);
    }

    public Vector add(Vector other) {
        return applyBiFunction(other, (x, y) -> x + y);
    }

    public Vector sub(Vector other) {
        return applyBiFunction(other, (x, y) -> x - y);
    }

    private Vector applyBiFunction(Vector other, BiFunction<Double, Double, Double> fn) {
        assertEqualLength(other);

        Vector res = new Vector(_n);

        for (int i = 0; i < _n; ++i) {
            res._a[i] = fn.apply(_a[i], other._a[i]);
        }

        return res;
    }

    public double mul(Vector other) {
        assertEqualLength(other);

        double res = 0.0;

        for (int i = 0; i < _n; ++i) {
            res += (this._a[i] * other._a[i]);
        }

        return res;
    }

    public double magnitude() {
        return Math.sqrt(mul(this));
    }

    public double distanceTo(Vector other) {
        return sub(other).magnitude();
    }

    private void assertEqualLength(Vector other) {
        if (_n != other._n) {
            throw new IllegalArgumentException("lengths not equal");
        }
    }

    public double[] toArray() {
        double[] res = new double[_n];
        System.arraycopy(_a, 0, res, 0, _n);
        return res;
    }
}
