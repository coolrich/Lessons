package lesson17.atHome.ex2InternetShop.usersData;

import lesson17.atHome.ex2InternetShop.shopParts.Product;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> productList;
    private List<Product> boughtProductsList;

    public Basket() {
        productList = new ArrayList<>();
        boughtProductsList = new ArrayList<>();
    }

    public void addProductToProductsList(Product product) {
        productList.add(product);
    }

    public void removeProductsFromProductsList(Product product) {
        productList.remove(product);
    }

    public void showProductList() {
        productList.forEach(System.out::print);
    }

    public void showBoughtProductsList() {
        boughtProductsList.forEach(System.out::print);
    }

    public void buyProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            Product thisProduct = productList.get(i);
            if (thisProduct.getName() == name) {
                boughtProductsList.add(thisProduct);
                productList.remove(thisProduct);
            }
        }
    }

    public void buyAllProducts() {
        int size = productList.size();
        for (int i = 0; i < size; i++) {
            boughtProductsList.add(productList.get(i));
        }
        productList.clear();
    }

    public int getTotalCost() {
        int total = 0;
//        int total = productList.stream().mapToInt(product -> (int) product.getPrice()).sum();
        for (Product p : productList) {
            total += p.getPrice();
        }
        return total;
    }
}
