package model;

public class Book {
    private String id;
    private String nameBook;
    private String author;
    private String major;
    private String date;

    static int idBook = 1;
    public Book() {
    }

    public Book(String nameBook, String author, String major, String date) {
        this.id = String.format("%05d", idBook++);
        this.nameBook = nameBook;
        this.author = author;
        this.major = major;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", major='" + major + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
