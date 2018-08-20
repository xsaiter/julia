package cci;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;


public class SortStackTest {
    @Test
    public void execute() throws Exception {
        SortStack sortStack = new SortStack();

        Stack<Integer> stack = new Stack<>();
        stack.push(8);
        stack.push(1);
        stack.push(10);
        stack.push(2);
        stack.push(3);

        Stack<Integer> res = sortStack.execute(stack);

        Assert.assertEquals(5, res.size());

        Assert.assertEquals(10, (int)res.pop());
        Assert.assertEquals(8, (int)res.pop());
        Assert.assertEquals(3, (int)res.pop());
        Assert.assertEquals(2, (int)res.pop());
        Assert.assertEquals(1, (int)res.pop());
    }
}