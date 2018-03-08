package lesson18.atHome.e6InternetShopWithReport.shopParts;

import lesson18.atHome.e6InternetShopWithReport.shopParts.comparators.ProductComparatorName;
import lesson18.atHome.e6InternetShopWithReport.shopParts.comparators.ProductComparatorPrice;
import lesson18.atHome.e6InternetShopWithReport.shopParts.comparators.ProductComparatorRating;

import java.util.*;

/**
 * Created by student on 11.02.2018.
 */
public class Category {
    private String name;
    private Set<Product> products;
    private List<Product> listOfProducts;

    public Category() {
        listOfProducts = new ArrayList<>();
        products = new HashSet<>();
    }

    public Category(String name) {
        this();
        this.name = name;
    }

    public Category(String name, Set<Product> products) {
        this(name);
        this.products = products;
        listOfProducts.addAll(products);
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

    private int numOfProducts(Product p) {
        return Collections.frequency(listOfProducts, p);
    }

    public boolean isContains(Product p) {
        return numOfProducts(p) > 0;
    }

    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name) && isContains(p)) {
                return p;
            }
        }
        return null;
    }

    public void addProduct(String name, double price, int rating) {
        Product p = new Product(name, price, rating);
        products.add(p);
        listOfProducts.add(p);
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

    @Override
    public String toString() {
        return "Category: " + name + "\n" +
                "Products: \n" + products;
    }
}
