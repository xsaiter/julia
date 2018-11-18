package cci;

import cci.common.ListNode;

public class NthToLast {
    public ListNode execute(final ListNode node, int n) {
        ListNode fwd = node;
        int i = 0;
        while (fwd != null && i < n) {
            fwd = fwd.next();
            ++i;
        }
        if (fwd == null) {
            return null;
        }
        ListNode back = node;
        while (fwd != null) {
            back = back.next();
            fwd = fwd.next();
        }
        return back;
    }
}
