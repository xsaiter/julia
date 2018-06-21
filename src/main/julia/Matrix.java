package julia;

public class Matrix {
    private double[][] _array;

    public Matrix(int rows, int cols) {
        this(new double[rows][cols]);
    }

    public Matrix(double[][] array) {
        _array = array;
    }

    public void set(int i, int j, double value) {
        _array[i][j] = value;
    }

    public double get(int i, int j) {
        return _array[i][j];
    }

    public int rows() {
        return rowsOf(_array);
    }

    public int cols() {
        return colsOf(_array);
    }

    public static int rowsOf(double[][] a) {
        return a.length;
    }

    public static int colsOf(double[][] a) {
        return rowsOf(a) == 0 ? 0 : a[0].length;
    }

    public Matrix mul(double value) {
        Matrix result = new Matrix(toArray());

        for (int i = 0; i < rows(); ++i) {
            for (int j = 0; j < cols(); ++j) {
                result._array[i][j] *= value;
            }
        }

        return result;
    }

    public Matrix mul(Matrix m){
        return mul(this, m);
    }

    public static Matrix mul(Matrix a, Matrix b) {
        int l = a.rows();
        int n = b.cols();
        int m = a.cols();

        Matrix result = new Matrix(l, n);

        for (int i = 0; i < l; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < m; ++k) {
                    result._array[i][j] += a._array[i][k] * b._array[k][j];
                }
            }
        }

        return result;
    }

    public double[][] toArray() {
        double[][] result = new double[rows()][cols()];

        for (int i = 0; i < rows(); ++i) {
            System.arraycopy(_array[i], 0, result[i], 0, cols());
        }

        return result;
    }

    public static boolean equalArrays(double[][] a, double[][] b) {
        int rowsA = Matrix.rowsOf(a);
        int colsA = Matrix.colsOf(a);

        int rowsB = Matrix.rowsOf(b);
        int colsB = Matrix.colsOf(b);

        if (rowsA != rowsB || colsA != colsB) {
            return false;
        }

        for (int i = 0; i < rowsA; ++i) {
            for (int j = 0; j < colsA; ++j) {
                if (Utils.NotEqualsDouble(a[i][j], b[i][j])) {
                    return false;
                }
            }
        }

        return true;
    }

    public Matrix copy(){
        return new Matrix(toArray());
    }
}
