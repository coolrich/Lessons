package lesson17.atLesson;

/**
 * Created by student on 18.02.2018.
 */
public class Toy {
    private String name;
    private double cost;

    public Toy() {
    }

    public Toy(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toy toy = (Toy) o;

        if (Double.compare(toy.getCost(), getCost()) != 0) return false;
        return getName() != null ? getName().equals(toy.getName()) : toy.getName() == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getCost());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
