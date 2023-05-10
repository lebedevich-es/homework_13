package guru.qa;

import java.util.HashSet;
import java.util.Set;

public class BookStore {

    Set<Book> books = new HashSet<>();

    void addNewBook(Book book) {
        books.add(book);
    }

    void removeBook(Book book) {
        books.remove(book);
    }

    boolean searchBookByTitle(String title) {
        int i = 0;
        while (i < books.size()) {
            if (books.contains(title)) {
                return true;
            }
            i++;
        }
        return false;
    }

    void printAllBooks() {
        System.out.println("Books in the Bookstore:");
        for (Book book : books) {
            System.out.println(book.isTitle());
        }
    }
}
