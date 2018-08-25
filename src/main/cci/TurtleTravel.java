package cci;

import java.util.ArrayList;
import java.util.List;

public class TurtleTravel {
    private final int _a[][];
    private final int _rows, _cols;

    public TurtleTravel(int a[][]) {
        this._a = a;
        this._rows = _a.length;
        this._cols = _a[0].length;
    }

    public Result execute() {
        int[][] b = new int[_rows][_cols];
        int i, j;

        for (i = _rows - 1; i >= 0; --i) {
            for (j = 0; j <= _cols - 1; ++j) {
                if (i == _rows - 1 && j == 0) {
                    b[i][j] = _a[i][j];
                } else if (j == 0) {
                    b[i][j] = _a[i][j] + b[i + 1][j];
                } else if (i == _rows - 1) {
                    b[i][j] = _a[i][j] + b[i][j - 1];
                } else {
                    b[i][j] = _a[i][j] + Math.max(b[i + 1][j], b[i][j - 1]);
                }
            }
        }

        Result res = new Result(b[0][_cols - 1]);

        i = _rows - 1;
        j = 0;

        res.addCell(i, j, _a[i][j]);

        while (i != 0 || j != _cols - 1) {
            if (i == 0) {
                ++j;
            } else if (j == _cols - 1) {
                --i;
            } else if (b[i - 1][j] < b[i][j + 1]) {
                ++j;
            } else {
                --i;
            }

            res.addCell(i, j, _a[i][j]);
        }

        return res;
    }

    public static class Result {
        public final int sum;
        private final ArrayList<Cell> _cells = new ArrayList<>();

        public Result(int sum) {
            this.sum = sum;
        }

        public void addCell(int x, int y, int val) {
            _cells.add(new Cell(x, y, val));
        }

        public List<Cell> path() {
            return _cells;
        }

        public static class Cell {
            public final int x, y, val;

            public Cell(int x, int y, int val) {
                this.x = x;
                this.y = y;
                this.val = val;
            }
        }
    }
}