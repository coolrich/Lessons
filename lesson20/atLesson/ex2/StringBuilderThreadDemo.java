package lesson20.atLesson.ex2;

/**
 * Created by Student on 28.02.2018.
 */
public class StringBuilderThreadDemo {
    public static void main(String[] args) {
        StringBuilderThread sbt = new StringBuilderThread(new StringBuilder("a"));
        new Thread(sbt).start();
        new Thread(sbt).start();
        new Thread(sbt).start();
    }
}
