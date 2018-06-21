package julia;

import org.junit.Assert;
import org.junit.Test;


public class MatrixTest {
    @Test
    public void set() throws Exception {
        double[][] array = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3}};

        Matrix m = new Matrix(array);
        m.set(1,2, 20);

        Assert.assertEquals(20, m.get(1,2), Utils.EPSILON);
    }

    @Test
    public void get() throws Exception {
        double[][] array = {
                {1, 1, 1, 1},
                {2, 2, 20, 2},
                {3, 3, 3, 3}};

        Matrix m = new Matrix(array);

        Assert.assertEquals(20, m.get(1,2), Utils.EPSILON);
    }

    @Test
    public void rows() throws Exception {
        double[][] array = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3}};

        Matrix m = new Matrix(array);

        Assert.assertEquals(3, m.rows());
    }

    @Test
    public void cols() throws Exception {
        double[][] array = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3}};

        Matrix m = new Matrix(array);

        Assert.assertEquals(4, m.cols());
    }

    @Test
    public void multiply() throws Exception {
        double[][] array = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3}};

        Matrix m = new Matrix(array);

        Matrix res = m.mul(10);

        double[][] expected = {
                {10, 10, 10, 10},
                {20, 20, 20, 20},
                {30, 30, 30, 30}};

        Assert.assertTrue(Matrix.equalArrays(expected, res.toArray()));
    }

    @Test
    public void multiply_matrices() throws Exception {
        double[][] a1 = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}};

        double a2[][] = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}};

        Matrix m1 = new Matrix(a1);
        Matrix m2 = new Matrix(a2);

        Matrix res =  Matrix.mul(m1, m2);

        double expected[][] = {
                {10, 10, 10, 10},
                {20, 20, 20, 20},
                {30, 30, 30, 30},
                {40, 40, 40, 40}};

        Assert.assertTrue(Matrix.equalArrays(expected, res.toArray()));
    }

    @Test
    public void toArray() throws Exception {
        double expected[][] = {
                {10, 10, 10, 10},
                {20, 20, 20, 20},
                {30, 30, 30, 30},
                {40, 40, 40, 40}};

        Matrix m = new Matrix(expected);

        Assert.assertTrue(Matrix.equalArrays(expected, m.toArray()));
    }
}