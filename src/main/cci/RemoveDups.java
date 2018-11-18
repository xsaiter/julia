package cci;

import cci.common.ListNode;

import java.util.HashSet;

public class RemoveDups {
    public void execute(ListNode node) {
        HashSet<Integer> set = new HashSet<>();
        ListNode x = node;
        ListNode prev = null;
        while (x != null) {
            if (set.contains(x.data())) {
                prev.setNext(x.next());
            } else {
                set.add(x.data());
                prev = x;
            }
            x = x.next();
        }
    }
}
