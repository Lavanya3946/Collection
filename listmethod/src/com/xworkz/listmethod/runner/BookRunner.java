package com.xworkz.listmethod.runner;

import com.xworkz.listmethod.internal.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class BookRunner {


    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        // Adding books at specific indices
        books.add(0, new Book("The Catcher in the Rye", "J.D. Salinger"));
        books.add(1, new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(2, new Book("1984", "George Orwell"));
        books.add(3, new Book("Moby-Dick", "Herman Melville"));
        System.out.println("Books after adding elements: " + books);

        // Adding a list of books at a specific index
        List<Book> newBooks = Arrays.asList(new Book("The Great Gatsby", "F. Scott Fitzgerald"),
                new Book("War and Peace", "Leo Tolstoy"));
        books.addAll(2, newBooks);
        System.out.println("Books after adding all new books: " + books);

        // Removing a book at a specific index
        Book removedBook = books.remove(3);
        System.out.println("Removed book: " + removedBook);
        System.out.println("Books after removal: " + books);

        // Setting a book at a specific index
        Book replacedBook = books.set(2, new Book("Pride and Prejudice", "Jane Austen"));
        System.out.println("Replaced book: " + replacedBook);
        System.out.println("Books after setting a new book: " + books);

        // Getting a book at a specific index
        Book book = books.get(1);
        System.out.println("Book at index 1: " + book);

        // Finding the index of a book
        int index = books.indexOf(new Book("The Catcher in the Rye", "J.D. Salinger"));
        System.out.println("Index of 'The Catcher in the Rye': " + index);

        // Finding the last index of a book
        int lastIndex = books.lastIndexOf(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        System.out.println("Last index of 'The Great Gatsby': " + lastIndex);

        // Getting a sublist of books
        List<Book> subList = books.subList(1, 3);
        System.out.println("Sublist of books: " + subList);

        // Using a list iterator
        ListIterator<Book> listIterator = books.listIterator();
        System.out.println("Iterating with ListIterator:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Printing the final state of the collection
        System.out.println("Final book collection: " + books);
    }
}


