package lesson20.atHome.e4MyQueue2;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue2<T> {
    private Queue<T> store;

    public MyQueue2() {
        store = new ArrayDeque<>();
    }

    public synchronized T get() {
        while (store.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Object " + store.peek()
                + " was received by thread:"
                + Thread.currentThread().getName());
        return store.poll();
    }

    public synchronized void put(T t) {
        if (store.offer(t)) {
            System.out.println(t + "was sent");
        } else {
            System.out.println("fail," + t + "was not sent");
        }
        notifyAll();
    }
}
