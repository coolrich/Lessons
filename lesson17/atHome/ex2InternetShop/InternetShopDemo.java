package lesson17.atHome.ex2InternetShop;

import lesson17.atHome.ex2InternetShop.errorProcessing.WrongInputException;

import java.util.Scanner;

public class InternetShopDemo {
    public static boolean authorization(InternetShop is, String login, String password) {
        if (login != null && password != null && is.findUser(login, password)) {
            return true;
        } else {
            return false;
        }
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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        InternetShop is = new InternetShop();
        init(is);
        String lgn;
        String psswd;
        Init init;
        boolean isContinue = true;
        while (isContinue) {
            String choice = getChoice(s);
            switch (choice) {
                case "1":
                    do {
                        init = new Init(s).invoke();
                        lgn = init.getLgn();
                        psswd = init.getPsswd();
                        System.out.println("Try again");
                    } while (!registration(is, lgn, psswd));

                    System.out.println("Done");

                    break;
                case "2":
                    init = new Init(s).invoke();
                    lgn = init.getLgn();
                    psswd = init.getPsswd();
                    while (!authorization(is, lgn, psswd)) {
                        System.out.println("Try again");
                        lgn = init.getLgn();
                        psswd = init.getPsswd();
                    }
                    System.out.println("Done");
                    while (isContinue) {
                        System.out.println("Main menu:");
                        System.out.println("1. List of catalogs");
                        System.out.println("2. My basket");
                        System.out.println("3. Log out");
                        choice = s.nextLine();
                        switch (choice) {
                            case "1":
                                System.out.println("Categories:");
                                is.showCategoriesList();
                                System.out.println("Choose category(name):");
                                String categoryName = is.selectCategory(s.nextLine());
                                System.out.println("Choose product(name):");
                                String productName = s.nextLine();
                                is.selectAndGetProductToBasket(categoryName,productName);
                                break;
                            case "2":
                                is.showUserBasket();
                                break;
                            case "3":
                                isContinue = false;
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
            is.addUser("aaa", "aaaaaaa");
        } catch (WrongInputException e) {
            e.printStackTrace();
        }
        is.addCategory("Cloths");
        is.addCategory("Electronics");
        is.addCategory("Food");
        is.addProducts("Cloths","Dress", 1001.2, 4);
        is.addProducts("Cloths","Anorak", 1001.25, 5);
        is.addProducts("Cloths","T-Shirt", 1212.5, 5);
    }

    public static String getChoice(Scanner s) {
        String choice;
        System.out.println("Please, sign in or log in (1,2)");
        System.out.println("1. Sign in");
        System.out.println("2. Log in");
        System.out.println("3. Exit");
        String lgn, psswd;
        choice = s.nextLine();
        return choice;
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
            return this;
        }
    }
}
