package lesson10.ex4;

public abstract class Clothing {
    private ClothingSize clothingSize;
    private int clothingCost;
    private String color;

    public Clothing(ClothingSize clothingSize, int clothingCost, String color) {
        this.clothingSize = clothingSize;
        this.clothingCost = clothingCost;
        this.color = color;
    }

    public ClothingSize getClothingSize() {
        return clothingSize;
    }

    public void setClothingSize(ClothingSize clothingSize) {
        this.clothingSize = clothingSize;
    }

    public int getClothingCost() {
        return clothingCost;
    }

    public void setClothingCost(int clothingCost) {
        this.clothingCost = clothingCost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
