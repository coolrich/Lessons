package lesson9.atLesson.ex2;

import lesson9.atLesson.ex2.Book;
import lesson9.atLesson.ex2.Magazine;

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
