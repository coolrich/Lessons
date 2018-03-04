package lesson19.atLesson.ex1;

/**
 * Created by student on 25.02.2018.
 */
public class NewRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 101; i++) {
            System.out.print(i % 10 == 0 ? i + " " + Thread.currentThread() + " \n" : "");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
