package Lesson9.AtLesson.ex2;

/**
 * Created by Student on 17.01.2018.
 */
public interface Printable {
    void print();

    public static void main(String[] args) {
        Printable[] printables = {new Book(), new Magazine()};
        for (Printable p : printables) {
        p.print();
        }
    }
}
