package cci;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPermutationTest {
    @Test
    public void execute() throws Exception {
        IsPermutation isPermutation = new IsPermutation();

        Assert.assertTrue(isPermutation.execute("abcd", "abcd"));

        Assert.assertFalse(isPermutation.execute("abcd", "abcf"));

        Assert.assertFalse(isPermutation.execute("abcd", "abcdh"));
    }

}