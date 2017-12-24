package lesson5.Exercise5;

/**
 * Created by student on 17.12.2017.
 */
public class DoWhileOp {
    public static void main(String[] args) {
        int count = 0;
        do {
            if (count % 5 == 0) {
                System.out.println(count);
            }
        } while (count++ < 100);
    }
}
