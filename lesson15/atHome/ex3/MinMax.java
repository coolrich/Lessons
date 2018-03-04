package lesson15.atHome.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax<T extends Number> {
    T[] elements;

    public MinMax(T[] elements) {
        this.elements = elements;
    }

    public static void main(String[] args) {
        MinMax<Number> numberFinder = new MinMax<>(new Number[]{5, 4, 6, 7, 3, 2.8, 8});
        System.out.println("Min: " + numberFinder.findMin() + "\nMax: " + numberFinder.findMax());
    }

    public T findMin() {
        List<T> els = new ArrayList<>(Arrays.asList(elements));
        els.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                Double v1 = o1.doubleValue(), v2 = o2.doubleValue();
                return v1 < v2 ? -1 : v1 == v2 ? 0 : 1;
            }
        });
        return els.get(0);
    }

    public T findMax() {
        List<T> els = new ArrayList<>(Arrays.asList(elements));
        els.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                Double v1 = o1.doubleValue(), v2 = o2.doubleValue();
                return v1 > v2 ? -1 : v1 == v2 ? 0 : 1;
            }
        });
        return els.get(0);
    }
}
