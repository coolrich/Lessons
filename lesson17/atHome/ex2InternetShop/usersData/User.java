package lesson17.atHome.ex2InternetShop.usersData;

import lesson17.atHome.ex2InternetShop.errorProcessing.WrongInputException;

import java.util.HashMap;
import java.util.Map;

public class User {
    private Map<String, String> userLoginPassword;
    private Basket basket;
    private int cash;

    public User() {
        cash = 2000;
        this.basket = new Basket();
        userLoginPassword = new HashMap<>();
    }

    public User(Map<String, String> usersData) {
        this.userLoginPassword = usersData;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Map<String, String> getUserLoginPassword() {
        return userLoginPassword;
    }

    public void setUserLoginPassword(Map<String, String> userLoginPassword) {
        this.userLoginPassword = userLoginPassword;
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
        userLoginPassword.put(login, password);
    }

    public boolean findUser(String lgn, String psswd) {
        if (userLoginPassword.keySet().contains(lgn) && userLoginPassword.values().contains(psswd)) {
            return true;
        } else {
            return false;
        }
    }

    public void showBasket() {
        basket.showProductList();
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getTotalCost() {
        return basket.getTotalCost();
    }

}
