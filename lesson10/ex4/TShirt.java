package lesson10.ex4;

public class TShirt extends Clothing implements Men, Women {
    public TShirt(ClothingSize clothingSize, int clothingCost, String color) {
        super(clothingSize, clothingCost, color);
    }

    @Override
    public void clotheAMan() {
        System.out.println("Wear a T-shirt for a man. Characteristics this men ");
        System.out.println(getClothingCost()+" "+getClothingSize()+" "+getColor());
    }

    @Override
    public void clotheAWoman() {
        System.out.println("Wear a T-shirt for a woman. Characteristics about this clothe:");
        System.out.println(getClothingCost()+" "+getClothingSize()+" "+getColor());
    }
}
