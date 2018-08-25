package cci;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberTest {
    @Test
    public void execute() throws Exception {
        HouseRobber houseRobber = new HouseRobber();

        int res = houseRobber.execute(new int[]{10, 2, 3, 22});

        Assert.assertEquals(32, res);
    }

}