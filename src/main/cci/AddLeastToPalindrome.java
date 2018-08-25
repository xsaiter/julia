package cci;


public class AddLeastToPalindrome {
    public int execute(String s) {
        return find(s, 0, s.length() - 1);
    }

    private int find(String s, int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (s.charAt(i) == s.charAt(j)) {
            return find(s, i + 1, j - 1);
        } else {
            return Math.min(find(s, i + 1, j), find(s, i, j - 1)) + 1;
        }
    }
}