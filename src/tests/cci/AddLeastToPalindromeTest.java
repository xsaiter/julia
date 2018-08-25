package cci;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by isa on 25.08.18.
 */
public class AddLeastToPalindromeTest {
    @Test
    public void execute() throws Exception {
        AddLeastToPalindrome t = new AddLeastToPalindrome();
        int actual = t.execute("tttyy");
        Assert.assertEquals(2, actual);
    }

}