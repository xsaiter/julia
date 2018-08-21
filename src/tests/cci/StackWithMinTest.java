package cci;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class StackWithMinTest {
    @Test
    public void execute() throws Exception {
        StackWithMin<Integer> s = new StackWithMin<>();

        s.push(10);
        s.push(2);
        s.push(20);

        int r1 = s.min();
        Assert.assertEquals(2, r1);

        s.push(1);

        int r2 = s.min();
        Assert.assertEquals(1, r2);

        s.pop();

        int r3 = s.min();
        Assert.assertEquals(2, r3);
    }

}