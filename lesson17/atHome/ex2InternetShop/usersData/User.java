package lesson17.atHome.ex2InternetShop.usersData;

public class User {
    private String name;
    private String psswd;
    private Basket basket;
    private int cash;

    public User() {
        cash = 2000;
        this.basket = new Basket();
    }

    public User(String name, String psswd) {
        this();
        this.name = name;
        this.psswd = psswd;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsswd() {
        return psswd;
    }

    public void setPsswd(String psswd) {
        this.psswd = psswd;
    }
}
