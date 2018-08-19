package cci;

import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDupsTest {
    @Test
    public void execute() throws Exception {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        RemoveDups removeDups = new RemoveDups();
        removeDups.execute(node);

        for (int i = 1; i < 3; ++i) {
            Assert.assertEquals(i, node.data());
            node = node.next();
        }
    }
}