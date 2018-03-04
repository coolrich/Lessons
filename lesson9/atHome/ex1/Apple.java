package lesson9.atHome.ex1;

public class Apple extends Fruit {
    private static int cstOfAllApps = 0;
    private static int appleCntr = 0;
    private String appleColor;
    private String variety;
    private int appleCost;

    public Apple(int weight, String appleColor, String variety, int appleCost) {
        super(weight, appleCost);
        this.appleColor = appleColor;
        this.variety = variety;
        this.appleCost = appleCost;
        appleCntr++;
        cstOfAllApps += appleCost;
    }

    public static int getAppleCntr() {
        return appleCntr;
    }

    @Override
    public int getCostOfFrts() {
        return cstOfAllApps;
    }

    @Override
    public int getCost() {
        return getWeight() * appleCost;
    }

    @Override
    public String getFrstName() {
        return "Apples";
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getAppleCost() {
        return appleCost;
    }

    public void setAppleCost(int appleCost) {
        this.appleCost = appleCost;
    }
}
