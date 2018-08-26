package cci;

import org.junit.Assert;
import org.junit.Test;


public class SubarrayWithMaxSumTest {
    @Test
    public void execute() throws Exception {
        SubarrayWithMaxSum subarrayWithMaxSum = new SubarrayWithMaxSum();
        int[] a = {-9, 3, 14, -10};

        SubarrayWithMaxSum.Result actual = subarrayWithMaxSum.execute(a);

        Assert.assertEquals(1, actual.beg);
        Assert.assertEquals(2, actual.end);
        Assert.assertEquals(17, actual.sum);
    }

}