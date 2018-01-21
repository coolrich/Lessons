package lesson10.ex1;

public interface Printable {
    void print();

    static void main(String[] args) {
        Printable[] printables = {new Magazine("JavaIsCool"), new Book("Thinking in Java")};
        for (Printable p : printables) {
            p.print();
        }
        System.out.println("Magazine.printMagazines(printables):");
        Magazine.printMagazines(printables);
        System.out.println("Book.printBooks(printables):");
        Book.printBooks(printables);
    }
}
