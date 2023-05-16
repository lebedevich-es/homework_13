package guru.qa;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    void addNewBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    void removeBook(Book book) {
        books.remove(book);
    }

    boolean searchBookByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

//    public boolean searchBook(String book) {
//        return books.contains(book);
//    }

    void printAllBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
