package lesson9.atHome.ex1;

public abstract class Fruit {
    private static int costOfAllFrts = 0;
    private static int cntr = 0;
    private int weight;

    public Fruit(int weight, int costOfAllFrts) {
        this.weight = weight;
        Fruit.costOfAllFrts += costOfAllFrts;
        cntr++;
    }

    public static int getCostOfAllFrts() {
        return costOfAllFrts;
    }

    public static int getCntr() {
        return cntr;
    }

    public static void setCntr(int cntr) {
        Fruit.cntr = cntr;
    }

    public abstract int getCost();

    public abstract String getFrstName();

    public abstract int getCostOfFrts();

    public final void printManufactured() {
        System.out.println("Made in Ukraine");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
