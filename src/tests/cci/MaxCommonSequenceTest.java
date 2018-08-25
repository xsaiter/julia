package cci;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class MaxCommonSequenceTest {
    @Test
    public void execute() throws Exception {
        MaxCommonSequence maxCommonSequence = new MaxCommonSequence();

        int actual = maxCommonSequence.execute("gcataggtc", "agcaatggt");

        Assert.assertEquals(actual, 7);
    }
}