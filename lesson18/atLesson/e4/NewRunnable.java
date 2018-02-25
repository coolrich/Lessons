package lesson18.atLesson.e4;

/**
 * Created by student on 25.02.2018.
 */
public class NewRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 101; i++) {
            System.out.print(i % 10 == 0 ? i + "\n" : "");
        }
    }
}
