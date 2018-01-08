package lesson7.exercise4;

public class User {
    private String firstName;
    private String lastName;
    private String patronymic;
    private static int numOfTickets = 0;
    private int numOfReadTicket;
    private String dateOfBirth;
    private String phoneNumber;
    private int numOfBooks;
    private Book[] books;

    public User(String firstName, String lastName, String patronymic, String dateOfBirth, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        numOfBooks = 0;
        books = new Book[1];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }


    public int getNumOfReadTicket() {
        return numOfReadTicket;
    }

    public static void setNumOfTickets(int numOfTickets) {
        User.numOfTickets = numOfTickets;
    }

    private void addBook(Book newBook) {
        if (books.length == 1) {
            books[books.length - 1] = newBook;
        } else {
            Book[] temp = books.clone();
            books = new Book[temp.length + 1];
            System.arraycopy(temp, 0, books, 0, temp.length);
            books[books.length - 1] = newBook;
        }
    }

    private void takeBook(int count) {
        numOfBooks += count;
    }

    public void takeBook(String... namesOfBooks) {
        /**
         * The implementation will be soon
         */
    }

    public void takeBook(Book... books) {
        /**
         * The implementation will be soon
         */
    }

    public void returnBook(int numOfBooks) {
        /**
         * The implementation will be soon
         */
    }

    public void returnBook(String... namesOfBooks) {
        /**
         * The implementation will be soon
         */
    }

    public void returnBook(Book... books) {
        /**
         * The implementation will be soon
         */
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }


}
