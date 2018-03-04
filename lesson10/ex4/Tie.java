package lesson10.ex4;

public class Tie extends Clothing implements Men {
    public Tie(ClothingSize clothingSize, int clothingCost, String color) {
        super(clothingSize, clothingCost, color);
    }

    @Override
    public void clotheAMan() {
        System.out.println("Wear a T-shirt for a man. Characteristics this men ");
        System.out.println(getClothingCost() + " " + getClothingSize() + " " + getColor());
    }
}
