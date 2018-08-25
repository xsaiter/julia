package cci;

import org.junit.Assert;
import org.junit.Test;

public class TurtleTravelTest {
    @Test
    public void execute() throws Exception {
        int[][] a = new int[][] {{8,20, 40}, {5,11, 27}};
        TurtleTravel turtleTravel = new TurtleTravel(a);

        TurtleTravel.Result actual = turtleTravel.execute();

        Assert.assertEquals(83, actual.sum);
        Assert.assertEquals(4, actual.path().size());
    }

}