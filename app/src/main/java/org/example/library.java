package org.example;
import java.util.List;
import java.util.ArrayList;

public class library {
    private List<Book> books;

    public library() {
        books = new ArrayList<>();
    }
    public void attachBook(Book book) {
        books.add(book);
        System.out.println("Attached Book: " + book.getTitle());
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Removed Book: " + book.getTitle());
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getAuthor() + " - " + book.getYearPublished());
        }
    }

}
