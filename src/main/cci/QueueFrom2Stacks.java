package cci;

import java.util.Stack;

public class QueueFrom2Stacks<E> {
    private final Stack<E> _s1 = new Stack<>();
    private final Stack<E> _s2 = new Stack<>();

    public void push(E e){
        _s1.push(e);
    }

    public E pop(){
        if(!_s2.isEmpty()){
            return _s2.pop();
        }
        moveFrom1To2();
        return _s2.pop();
    }

    public E peek(){
        if(!_s2.isEmpty()){
            return _s2.peek();
        }
        moveFrom1To2();
        return _s2.peek();
    }

    private void moveFrom1To2(){
        if(_s1.isEmpty()){
            throw new RuntimeException("queue empty");
        }
        while(!_s1.isEmpty()){
            _s2.push(_s1.pop());
        }
    }
}
