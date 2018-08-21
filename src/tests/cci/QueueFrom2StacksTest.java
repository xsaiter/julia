package cci;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueFrom2StacksTest {
    @Test
    public void execute() throws Exception {
        QueueFrom2Stacks<Integer> q = new QueueFrom2Stacks<>();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        Assert.assertEquals(1, (int)q.pop());
        Assert.assertEquals(2, (int)q.pop());

        q.push(5);
        q.push(6);

        Assert.assertEquals(3, (int)q.pop());
        Assert.assertEquals(4, (int)q.pop());

        Assert.assertEquals(5, (int)q.peek());
        Assert.assertEquals(5, (int)q.peek());
    }

}