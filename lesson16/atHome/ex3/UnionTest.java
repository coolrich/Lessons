package lesson16.atHome.ex3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Напишите методы union(Set<?>... set) и intersect(Set<?> ... set),
 * реализующих операции объединения и пересечения множеств. Протестируйте
 * работу этих методов на предварительно заполненных множествах.
 */
public class UnionTest {
    public static <T> void union(Set<? extends T>... set) {
        Set<T> union = new HashSet<>();
        for (Set<?> t : set) {
            union.addAll((Collection<? extends T>) t);
        }
        System.out.print("Union of sets: ");
        for (T t : union) {
            System.out.print(t + " ");
        }
    }

    public static <T> void intersect(Set<?>... set) {
        Set<T> intersect = new HashSet<>((Collection<? extends T>) Arrays.asList(set[0]));

        for (Set<?> t : set) {
            set[0].retainAll(t);
        }
        System.out.print("intersect of sets: ");
        for (Object t : set[0]) {
            System.out.print(" " + t);
        }
    }

    public static void main(String[] args) {
        union(new HashSet<String>(Arrays.asList("a", "b", "c", "d")), new HashSet<String>(Arrays.asList("c", "d", "e", "f")));
        System.out.println();
        intersect(new HashSet<String>(Arrays.asList("a", "b", "c", "d")), new HashSet<String>(Arrays.asList("c", "d", "e", "f")), new HashSet<String>(Arrays.asList("e", "f", "c", "d", "g", "h")));
    }
}
