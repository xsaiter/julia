package lia;

import org.junit.Test;
import org.junit.Assert;


public class VectorTest {
    @Test
    public void length() throws Exception {
        Vector v = createVector();
        Assert.assertEquals(3, v.length());
    }

    @Test
    public void set() throws Exception {
        Vector v = createVector();
        double value = 10;
        v.set(2, value);
        Assert.assertEquals(value, v.get(2), Utils.EPSILON);
    }

    @Test
    public void get() throws Exception {
        Vector v = createVector();
        double value = 3;
        Assert.assertEquals(value, v.get(2), Utils.EPSILON);
    }

    @Test
    public void multiply() throws Exception {
        Vector v = createVector();
        Vector v2 = v.mul(10);
        Assert.assertArrayEquals(new double[]{10, 20, 30}, v2.toArray(), Utils.EPSILON);
    }

    @Test
    public void plus() throws Exception {
        Vector a = createVector();
        Vector b = createVector();
        Vector c = a.add(b);
        Assert.assertArrayEquals(new double[]{2, 4, 6}, c.toArray(), Utils.EPSILON);
    }

    @Test
    public void minus() throws Exception {
        Vector a = createVector();
        Vector b = createVector();
        Vector c = a.sub(b);
        Assert.assertArrayEquals(new double[]{0, 0, 0}, c.toArray(), Utils.EPSILON);
    }

    @Test
    public void toArray() throws Exception {
        double[] array = createArray();
        Vector vector = new Vector(array);
        double[] copyArray = vector.toArray();
        Assert.assertArrayEquals(array, copyArray, Utils.EPSILON);
    }

    private static Vector createVector() {
        return new Vector(createArray());
    }

    private static double[] createArray() {
        return new double[]{1, 2, 3};
    }
}