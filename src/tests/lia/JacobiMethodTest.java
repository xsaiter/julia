package lia;

import common.Helper;
import org.junit.Assert;
import org.junit.Test;

public class JacobiMethodTest {

    @Test
    public void solve() {
        double[][] aa = {
                {2, 1,},
                {5, 7}};
        var a = new Matrix(aa);

        double[] bb = {11,13};
        var b = new Vector(bb);

        var res = LinearSystem.Solver.makeJacobiMethod().solve(a, b);

        Assert.assertArrayEquals(new double[]{7.111, -3.222}, res.toArray(), Helper.EPSILON);
    }
}