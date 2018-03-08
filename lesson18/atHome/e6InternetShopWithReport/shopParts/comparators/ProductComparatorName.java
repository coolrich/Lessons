package lesson18.atHome.e6InternetShopWithReport.shopParts.comparators;

import lesson18.atHome.e6InternetShopWithReport.shopParts.Product;

import java.util.Comparator;

/**
 * Created by student on 11.02.2018.
 */
public class ProductComparatorName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
