package lesson10.ex4;

public class Skirt extends Clothing implements Women {
    public Skirt(ClothingSize clothingSize, int clothingCost, String color) {
        super(clothingSize, clothingCost, color);
    }

    @Override
    public void clotheAWoman() {
        System.out.println("Wear a T-shirt for a woman. Characteristics about this clothe:");
        System.out.println(getClothingCost()+" "+getClothingSize()+" "+getColor());
    }
}
