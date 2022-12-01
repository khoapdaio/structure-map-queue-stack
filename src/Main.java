import structure_implement.Map;
import structure_implement.Queue;
import structure_implement.QueueOneWay;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new Map<>();
        map.put(1, "khoa1");
        map.put(2, "khoa2");
        map.put(3, "khoa3");
        map.put(4, "khoa4");
        map.put(5, "khoa5");
        map.put(6, "khoa6");
        map.put(7, "khoa7");
        map.put(8, "khoa8");
        map.put(9, "khoa9");
        map.put(10, "khoa10");
        map.put(11, "khoa11");
        map.put(12, "khoa12");
        map.put(13, "khoa13");
        map.put(14, "khoa14");
        map.put(15, "khoa15");
        map.put(16, "khoa16");
        map.put(17, "khoa17");
        map.put(18, "khoa18");
        map.display();
        for (Integer element: map.getKey()) {
            System.out.print(element+",");
        }
        System.out.println("\n");
        for (String element: map.getValue()) {
            System.out.print(element+",");
        }
    }
    static void testMap() {

    }

    static void testQueue() {
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