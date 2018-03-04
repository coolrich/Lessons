package lesson19.atLesson.ex2;

/**
 * Created by Student on 28.02.2018.
 */
public class StringBuilderThread implements Runnable {
    StringBuilder sb;

    public StringBuilderThread(StringBuilder stringBuilder) {
        sb=stringBuilder;
    }

    @Override
    public void run() {
        synchronized (sb) {
            for (int i = 0; i <= 100; i++) {
                System.out.println(sb + " "+Thread.currentThread());
            }
            sb.setCharAt(0, (char) (sb.charAt(0)+1));
        }
    }
}
