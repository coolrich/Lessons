package lesson17.atHome.ex2InternetShop.shopParts.comparators;

import lesson17.atHome.ex2InternetShop.shopParts.Product;

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
