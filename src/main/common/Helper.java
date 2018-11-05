package common;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Helper {
    public static <T> ArrayList<T> newArray(int capacity, Supplier<T> createValue) {
        ArrayList<T> res = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; ++i) {
            res.add(createValue.get());
        }
        return res;
    }
}
