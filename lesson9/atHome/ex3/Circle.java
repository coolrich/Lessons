package lesson9.atHome.ex3;

/**
 * Создать класс Circle, который содержит
 * - переменную radius;
 * - методы, вычисляющие площадь и длину окружности;
 * - константу PI.
 * Создать несколько объектов данного класса.
 */
public class Circle {
    public static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle c1, c2;
        c1 = new Circle(1234567890.0987654321);
        c2 = new Circle(9876543210.0123456789);
        System.out.println("c1:\nsquare: " + c1.getSquare() + "\nlength: " + c1.getLength() + "\nc2:\nsquare: " + c2.getSquare() + "\nlength: " + c2.getLength());

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return PI * radius * radius;
    }

    public double getLength() {
        return 2 * PI * radius;
    }
}
