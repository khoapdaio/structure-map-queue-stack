package structure_implement;

import base.Node;

import java.util.EmptyStackException;

public class Stack<T> {
    private Node<T> top;
    private int size=0;

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void push(T val) {
        top = new Node<>(top, val);
        size++;
    }

    public T pop () {
        T data = null;
        if (isEmpty()) throw new EmptyStackException();
        else {
            data = top.getValue(); // lấy dữ liệu được lưu trữ ở phần tử trên cùng
            Node<T> temp = top; // cài đặt biến tmp tới đường dẫn tham chiếu phần tử trên cùng
            top = top.getNext(); // cập nhật đường dẫn tham chiếu phần tử trên cùng
            temp.setNext(null); // cập nhật đường dẫn tham chiếu tới phần tử trên cùng mới
            size--;// cập nhật số lượng phần tử
        }
        return data;
    }
    public T peek () {
        T data = null;
        if (isEmpty()) throw new EmptyStackException();
        else data = top.getValue(); // lấy dữ liệu được lưu trữ phần tử trên cùng
        return data;
    }
}
