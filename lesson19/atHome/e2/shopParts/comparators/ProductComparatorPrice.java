package lesson19.atHome.e2.shopParts.comparators;

import lesson19.atHome.e2.shopParts.Product;

import java.util.Comparator;

/**
 * Created by student on 11.02.2018.
 */
public class ProductComparatorPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() - o2.getPrice() < 0) {
            return -1;
        } else if (o1.getPrice() - o2.getPrice() > 0) {
            return 1;
        }
        return 0;
    }
}
