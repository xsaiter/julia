package cci;

public class IsUniqueChars {
    public boolean execute(final String s) {
        int x = 0;
        final int n = s.length();
        for (int i = 0; i < n; ++i) {
            int d = s.charAt(i) - 'a';
            if ((x & (1 << d)) > 0) {
                return false;
            }
            x |= 1 << d;
        }
        return true;
    }
}
