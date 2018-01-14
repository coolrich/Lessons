package lesson7.exercise4;

import java.util.Objects;

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
    private Librarian librarian;

    public User(String firstName, String lastName, String patronymic, String dateOfBirth, String phoneNumber, Librarian librarian) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.librarian = librarian;
        numOfBooks = 0;
        numOfReadTicket=++numOfTickets;
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

    /**
     * Добавляет новую книгу
     * в коллекцию пользователя
     *
     * @param newBook
     */
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

    private void deleteBook(String name) {
        int i = 1;
        for (Book b :
                books) {
            if ((b.getBookName()).equals(name)) {
                books[i-1]=null;
                for (int j=i;j<books.length;j++){
                    books[j-1]=books[j];
                }
                Book[] temp=books.clone();
                books = new Book[books.length];
                for (int k=0;k<books.length;k++){
                    books[k]=temp[k];
                }
                break;
            }
            i++;
        }
    }

    /**
     * Метод для поиска книг в коллекции пользователя
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

    private Book findBook(String name) {
        if(books[0]!=null){
        for (Book b :
                books) {
            if (name.equals(b.getBookName())) {
                return b;
            }
        }
        }
        return null;
    }

    private void takeBook(int numOfBooks) {
        numOfBooks += numOfBooks;
    }

    public void takeBook(String... namesOfBooks) {
        for (String name :
                namesOfBooks) {
            Book b;
            if ((b = librarian.giveBook(name)) != null) {
                addBook(b);
            }else {
                System.out.println("No books with the same name");
            }
        }
    }

    public void takeBook(Book... books) {
        for (Book b :
                books) {
            if (librarian.getBook(b) != null) {
                addBook(b);
            }
        }
    }

    private void returnBook(int numOfBooks) {
        numOfBooks -= numOfBooks;
    }

    public void returnBook(String... namesOfBooks) {
        int numOfBooks=0;
        for (String name :
                namesOfBooks) {
            Book b;
            if ((b = findBook(name)) != null) {
                deleteBook(name);
                librarian.getBook(b);
                returnBook(numOfBooks);
            }else{
                System.out.println("No books with the same name");
            }
        }
    }

    public void returnBook(Book... books) {
        int numOfBooks=0;
        for (Book b :
                books) {
            if ((b = findBook(b)) != null) {
                deleteBook(b.getBookName());
                librarian.getBook(b);
                returnBook(numOfBooks);
            }
        }
    }

    public Book[] getBooks(){
        return books;
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
