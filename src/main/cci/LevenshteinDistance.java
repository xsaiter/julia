package cci;

public class LevenshteinDistance {
    public int execute(String from, String to) {
        final int n = from.length();
        final int m = to.length();

        int[][] d = new int[n][m];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (i == 0 && j == 0) {
                    d[i][j] = 0;
                } else if (i == 0 && j > 0) {
                    d[i][j] = j;
                } else if (i > 0 && j == 0) {
                    d[i][j] = i;
                } else {
                    int p = d[i][j - 1] + 1;
                    int q = d[i - 1][j] + 1;
                    int r = d[i - 1][j - 1] + ((from.charAt(i - 1) == to.charAt(j - 1)) ? 0 : 1);
                    int smallest = p;
                    if (q < smallest) {
                        smallest = q;
                    }

                    if (r < smallest) {
                        smallest = r;
                    }

                    d[i][j] = smallest;
                }
            }
        }

        return d[n - 1][m - 1];
    }
}