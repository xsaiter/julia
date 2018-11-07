package common;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Helper {
    public static <T> ArrayList<T> allocateArray(int capacity, Supplier<T> createValue) {
        ArrayList<T> res = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; ++i) {
            res.add(createValue.get());
        }
        return res;
    }

    public static final double EPSILON = 1e-3;

    public static boolean EqualsDouble(double x, double y) {
        return Math.abs(x - y) <= EPSILON;
    }

    public static boolean NotEqualsDouble(double x, double y) {
        return !EqualsDouble(x, y);
    }
}
