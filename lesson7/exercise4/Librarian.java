package lesson7.exercise4;


import java.util.Scanner;

public class Librarian {
    private User[] users;

    public Librarian() {

    }

    public Librarian(User[] users) {

        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

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
        User newUser = new User(fn, ln, p, bd, pn);

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
                        "\nPhone number " + u.getPhoneNumber() + "\n");
                System.out.println("___________________________________________");
            }
        } else {
            System.out.println("No users");
        }
    }

    public void toManageUsers(int numOfTicket, Scanner sc, Librarian l) {
        System.out.println("Select item\n" +
                "1. Add a book" +
                "2. Pick up a book" );
        switch (sc.nextLine()) {
            case "1":
                System.out.println("What kind of book do you want?");
                users[numOfTicket-1].takeBook(sc.nextLine());
                break;
            case "2":
                System.out.println("What book do you want to return?");
                users[numOfTicket-1].takeBook(sc.nextLine());
            default:
                break;
        }

    }

    public static void main(String[] args) {
        Librarian l = new Librarian();
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Select item\n" +
                    "1. Add a new user\n" +
                    "2. Show users\n" +
                    "3. User management" +
                    "4. Exit\n" +
                    "Write your choice, please(1-3): ");
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
                    checkForInt(sc);
                    l.toManageUsers(sc.nextInt(),sc,l);
                    break;
                case "4":
                    isContinue = false;

                default:
                    System.out.println("You did not select anything");
                    break;
            }
        }
    }

    private static void checkForInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Write the integer, please!");
        }
    }
}
