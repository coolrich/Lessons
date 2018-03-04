package lesson9.atLesson.ex1;

/**
 * Created by Student on 17.01.2018.
 */
public abstract class Shape {
    protected String color;

    public Shape(String c) {
        color = c;
    }

    public static void main(String[] args) {
        Shape[] shapes = {new Circle("Blue", 0, 0), new Rectangle("White", 0, 0, 1, 1)};
        for (Shape s : shapes) {
            s.draw();
            System.out.println(s.hashCode());
            System.out.println(s);
        }
    }

    public abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;

        Shape shape = (Shape) o;

        return getColor() != null ? getColor().equals(shape.getColor()) : shape.getColor() == null;
    }

    @Override
    public int hashCode() {
        return getColor() != null ? getColor().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
