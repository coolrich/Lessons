package lesson7.onTheLesson;

/**
 * Created by student on 27.12.2017.
 */
public class Car {
    private int weight;
    private String color;

    public Car() {
        weight = 1000;
        color = "Red";
    }

    public Car(int aWeight, String aColor) {
        weight = aWeight;
        color = aColor;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        new Car().getWeight();
        new Car().getColor();
    }

}
