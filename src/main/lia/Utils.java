package lia;

public class Utils {
    public static final double EPSILON = 1e-7;

    public static boolean EqualsDouble(double x, double y) {
        return Math.abs(x - y) <= EPSILON;
    }

    public static boolean NotEqualsDouble(double x, double y) {
        return !EqualsDouble(x, y);
    }
}
