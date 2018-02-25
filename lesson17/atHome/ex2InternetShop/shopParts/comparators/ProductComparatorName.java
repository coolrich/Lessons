package lesson17.atHome.ex2InternetShop.shopParts.comparators;

import lesson17.atHome.ex2InternetShop.shopParts.Product;

import java.util.Comparator;

/**
 * Created by student on 11.02.2018.
 */
public class  ProductComparatorName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
