package lesson13.atLesson.ex2;

interface Printable {
    void print();
}

public class PrintableDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Print");
            }
        };
        printable.print();
    }
}
