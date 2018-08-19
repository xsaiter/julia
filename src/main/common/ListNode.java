package common;

public class ListNode {
    private final int _data;
    private ListNode _next;

    public ListNode(int data, ListNode next) {
        _data = data;
        _next = next;
    }

    public ListNode(int data) {
        this(data, null);
    }

    public int data() {
        return _data;
    }

    public ListNode next() {
        return _next;
    }

    public void setNext(ListNode next) {
        _next = next;
    }
}