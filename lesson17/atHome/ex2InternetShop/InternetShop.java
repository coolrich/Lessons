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

    public boolean selectAndGetProductToBasket(String categoryName, int productId) {
        Product p = null;
        boolean b;
        if (categoryMap.get(categoryName) != null) {
            user.getBasket().addProductToProductsList(p = getProduct(categoryName, productId));
            b = true;
        } else {
            System.out.println("There is no " + productId);
            b = false;
        }
        return b;
    }

    private Product getProduct(String categoryName, int productId) {
        return categoryMap.get(categoryName).getProduct(productId);
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

    public void buyProduct(int id) {
        user.getBasket().buyProduct(id);
    }

    public void showBoughtProductsList() {
        user.getBasket().showBoughtProductsList();
    }
}
