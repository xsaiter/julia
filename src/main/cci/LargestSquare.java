package cci;

public class LargestSquare {
    public Result execute(int a[][]) {
        int rows = a.length;
        int cols = a[0].length;

        int b[][] = new int[rows][cols];

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (i == 0 || j == 0) {
                    b[i][j] = a[i][j];
                } else {
                    if (a[i][j] == 0) {
                        b[i][j] = 0;
                    } else {
                        b[i][j] = min(b[i - 1][j], b[i][j - 1], b[i - 1][j - 1]) + 1;
                    }
                }
            }
        }

        int side = 0;
        int r = 0;
        int c = 0;

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (b[i][j] > side) {
                    side = b[i][j];
                    r = i;
                    c = j;
                }
            }
        }

        return new Result(r, c, side);
    }

    private int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static class Result {
        public final int bottomRightRow;
        public final int bottomRightCol;
        public final int side;

        public Result(int bottomRightRow, int bottomRightCol, int side) {
            this.bottomRightRow = bottomRightRow;
            this.bottomRightCol = bottomRightCol;
            this.side = side;
        }
    }
}