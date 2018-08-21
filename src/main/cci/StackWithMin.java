package cci;

import java.util.Stack;

public class StackWithMin<E extends Comparable<E>> {
    private final Stack<Elt> _s = new Stack<>();

    public void push(E e) {
        Elt elt;
        if (_s.isEmpty()) {
            elt = new Elt(e, e);
        } else {
            E m = min();
            E r = m.compareTo(e) < 0 ? m : e;
            elt = new Elt(e, r);
        }
        _s.push(elt);
    }

    public E pop() {
        return _s.pop().val;
    }

    public E peek() {
        return _s.peek().val;
    }

    public int size() {
        return _s.size();
    }

    public boolean isEmpty() {
        return _s.isEmpty();
    }

    public E min() {
        return _s.peek().min;
    }

    private class Elt {
        public Elt(E val, E min) {
            this.val = val;
            this.min = min;
        }

        public E val;
        public E min;
    }
}
