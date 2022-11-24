package structure_implement;

import base.Node;

public class Queue <T>{
    private Node<T> front;
    private Node<T> rear;

    public Queue(Node<T> front, Node<T> rear) {
        this.front = front;
        this.rear = rear;
    }
    void enqueue(T key)
    {
        // Tạo mới một Node
        Node<T> temp = new Node<>(key);

        // nếu Queue trống , thì thêm đường dẫn tham chiếu của temp vào front và rear
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        //  thêm  node mới tạo vào cuối queue và thay đổi đường dãn tham chiếu của rear
        this.rear.setNext(temp);
        this.rear = temp;
    }

    // phương thức để xóa một node từ queue
    void dequeue()
    {
        //  Nếu Queue là rỗng thì trả về null
        if (this.front == null)
            return;
        // Lưu trữ đường dẫn tham chiếu của front
        // và chuyển đường dẫn tham chiếu của front đến phần tử đằng sau nó
        this.front=this.front.getNext();
        // If front becomes NULL, then change rear also as
        // NULL
        if (this.front == null)
            this.rear = null;
    }
}
