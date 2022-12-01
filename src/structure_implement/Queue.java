package structure_implement;

import baseNode.NodeQueue;

public class Queue<T> {
    public NodeQueue<T> head;
    public NodeQueue<T> tail;

    public Queue() {
    }

    public Queue(NodeQueue<T> head, NodeQueue<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public void enqueue(T value) {
        NodeQueue<T> newElementOfQueue = new NodeQueue<>(value);
        NodeQueue<T> lastElementOfQueue=this.tail;
        if (this.tail == null) {
            this.head = newElementOfQueue;
            this.tail = newElementOfQueue;
            return;
        }
        lastElementOfQueue.setNext(newElementOfQueue);
        this.tail = newElementOfQueue;

    }

    public void dequeue() {
        if (this.head == null)
            return;

        this.head = this.head.getNext();

        if (this.head == null)
            this.tail = null;
    }
}
