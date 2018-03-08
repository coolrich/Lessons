package lesson20.atHome.e2.shopParts.comparators;

import lesson20.atHome.e2.shopParts.Product;

import java.util.Comparator;

public class ProductComparatorRating implements Comparator<Product> {

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
