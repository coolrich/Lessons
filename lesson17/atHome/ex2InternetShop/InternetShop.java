package lesson17.atHome.ex2InternetShop;

import lesson17.atHome.ex2InternetShop.errorProcessing.WrongInputException;
import lesson17.atHome.ex2InternetShop.shopParts.Category;
import lesson17.atHome.ex2InternetShop.shopParts.Product;
import lesson17.atHome.ex2InternetShop.usersData.User;

import java.util.HashMap;
import java.util.Map;

public class InternetShop {
    private User users;
    private Map<String, Category> categoryMap;

    public InternetShop() {
        users = new User();
        categoryMap = new HashMap<>();
    }

    public InternetShop(User users) {
        this.users = users;
    }

    public boolean findUser(String name, String pswd) {
        return users.findUser(name, pswd);
    }

    public void addUser(String name, String pswd) throws WrongInputException {
        users.addUser(name, pswd);
    }

    public void addCategory(String categoryName) {
        categoryMap.put(categoryName, new Category(categoryName));
    }

    public void addProducts(String categoryName, String newProductName, double price, int rating) {
        Category category = categoryMap.get(categoryName);
        if (category != null) {
            categoryMap.get(categoryName).addProduct(newProductName, price, rating);
        } else {
            System.out.println("There is no " + categoryName);
        }
    }

    public void showCategoriesList() {
        categoryMap.keySet().forEach(System.out::println);
    }

    public void showUserBasket() {
        users.showBasket();
    }

    public String selectCategory(String categoryName) {
        Category category = categoryMap.get(categoryName);
        if (category != null) {
            showCategory(categoryName);
        } else {
            System.out.println("There is no " + categoryName);
        }
        return categoryName;
    }

    private void showCategory(String category) {
        categoryMap.values().forEach(System.out::println);
    }

    public void selectAndGetProductToBasket(String categoryName, String productName) {
        if (categoryMap.get(categoryName) != null) {
            users.getBasket().addProduct(getProduct(categoryName,productName ));
        } else {
            System.out.println("There is no " + productName);
        }
    }
    private Product getProduct(String categoryName,String productName){
        return categoryMap.get(categoryName).getProduct(productName);
    }
}
