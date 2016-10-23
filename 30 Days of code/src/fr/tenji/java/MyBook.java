package fr.tenji.java;

/**
 * Created by nekran on 20/10/16.
 */
public class MyBook extends Book {
    protected double price;

    public MyBook(String title, String author, double price) {
        super(title, author);
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + this.title +
        "\nAuthor: " + this.author +
        "\nPrice: " + (int)this.price);
    }
}
