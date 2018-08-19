package cci;

public class IsRotation {
    public boolean execute(String s, String t) {
        final int n = s.length();
        final int m = t.length();
        if (n != m) {
            return false;
        }
        String ss = s + s;
        return ss.contains(t);
    }
}
