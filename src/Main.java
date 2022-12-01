import structure_implement.Queue;
import structure_implement.QueueOneWay;

public class Main {
    public static void main(String[] args) {
        QueueOneWay<Integer> queue = new QueueOneWay<>();
        queue.enqueue(1);
        System.out.println("queue: head: " + queue.head.getValue());
        System.out.println("queue: head next: " + queue.head.getNext());
        System.out.println("queue: tail: " + queue.getTail().getValue());
        System.out.println("queue: tail next: " + queue.getTail().getNext());
        queue.enqueue(2);
        System.out.println("queue: head: " + queue.head.getValue());
        System.out.println("queue: head next: " + queue.head.getNext().getValue());
        System.out.println("queue: tail: " + queue.getTail().getValue());
        System.out.println("queue: tail next: " + queue.getTail().getNext());
        queue.enqueue(3);
        System.out.println("queue: head: " + queue.head.getValue());
        System.out.println("queue: head next: " + queue.head.getNext().getValue());
        System.out.println("queue: tail: " + queue.getTail().getValue());
        System.out.println("queue: tail next: " + queue.getTail().getNext());
        System.out.println("DEQUEUE------------------");
        queue.dequeue();
        System.out.println("queue: head: " + queue.head.getValue());
        System.out.println("queue: tail: " + queue.getTail().getValue());
        queue.dequeue();
        System.out.println("queue: head: " + queue.head.getValue());
        System.out.println("queue: tail: " + queue.getTail().getValue());
        queue.dequeue();
        System.out.println("queue: head: " + queue.head.getValue());
        System.out.println("queue: tail: " + queue.getTail().getValue());
    }
}