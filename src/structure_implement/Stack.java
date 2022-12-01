package structure_implement;

import baseNode.NodeQueue;
import baseNode.NodeStack;

import java.util.EmptyStackException;

public class Stack<T> {
    private NodeStack<T> top;
    private int size=0;

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void push(T val) {
        top = new NodeStack<>(top, val);
        size++;
    }

    public T pop () {
        T data ;
        if (isEmpty()) throw new EmptyStackException();
        else {
            data = top.getData();
            NodeStack<T> topElement = top;
            top = top.getLink();
            topElement.setLink(null);
            size--;
        }
        return data;
    }
    public T peek () {
        T data = null;
        if (isEmpty()) throw new EmptyStackException();
        else data = top.getData();
        return data;
    }


}
