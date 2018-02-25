package lesson18.atLesson.e3;

/**
 * Created by student on 25.02.2018.
 */
public class NewThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("a");
        }
    }
}
