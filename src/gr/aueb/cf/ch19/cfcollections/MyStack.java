package gr.aueb.cf.ch19.cfcollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

/**
 * Simulates a LIFO data structure.
 * @param <T>
 */
public class MyStack<T> {
    private final Deque<T> myStack = new ArrayDeque<>();

    public MyStack() {
    }

    public void push(T t) {
        myStack.push(t);
    }

    public T pop() {
        return myStack.pop();
    }

    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    public void forEach(Consumer<T> action) {
        myStack.forEach(action);
    }
}
