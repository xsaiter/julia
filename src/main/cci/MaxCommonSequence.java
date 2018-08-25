package cci;

public final class MaxCommonSequence {
    public int execute(String s1, String s2) {
        final int n1 = s1.length();
        final int n2 = s2.length();

        int[][] b = new int[n1][n2];
        boolean[][] a = new boolean[n1][n2];

        boolean first = false;
        for (int i = 0; i < n1; ++i) {
            if (first) {
                b[i][0] = 1;
            } else {
                if (s1.charAt(i) == s2.charAt(0)) {
                    b[i][0] = 1;
                    a[i][0] = true;
                    first = true;
                } else {
                    b[i][0] = 0;
                }
            }
        }

        first = false;
        for (int j = 0; j < n2; ++j) {
            if (first) {
                b[0][j] = 1;
            } else {
                if (s1.charAt(0) == s2.charAt(j)) {
                    b[0][j] = 1;
                    a[0][j] = true;
                    first = true;
                } else {
                    b[0][j] = 0;
                }
            }
        }

        for (int i = 0; i < n1; ++i) {
            for (int j = 0; j < n2; ++j) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    a[i][j] = true;
                }
            }
        }

        for (int i = 1; i < n1; ++i) {
            for (int j = 1; j < n2; ++j) {
                int m = Math.max(b[i - 1][j], b[i][j - 1]);
                if (a[i][j]) {
                    m = Math.max(m, b[i - 1][j - 1] + 1);
                }
                b[i][j] = m;
            }
        }

        return b[n1 - 1][n2 - 1];
    }
}