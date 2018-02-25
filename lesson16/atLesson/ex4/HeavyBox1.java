package lesson16.atLesson.ex4;

import java.util.Set;
import java.util.TreeSet;

public class HeavyBox1 extends Box6 implements Comparable<HeavyBox1> {
    private int weight;

    public HeavyBox1(int width, int height, int depth, int aWeight) {
        super(width, height, depth);
        weight = aWeight;
    }

    public HeavyBox1() {
        weight = -1;
    }

    public static void main(String[] args) {
        Set<HeavyBox1> set = new TreeSet<>();
        set.add(new HeavyBox1(2, 2, 2, 2));
        set.add(new HeavyBox1(3, 3, 3, 3));
        set.add(new HeavyBox1(3, 3, 3, 3));
        set.add(new HeavyBox1(3, 3, 3, 3));
        System.out.println(set);
    }

    @Override
    public int compareTo(HeavyBox1 o) {
        return getWeight() - o.getWeight();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox1{" +
                "weight=" + weight +
                '}';
    }
}
