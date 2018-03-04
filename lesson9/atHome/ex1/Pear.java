package lesson9.atHome.ex1;

public class Pear extends Fruit {
    private static int cstOfAllPrs = 0;
    private static int pearCntr = 0;
    private String pearColor;
    private String variety;
    private int pearCost;

    public Pear(int weight, String pearColor, String variety, int pearCost) {
        super(weight, pearCost);
        this.pearColor = pearColor;
        this.variety = variety;
        this.pearCost = pearCost;
        pearCntr++;
        cstOfAllPrs += pearCost;
    }

    public static int getCstOfAllPrs() {
        return cstOfAllPrs;
    }

    public static void setCstOfAllPrs(int cstOfAllPrs) {
        Pear.cstOfAllPrs = cstOfAllPrs;
    }

    public static int getPearCntr() {
        return pearCntr;
    }

    public static void setPearCntr(int pearCntr) {
        Pear.pearCntr = pearCntr;
    }

    @Override
    public int getCostOfFrts() {
        return cstOfAllPrs;
    }

    @Override
    public int getCost() {
        return getWeight() * pearCost;
    }

    @Override
    public String getFrstName() {
        return "Pears";
    }

    public String getPearColor() {
        return pearColor;
    }

    public void setPearColor(String pearColor) {
        this.pearColor = pearColor;
    }

    public void setPearolor(String pearColor) {
        this.pearColor = pearColor;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getPearCost() {
        return pearCost;
    }

    public void setPearCost(int pearCost) {
        this.pearCost = pearCost;
    }
}
