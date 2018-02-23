package lesson16.atLesson.ex5;

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

    public void sortByPrice() {
        List<Product> productList = new LinkedList<>(products);
        Collections.sort(productList, new ProductComparatorPrice());
        products = new LinkedHashSet<>(productList);
    }

    public void reverseSortByPrice() {
        List<Product> productList = new ArrayList<>(products);
        Collections.sort(productList, new ProductComparatorPrice());
        Collections.reverse(productList);
        products = new LinkedHashSet<>(productList);
    }

    public void sortByName() {
        List<Product> productList = new ArrayList<>(products);
        Collections.sort(productList, new ProductComparatorName());
        products = new LinkedHashSet<>(productList);
    }

    public void reverseSortByName() {
        List<Product> productList = new ArrayList<>(products);
        Collections.sort(productList, new ProductComparatorName());
        Collections.reverse(productList);
        products = new LinkedHashSet<>(productList);
    }

    public void sortByRating() {
        List<Product> productList = new ArrayList<>(products);
        Collections.sort(productList, new ProductComparatorRating());
        products = new LinkedHashSet<>(productList);
    }

    public void reverseSortByRating() {
        List<Product> productList = new ArrayList<>(products);
        Collections.sort(productList, new ProductComparatorRating());
        Collections.reverse(productList);
        products = new LinkedHashSet<>(productList);
    }
}
