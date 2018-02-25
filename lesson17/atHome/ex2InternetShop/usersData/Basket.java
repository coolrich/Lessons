package lesson17.atHome.ex2InternetShop.usersData;

import lesson17.atHome.ex2InternetShop.shopParts.Product;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> productList;

    public Basket() {
        productList = new ArrayList<>();
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(Product product){
        productList.remove(product);
    }
    public void showProducts(){
        productList.forEach(System.out::println);
    }
}
