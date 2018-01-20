package Lesson9.AtLesson.ex1;

/**
 * Created by Student on 17.01.2018.
 */
public class Circle extends Shape {
    private int x;
    private int y;

    public Circle(String c, int x, int y) {
        super(c);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
