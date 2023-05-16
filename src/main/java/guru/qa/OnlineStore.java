package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class OnlineStore {

    Map<String, Book> books = new HashMap<>();

    void addNewBook(String link, Book book) {
        books.put(link, book);
    }

    void removeBook(String link) {
        books.remove(link);
    }

    boolean searchBookByTitle(String title) {
        for(Map.Entry<String, Book> book : books.entrySet()){
            if (book.getValue().getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    void printAllBooks() {
        System.out.println("Books in the Online Store:");
        for (Book book : books.values()) {
            System.out.println(book.getTitle());
        }
    }
}
