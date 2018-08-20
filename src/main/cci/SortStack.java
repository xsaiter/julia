package cci;


import java.util.Stack;

public class SortStack {
    public Stack<Integer> execute(Stack<Integer> src) {
        Stack<Integer> res = new Stack<>();

        while (!src.isEmpty()) {
            Integer x = src.pop();
            if (res.isEmpty()) {
                res.push(x);
            } else {
                if (res.peek() < x) {
                    res.push(x);
                } else {
                    int n = 0;
                    while (!res.isEmpty() && res.peek() > x) {
                        src.push(res.pop());
                        ++n;
                    }
                    res.push(x);
                    for (int i = 0; i < n; ++i) {
                        res.push(src.pop());
                    }
                }
            }
        }

        return res;
    }
}
