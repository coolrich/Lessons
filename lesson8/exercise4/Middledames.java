package lesson8.exercise4;

public class Middledames extends Flower{
    private static int cntr=0;
    public Middledames(String manufacturerCountry, int shelfLife, int price) {
        super(manufacturerCountry, shelfLife, price);
    }

    public void printPriceOfFlowers(){
        System.out.println(getCost()*cntr);
    }

    public String printInfo(){
        return "Middledames";
    }
}
