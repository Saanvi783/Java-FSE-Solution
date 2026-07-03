/*
QUESTION:
Exercise 6: Library Management System
Scenario: Develop a search function for a library system to find books by title using linear and binary search algorithms.
Instructions:
1. Define a Book class with bookId, title, author.
2. Implement Linear Search and Binary Search by title.
*/

import java.util.Arrays;
import java.util.Comparator;

class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + author;
    }
}

public class Exercise6_LibraryManagementSystem_Solution {
    public static Book linearSearchByTitle(Book[] books, String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) return b;
        }
        return null;
    }

    public static Book binarySearchByTitle(Book[] books, String title) {
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = title.compareToIgnoreCase(books[mid].title);
            if (res == 0) return books[mid];
            if (res > 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Clean Code", "Robert Martin"),
            new Book(2, "Design Patterns", "Erich Gamma"),
            new Book(3, "Effective Java", "Joshua Bloch")
        };
        Arrays.sort(books, Comparator.comparing(b -> b.title));
        System.out.println("Found: " + binarySearchByTitle(books, "Effective Java"));
    }
}
