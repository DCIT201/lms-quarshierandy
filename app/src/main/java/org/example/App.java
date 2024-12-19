/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        Patron sponsor = new Patron("Randy");
        System.out.println("Patron Name: " + sponsor.getName());

        library lib = new library();

        lib.attachBook(new Book("Jane Eyre", "Charlotte Bronte", 2000));
        lib.attachBook(new Book("The Notebook","Nicholas Sparks",2010));
        lib.attachBook(new Book("A Second Chance","Ellen Wolf",2004));
        lib.attachBook(new Book("Reckless","Selena Montgomery",2006));
        lib.attachBook(new Book("Suprise Heir for the Princess","Kate Hardy", 2000));

    }
}
