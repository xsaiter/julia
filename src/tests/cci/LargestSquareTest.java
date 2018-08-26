package cci;

import org.junit.Assert;
import org.junit.Test;

public class LargestSquareTest {
    @Test
    public void execute() throws Exception {
        int[][] a = new int[][]{
                {0, 1, 0, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 0, 0},
                {1, 0, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 1, 1, 1},
                {1, 1, 0, 0, 1, 1, 0},
        };

        LargestSquare largestSquare = new LargestSquare();

        LargestSquare.Result actual = largestSquare.execute(a);

        Assert.assertEquals(3, actual.side);
        Assert.assertEquals(3, actual.bottomRightRow);
        Assert.assertEquals(4, actual.bottomRightCol);
    }

}