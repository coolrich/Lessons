package lesson8.exercise4;

public class Rose extends Flower {
    private boolean thorns;
    private static int cntr = 0;

    public Rose(String manufacturerCountry, int shelfLife, int price, boolean thorns) {
        super(manufacturerCountry, shelfLife, price);
        this.thorns = thorns;
    }

    public String printInfo() {
        return "Rose";
    }

    public void printPriceOfFlowers() {
        System.out.println(getCost() * cntr);
    }
}
