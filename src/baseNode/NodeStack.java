package baseNode;

public class NodeStack<T> {
    private T data;
    private NodeStack<T> link;


    public NodeStack( NodeStack<T> link,T data) {
        this.data = data;
        this.link = link;
    }

    public T getData() {
        return data;
    }


    public NodeStack<T> getLink() {
        return link;
    }

    public void setLink(NodeStack<T> link) {
        this.link = link;
    }
}
