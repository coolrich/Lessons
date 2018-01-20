package lesson8.exercise4;

public class Carnation extends Flower {

    private static int cntr = 0;

    public Carnation(String manufacturerCountry, int shelfLife, int price) {
        super(manufacturerCountry, shelfLife, price);
        cntr++;
    }

    public String printInfo() {
        return "Carnation";
    }

    public void printPriceOfFlowers() {
        System.out.println(getCost() * cntr);
    }
}
