package lesson9.atLesson.ex2;

/**
 * Created by Student on 17.01.2018.
 */
public interface Printable {
    public static void main(String[] args) {
        Printable[] printables = {new Book(), new Magazine()};
        for (Printable p : printables) {
            p.print();
        }
    }

    void print();
}
