package fr.tenji.java;

/**
 * Created by nekran on 20/10/16.
 */
public abstract class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        author = author;
    }

    public abstract void display();
}
