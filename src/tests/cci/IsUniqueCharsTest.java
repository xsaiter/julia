package cci;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsUniqueCharsTest {
    @Test
    public void execute() throws Exception {
        IsUniqueChars isUniqueChars = new IsUniqueChars();

        Assert.assertTrue(isUniqueChars.execute("abcd"));

        Assert.assertFalse(isUniqueChars.execute("abcdb"));

        Assert.assertFalse(isUniqueChars.execute("abcdcjk"));
    }
}