package lesson8.exercise4;

public class Tulip extends Flower {
    private static int cntr = 0;

    public Tulip(String manufacturerCountry, int shelfLife, int price) {
        super(manufacturerCountry, shelfLife, price);
    }

    public void printPriceOfFlowers() {
        System.out.println(getCost() * cntr);
    }

    public String printInfo() {
        return "Tulip";
    }
}
