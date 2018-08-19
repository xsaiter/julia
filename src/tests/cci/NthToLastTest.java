package cci;

import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthToLastTest {
    @Test
    public void execute() throws Exception {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        NthToLast nthToLast = new NthToLast() ;
        ListNode res = nthToLast.execute(node, 2);
        Assert.assertEquals(3, res.data());
    }

}