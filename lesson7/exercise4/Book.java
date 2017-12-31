package lesson7.exercise4;

public class Book {
    private String bookName;
    private String authorName;
    private int numOfPages;

    public Book(String bookName, String authorName, int numOfPages) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.numOfPages = numOfPages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
}
