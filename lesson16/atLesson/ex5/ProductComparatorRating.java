package lesson16.atLesson.ex5;

import java.util.Comparator;

public class ProductComparatorRating implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getRating() > o2.getRating()) {
            return 1;
        } else if (o1.getRating() < o2.getRating()) {
            return -1;
        }
        return 0;
    }
}
