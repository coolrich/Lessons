package lesson16.atLesson.ex6;

import lesson16.atLesson.ex4.HeavyBox1;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<HeavyBox1> deque = new ArrayDeque<>();
        deque.offer(new HeavyBox1());
        deque.offer(new HeavyBox1());
        deque.offer(new HeavyBox1());
        System.out.println(deque);
        while (!deque.isEmpty()) {
            System.out.println(deque.poll());
        }
    }
}
