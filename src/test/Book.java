package test;

public class Book {
    String title;
    Author author;
    double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author.toString() + "\nPrice: " + price;
    }
}
