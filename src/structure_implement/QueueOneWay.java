package structure_implement;

import baseNode.NodeQueue;

public class QueueOneWay<T> {
    public NodeQueue<T> head;

    public QueueOneWay() {
    }

    public QueueOneWay(NodeQueue<T> head) {
        this.head = head;
    }

    public void enqueue(T value) {
        NodeQueue<T> newElementOfQueue = new NodeQueue<>(value);
        if (this.head == null) {
            this.head = newElementOfQueue;
            return;
        }
        NodeQueue<T> lastElementOfQueue= getTailRecursive(this.head);
        lastElementOfQueue.setNext(newElementOfQueue);

    }


    public void dequeue() {
        if (this.head == null)
            return;

        this.head = this.head.getNext();
    }
    public NodeQueue<T> getTailRecursive(NodeQueue<T> nodeStartFind){
        if(nodeStartFind==null){
            return null;
        }
        if(nodeStartFind.getNext()==null){
            return nodeStartFind;
        }else {
            return getTailRecursive(nodeStartFind.getNext());
        }

    }

    public NodeQueue<T> getTail(){
        NodeQueue<T> lastElementOfQueue=this.head;
        while(lastElementOfQueue.getNext()!=null){
            lastElementOfQueue=lastElementOfQueue.getNext();
        }
        return lastElementOfQueue;
    }
}
