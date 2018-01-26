package lesson10.ex4;

//купить подогнать
public class Atelier {
    public void clotheWoman(Clothing[] clothing) {
        for (Clothing c : clothing) {
            if (c instanceof Women) {
                ((Women) c).clotheAWoman();
            }
        }
    }

    public void clotheMan(Clothing[] clothing) {
        for (Clothing c : clothing) {
            if (c instanceof Men) {
                ((Men) c).clotheAMan();
            }
        }
    }

    public static void main(String[] args) {
        Clothing[] clothing = {new TShirt(ClothingSize.L, 15, "White"), new Pants(ClothingSize.M, 16, "White"), new Skirt(ClothingSize.XS, 17, "Black"), new Tie(ClothingSize.S, 18, "Black")};
        new Atelier().clotheMan(clothing);
        new Atelier().clotheWoman(clothing);
    }
}
