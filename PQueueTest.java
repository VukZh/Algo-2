package queuetest;

public class PQueueTest {
    public static void main(String[] args) {
        {
            PQueue<Integer> p1 = new PQueue<Integer>(5);
            p1.enqueue(1, 000);
            p1.enqueue(2, 111);
            p1.enqueue(2, 222);
            p1.enqueue(2, 333);
            p1.enqueue(2, 444);
            p1.enqueue(3, 777);
            p1.enqueue(1, 001);
            p1.dequeue();
            p1.dequeue();
            p1.dequeue();
            p1.dequeue();
            p1.dequeue();
            p1.dequeue();
            p1.dequeue();
            p1.dequeue();

            System.out.println("---");

            PQueue<String> p2 = new PQueue<String>(3);
            p2.enqueue(1, "001");
            p2.enqueue(2, "002");
            p2.enqueue(2, "003");
            p2.enqueue(2, "004");
            p2.enqueue(2, "005");
            p2.enqueue(3, "006");
            p2.dequeue();
            p2.dequeue();
            p2.dequeue();
            p2.dequeue();
            p2.dequeue();
            p2.dequeue();
            p2.dequeue();
        }
    }
}