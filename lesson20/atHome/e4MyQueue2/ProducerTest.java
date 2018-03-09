package lesson20.atHome.e4MyQueue2;

public class ProducerTest {
    public static void main(String[] args) {
        Thread t1, t2, t3, t4;
        MyQueue2 myQueue2 = new MyQueue2();
        t1 = new Thread(new Consumer(myQueue2, "First"));
        t2 = new Thread(new Consumer(myQueue2, "Second"));
        t3 = new Thread(new Consumer(myQueue2, "Third"));
        t4 = new Thread(new Producer(myQueue2));

        t1.setName("c1");
        t2.setName("c2");
        t3.setName("c3");
        t4.setName("p1");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
