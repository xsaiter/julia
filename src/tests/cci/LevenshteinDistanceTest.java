package cci;

import org.junit.Assert;
import org.junit.Test;



public class LevenshteinDistanceTest {
    @Test
    public void execute() throws Exception {
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();

        int actual = levenshteinDistance.execute("qwe", "qwert");

        Assert.assertEquals(2, actual);
    }
}