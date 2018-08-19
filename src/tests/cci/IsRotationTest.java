package cci;

import org.junit.Assert;
import org.junit.Test;

public class IsRotationTest {
    @Test
    public void execute() throws Exception {
        IsRotation isRotation = new IsRotation();

        Assert.assertTrue(isRotation.execute("hello", "llohe"));

        Assert.assertFalse(isRotation.execute("hello", "abc"));

        Assert.assertFalse(isRotation.execute("hello", "lloh"));
    }
}