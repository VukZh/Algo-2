package queuetest;

public class PQueueTest {

    public static void main(String[] args) {
        {
            PQueue<Integer> p1 = new PQueue<Integer>(3);
            p1.enqueue(1, 000);
            p1.enqueue(2, 111);
            p1.enqueue(2, 222);
            p1.enqueue(2, 333);
            p1.enqueue(2, 444);
            p1.enqueue(4, 777);
            p1.enqueue(11, 999);
            p1.enqueue(1, 001);
            p1.enqueue(1, 888);
            System.out.println(p1.dequeue());
            System.out.println(p1.dequeue());
            System.out.println(p1.dequeue());
            System.out.println(p1.dequeue());
            System.out.println(p1.dequeue());
            System.out.println(p1.dequeue());
            System.out.println(p1.dequeue());
            System.out.println(p1.dequeue());
            System.out.println(p1.dequeue());
            System.out.println(p1.dequeue());

            System.out.println("---");

            PQueue<String> p2 = new PQueue<String>();
            p2.enqueue(1, "aaa");
            p2.enqueue(10, "bbb");
            System.out.println(p2.dequeue());
            System.out.println(p2.dequeue());
            System.out.println(p2.dequeue());

        }
    }
}
