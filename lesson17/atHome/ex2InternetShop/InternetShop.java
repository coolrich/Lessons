package lesson17.atHome.ex2InternetShop;

import lesson17.atHome.ex2InternetShop.errorProcessing.WrongInputException;
import lesson17.atHome.ex2InternetShop.shopParts.Category;
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

    public Map<String, String> getMapUsers() {
        return users.getUserLoginPassword();
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

    public void addProducts(String categoryName, String newProductName, int price, int rating) {
        categoryMap.get(categoryName).addProduct(newProductName, price, rating);
    }
    public void showCategoriesList(){
        categoryMap.keySet().forEach(System.out::println);
    }
    public void showUserBasket(){
        users.showBasket();
    }

}
