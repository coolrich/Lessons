package lesson16.atLesson.ex7;

import lesson16.atLesson.ex4.Box6;
import lesson16.atLesson.ex4.HeavyBox1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterDemo {
    public static void main(String[] args) {
        List<HeavyBox1> heavyBox1List = new ArrayList<>();
        heavyBox1List.add(new HeavyBox1(2, 2, 2, 2));
        heavyBox1List.add(new HeavyBox1(2, 2, 2, 2));
        heavyBox1List.add(new HeavyBox1(3, 3, 3, 3));
        System.out.println(heavyBox1List);
        System.out.println();
        System.out.println(getBigBoxes(heavyBox1List));
    }

    public static List<Box6> getBigBoxes(List<HeavyBox1> box1List) {
        Iterator<HeavyBox1> iterator = box1List.iterator();
        List<Box6> result = new ArrayList<>();
        while (iterator.hasNext()) {
            HeavyBox1 heavyBox1 = iterator.next();
            if (heavyBox1.getWeight() > 2) {
                iterator.remove();
                result.add(heavyBox1);
            }
        }
        return result;
    }
}
