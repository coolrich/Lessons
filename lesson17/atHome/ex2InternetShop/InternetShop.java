package lesson17.atHome.ex2InternetShop;

import lesson17.atHome.ex2InternetShop.errorProcessing.WrongInputException;
import lesson17.atHome.ex2InternetShop.shopParts.Category;
import lesson17.atHome.ex2InternetShop.shopParts.Product;
import lesson17.atHome.ex2InternetShop.usersData.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InternetShop {
    private User user;
    private Map<String, Category> categoryMap;

    public InternetShop() {
        user = new User();
        categoryMap = new HashMap<>();
    }

    public InternetShop(User users) {
        this.user = users;
    }

    public static boolean registration(InternetShop is, String name, String password) {
        try {
            is.addUser(name, password);
        } catch (WrongInputException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean authorization(InternetShop is, String login, String password) {
        if (login != null && password != null && is.findUser(login, password)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean findUser(String name, String pswd) {
        return user.findUser(name, pswd);
    }

    public void addUser(String name, String pswd) throws WrongInputException {
        user.addUser(name, pswd);
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
        user.showBasket();
    }

    public boolean selectCategory(String categoryName) {
        Category category = categoryMap.get(categoryName);
        boolean b;
        if (category != null) {
            showCategory(categoryName);
            b = true;
        } else {
            b = false;
            System.out.println("There is no " + categoryName);
        }
        return b;
    }

    private void showCategory(String category) {
        for (Category c : categoryMap.values()) {
            if (c.getName().equals(category)) {
                System.out.println(c);
            }
        }

    }

    public boolean selectAndGetProductToBasket(String categoryName, String name) {
        Product p = null;
        boolean b;
        if (categoryMap.get(categoryName) != null) {
            user.getBasket().addProductToProductsList(p = getProduct(categoryName, name));
            b = true;
        } else {
            System.out.println("There is no " + name);
            b = false;
        }
        return b;
    }

    private Product getProduct(String categoryName, String name) {
        return categoryMap.get(categoryName).getProduct(name);
    }

    private Collection<Category> getCategory() {
        return categoryMap.values();
    }

    public void sortByPrice() {
        getCategory().forEach(Category::sortByPrice);
    }

    public void sortByName() {
        getCategory().forEach(Category::sortByName);
    }

    public void sortByRating() {
        getCategory().forEach(Category::sortByRating);
    }

    public void reverseSortByPrice() {
        getCategory().forEach(Category::reverseSortByPrice);
    }

    public void reverseSortByName() {
        getCategory().forEach(Category::reverseSortByName);
    }

    public void reverseSortByRating() {
        getCategory().forEach(Category::reverseSortByRating);
    }

    public void buyAll() {
        if(user.getCash()>=user.getTotalCost()){
            user.getBasket().buyAllProducts();
        }else{
            System.out.println("You don't have enough money!");
        }
    }

    public void buyProduct(String name) {
        user.getBasket().buyProduct(name);
    }

    public void showBoughtProductsList() {
        user.getBasket().showBoughtProductsList();
    }
}
