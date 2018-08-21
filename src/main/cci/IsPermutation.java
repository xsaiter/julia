package cci;

import java.util.Arrays;

public class IsPermutation {
    public boolean execute(final String s, final String t) {
        final int n = s.length();
        final int m = t.length();
        if (n != m) {
            return false;
        }
        int[] a = new int[256];
        for (int i = 0; i < n; ++i) {
            int k = s.charAt(i);
            a[k] += 1;
        }
        for (int i = 0; i < n; ++i) {
            int k = t.charAt(i);
            a[k] -= 1;
            if (a[k] < 0) {
                return false;
            }
        }
        return Arrays.stream(a).allMatch((x) -> x == 0);
    }
}
