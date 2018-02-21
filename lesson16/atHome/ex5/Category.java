package lesson16.atHome.ex5;

import java.util.*;

/**
 * Created by student on 11.02.2018.
 */
public class Category {
    private String name;
    private Set<Product> products;

    public Category() {
    }

    public Category(String name, Set<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void sort() {
        Collections.sort(new ArrayList<>(products),new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() - o2.getPrice() > 0) {
                    return 1;
                } else if (o1.getPrice() - o2.getPrice() < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void reverseSort() {
//        Collections.reverseOrder(new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                if (o1.getPrice() - o2.getPrice() > 0) {
//                    return 1;
//                } else if (o1.getPrice() - o2.getPrice() < 0) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
Collections.reverse(new LinkedList<>(products));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
