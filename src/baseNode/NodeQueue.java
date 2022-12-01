package baseNode;

public class NodeQueue<T> {
    private NodeQueue<T> next;
    private T value;

    public NodeQueue(T value) {
        this.value = value;
    }


    public NodeQueue<T> getNext() {
        return next;
    }

    public void setNext(NodeQueue<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
