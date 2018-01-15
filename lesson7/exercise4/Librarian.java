package lesson7.exercise4;


import java.util.Scanner;

public class Librarian {
    private User[] users;
    private Book[] books;

    public Librarian() {

    }

    public Librarian(Book[] books) {
        this.books = books;
    }

    public Librarian(User[] users, Book[] books) {
        this.users = users;
        this.books = books;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    /**
     * Метод, который добавляет пользователя
     *
     * @param sc
     */
    public void addUser(Scanner sc) {
        System.out.println("Write a first name:");
        String fn = sc.nextLine();
        System.out.println("Write a last name:");
        String ln = sc.nextLine();
        System.out.println("Write a patronymic:");
        String p = sc.nextLine();
        System.out.println("Write a date of birth(dd/mm/yyyy):");
        String bd = sc.nextLine();
        System.out.println("Write a phone number:");
        String pn = sc.nextLine();
        User newUser = new User(fn, ln, p, bd, pn, this);

        if (users == null) {
            users = new User[1];
            users[users.length - 1] = newUser;
        } else {
            User[] temp = users.clone();
            users = new User[temp.length + 1];
            System.arraycopy(temp, 0, users, 0, temp.length);
            users[users.length - 1] = newUser;
        }
    }

    /**
     * Показать пользователей библиотеки
     */
    public void showUsers() {
        if (users != null) {
            System.out.println("___________________________________________");
            for (User u :
                    users) {
                System.out.println("First name " + u.getFirstName() +
                        "\nLast name " + u.getLastName() +
                        "\nPatronymic " + u.getPatronymic() +
                        "\nNumber of reader's ticket " + u.getNumOfReadTicket() +
                        "\nDate of birth " + u.getDateOfBirth() +
                        "\nPhone number " + u.getPhoneNumber()
                        + "\n");
                System.out.println("Books:");
                if (u.getBooks()[0] != null) {
                    for (Book b :
                            u.getBooks()) {
                        System.out.println(b.getBookName());
                    }
                } else {
                    System.out.println("No books");
                }
                System.out.println("___________________________________________");
            }
        } else {
            System.out.println("No users");
        }
    }

    /**
     * Управление пользователями библиотеки
     * @param numOfTicket
     * @param sc
     */
    public void toManageUsers(int numOfTicket, Scanner sc) {
        if (users.length == 0) {
            System.out.println("No users");
        }
        if (numOfTicket - 1 < users.length) {
            System.out.println("Select item\n" +
                    "1. Give a book\n" +
                    "2. Return a book\n" +
                    "Write your choice, please(1-2):");
            sc.nextLine();
            switch (sc.nextLine()) {
                case "1":
                    System.out.println("What kind of book do you want?");
                    String s = sc.nextLine();
                    users[numOfTicket - 1].takeBook(s);
                    break;
                case "2":
                    System.out.println("What book do you want to return?");
                    users[numOfTicket - 1].returnBook(sc.nextLine());
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("User with ticket number " + numOfTicket + " does not exist");
        }
    }

    /**
     * Вспомогательный метод для проверки
     * на целое число
     */
    private static int checkForInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Write the integer, please!");
        }
        return sc.nextInt();

    }

    /**
     * Вспомогательный метод ищущий книгу в библиотеке
     * по объекту Book
     * @param book
     * @return
     */
    private Book findBook(Book book) {
        for (Book b :
                books) {
            if (book == b) {
                return b;
            }
        }
        return null;
    }

    /**
     * Вспомогательный метод ищущий книгу по её названию
     * @param name
     * @return
     */
    private Book findBook(String name) {
        for (Book b :
                books) {
            if (name.equals(b.getBookName())) {
                return b;
            }
        }
        return null;
    }

    /**
     * Дать книгу по её названию
     * @param name
     * @return
     */
    public Book giveBook(String name) {
        return findBook(name);
    }

    /**
     * Заьрать книгу по объекту Book
     * @param book
     * @return
     */
    public Book getBook(Book book) {
        return findBook(book);
    }

    public static void main(String[] args) {
        Librarian l = new Librarian(new Book[]{new Book("adventures of sherlock holmes and doctor watson", "arthur conan doyle", 325), new Book("adventures of sherlock holmes", "arthur conan doyle", 400), new Book("adventures of doctor watson", "arthur conan doyle", 300)});
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Select item\n" +
                    "1. Add a new user\n" +
                    "2. Show users\n" +
                    "3. User management\n" +
                    "4. Exit\n" +
                    "Write your choice, please(1-3):");
            switch (sc.nextLine()) {
                case "1":
                    boolean b = true;
                    while (b) {
                        l.addUser(sc);
                        System.out.println("Do you want to add a user?(y/n)");
                        if (!sc.nextLine().equals("y")) {
                            b = false;
                        }
                    }
                    break;
                case "2":
                    l.showUsers();
                    break;
                case "3":
                    System.out.println("Write the number of ticket");
                    l.toManageUsers(checkForInt(sc), sc);
                    break;
                case "4":
                    isContinue = false;
                    break;
                default:
                    System.out.println("You did not select anything");
                    break;
            }
        }
    }
}
