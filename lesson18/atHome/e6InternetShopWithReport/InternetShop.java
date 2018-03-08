package lesson18.atHome.e6InternetShopWithReport;

import lesson18.atHome.e6InternetShopWithReport.errorProcessing.WrongInputException;
import lesson18.atHome.e6InternetShopWithReport.shopParts.Category;
import lesson18.atHome.e6InternetShopWithReport.shopParts.Product;
import lesson18.atHome.e6InternetShopWithReport.usersData.User;

import java.util.*;

public class InternetShop {
    private static List<User> users;
    private User currentUser;
    private Map<String, Category> categoryMap;

    public InternetShop() {
        categoryMap = new HashMap<>();
        users = new ArrayList<>();
        currentUser = new User();
    }

    public InternetShop(User user) {
        this();
        this.users.add(user);
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

    public boolean authorization(String login, String password) {
        if (login != null && password != null && findUser(login, password) != null) {
            currentUser.setName(login);
            currentUser.setPsswd(password);
            return true;
        } else {
            return false;
        }
    }

    public User findUser(String name, String psswd) {
        for (User u : users) {
            if (u.getName().equals(name) && u.getPsswd().equals(psswd)) {
                return u;
            }
        }
        return null;
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
        currentUser.showBasket();
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

    public boolean selectAndPutProductToBasket(String categoryName, String name) {
        Product p = null;
        boolean b;
        if (categoryMap.get(categoryName) != null) {
            currentUser.getBasket().addProductToProductsList(p = getProduct(categoryName, name));
            b = true;
        } else {
            System.out.println("There is no " + name);
            b = false;
        }
        return b;
    }

    public void addUser(String login, String password) throws WrongInputException {
        if (login.length() < 3 && password.length() < 7) {
            throw new WrongInputException("Wrong login and password.\nLogin needs 3 or more characters\nand password needs 7 or more characters");
        }
        if (login.length() < 3) {
            throw new WrongInputException("Wrong login, it needs 3 or more characters");
        }
        if (password.length() < 7) {
            throw new WrongInputException("Wrong password, it needs 7 or more characters");
        }
        users.add(new User(login, password));
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
        if (currentUser.getCash() >= currentUser.getTotalCost()) {
            currentUser.getBasket().buyAllProducts();
        } else {
            System.out.println("You don't have enough money!");
        }
    }

    public void buyProduct(String name) {
        currentUser.getBasket().buyProduct(name);
    }

    public void showBoughtProductsList() {
        currentUser.getBasket().showBoughtProductsList();
    }

    public void createReport() {
        currentUser.writeReport();
    }
}
