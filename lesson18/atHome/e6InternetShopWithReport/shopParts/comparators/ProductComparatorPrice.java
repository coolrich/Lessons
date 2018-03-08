package lesson18.atHome.e6InternetShopWithReport.shopParts.comparators;

import lesson18.atHome.e6InternetShopWithReport.shopParts.Product;

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
