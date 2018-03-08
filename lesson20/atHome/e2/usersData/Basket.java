package lesson20.atHome.e2.usersData;

import lesson20.atHome.e2.shopParts.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Basket implements Serializable {
    private List<Product> productList;
    private List<Product> boughtProductsList;

    public Basket() {
        productList = new ArrayList<>();
        boughtProductsList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<Product> getBoughtProductsList() {
        return boughtProductsList;
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
        for (Product p : productList) {
            total += p.getPrice();
        }
        return total;
    }
}
