package lesson17.atHome.ex2InternetShop;

import lesson17.atHome.ex2InternetShop.errorProcessing.WrongInputException;

import java.util.Scanner;

public class InternetShopDemo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        InternetShop is = new InternetShop();
        init(is);
        String lgn;
        String psswd;
        Init init;
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Please, enter the number:");
            System.out.println("1. Sign in");
            System.out.println("2. Log in");
            System.out.println("3. Exit");
            String choice = s.nextLine();
            switch (choice) {
                case "1":
                    do {
                        init = new Init(s).invoke();
                        lgn = init.getLgn();
                        psswd = init.getPsswd();
                        System.out.println("Try again");
                    } while (!InternetShop.registration(is, lgn, psswd));

                    System.out.println("Done");

                    break;
                case "2":
                    boolean b;
                    do {
                        init = new Init(s).invoke();
                        lgn = init.getLgn();
                        psswd = init.getPsswd();
                        b = !is.authorization(lgn, psswd);
                        System.out.print(b ? "Try again\n" : "");
                    } while (b);
                    System.out.println("Done");
                    while (isContinue) {
                        System.out.println("Main menu");
                        System.out.println("1. List of catalogs");
                        System.out.println("2. My basket");
                        System.out.println("3. Log out");
                        System.out.println("4. Show bought products");
                        System.out.println("5. Sorting of products");
                        System.out.print("number:");
                        choice = s.nextLine();
                        switch (choice) {
                            case "1":
                                System.out.println("Categories of products:");
                                is.showCategoriesList();
                                System.out.println("Enter the name of category:");
                                String categoryName;
                                do {
                                    categoryName = s.nextLine();
                                    System.out.println("Choose category(name):");
                                } while (!is.selectCategory(categoryName));
                                String productName;
                                do {
                                    System.out.println("Choose product(name):");
                                    productName = s.nextLine();
                                } while (!is.selectAndPutProductToBasket(categoryName, productName));
                                break;
                            case "2":
                                is.showUserBasket();
                                System.out.println("1. Buy all products");
                                System.out.println("2. Buy product");
                                System.out.println("3. Back");
                                choice = s.nextLine();
                                switch (choice) {
                                    case "1":
                                        is.buyAll();
                                        break;
                                    case "2":
                                        System.out.println("Product's id:");
                                        is.buyProduct(s.nextLine());
                                        break;
                                    case "3":
                                        break;
                                }
                                break;
                            case "3":
                                isContinue = false;
                                break;
                            case "4":
                                is.showBoughtProductsList();
                                s.nextLine();
                                break;
                            case "5":
                                System.out.println("How do you want to sort products?");
                                System.out.println("1. Sort by price");
                                System.out.println("2. Sort by name");
                                System.out.println("3. Sort by rating");
                                System.out.println("4. Reverse sort by price");
                                System.out.println("5. Reverse sort by name");
                                System.out.println("6. Reverse sort by rating");
                                System.out.print("number:");
                                choice = s.nextLine();
                                switch (choice) {
                                    case "1":
                                        is.sortByPrice();
                                        break;
                                    case "2":
                                        is.sortByName();
                                        break;
                                    case "3":
                                        is.sortByRating();
                                        break;
                                    case "4":
                                        is.reverseSortByPrice();
                                        break;
                                    case "5":
                                        is.reverseSortByName();

                                        break;
                                    case "6":
                                        is.reverseSortByRating();
                                        break;
                                }
                                break;
                        }
                    }
                    isContinue = true;
                    break;
                case "3":
                    isContinue = false;
                    System.out.println("Good-bye");
                    break;
                default:
                    System.out.println("Please, make a choice again");
                    break;
            }
        }
    }

    public static void init(InternetShop is) {
        try {
            is.addUser("admin", "very complex");
        } catch (WrongInputException e) {
            e.printStackTrace();
        }
        is.addCategory("Cloths");
        is.addCategory("Electronics");
        is.addCategory("Food");
        is.addProducts("Cloths", "Dress", 1001.2, 4);
        is.addProducts("Cloths", "Anorak", 1001.25, 5);
        is.addProducts("Cloths", "T-Shirt", 1212.5, 5);
    }

    private static class Init {
        private Scanner s;
        private String lgn;
        private String psswd;

        public Init(Scanner s) {
            this.s = s;
        }

        public String getLgn() {
            return lgn;
        }

        public String getPsswd() {
            return psswd;
        }

        public Init invoke() {
            System.out.print("Login: ");
            lgn = s.nextLine();
            System.out.print("Password: ");
            psswd = s.nextLine();
            s = new Scanner(System.in);
            return this;
        }
    }
}
