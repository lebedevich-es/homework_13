package guru.qa;

import java.util.Iterator;
import java.util.LinkedList;

public class PrivateLibrary {

    LinkedList<Book> books = new LinkedList<>();

    void addNewBook(Book book) {
        books.add(book);
    }

    void removeBook(Book book) {
        books.remove(book);
    }

    boolean searchBookByTitle(String title) {
        Iterator<Book> iterator = books.iterator();
        do {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                return true;
            }
        } while (iterator.hasNext());
        return false;
    }

    void printAllBooks() {
        System.out.println("Books in the Private Library:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
