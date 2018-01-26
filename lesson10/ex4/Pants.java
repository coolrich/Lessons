package lesson10.ex4;

public class Pants extends Clothing implements Women, Men {
    public Pants(ClothingSize clothingSize, int clothingCost, String color) {
        super(clothingSize, clothingCost, color);
    }

    @Override
    public void clotheAMan() {
        System.out.println("Wear a T-shirt for a man. Characteristics about men ");
        System.out.println(getClothingCost() + " " + getClothingSize() + " " + getColor());
    }

    @Override
    public void clotheAWoman() {
        System.out.println("Wear a T-shirt for a woman. Characteristics about women clothe:");
        System.out.println(getClothingCost() + " " + getClothingSize() + " " + getColor());
    }
}
