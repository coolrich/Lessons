package lesson18.atLesson.e4;

/**
 * Created by student on 25.02.2018.
 */
public class RunnableDemo {
    public static void main(String[] args) {
        NewRunnable newRunnable = new NewRunnable();
        new Thread(newRunnable).start();
        new Thread(newRunnable).start();
        new Thread(newRunnable).start();

    }
}
