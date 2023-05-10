package guru.qa;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("title1", "author1", 2020);
        Book book2 = new Book("title2", "author2", 2021);
        Book book3 = new Book("title3", "author3", 1999);
        Book book4 = new Book("title4", "author4", 2010);

        Library library = new Library();

        library.addNewBook(book1);
        library.addNewBook(book2);
        library.addNewBook(book3);

        library.removeBook(book2);

        library.printAllBooks();

        System.out.println("Search in the Library: " + library.searchBookByTitle(book3.isTitle()));


        BookStore bookStore = new BookStore();

        bookStore.addNewBook(book1);
        bookStore.addNewBook(book2);
        bookStore.addNewBook(book2);

        bookStore.removeBook(book2);

        bookStore.printAllBooks();

        System.out.println("Search in the Bookstore: " + bookStore.searchBookByTitle(book1.isTitle()));


        PrivateLibrary privateLibrary = new PrivateLibrary();

        privateLibrary.addNewBook(book2);
        privateLibrary.addNewBook(book3);
        privateLibrary.addNewBook(book4);

        privateLibrary.removeBook(book3);

        privateLibrary.printAllBooks();

        System.out.println("Search in the Private Library: " + privateLibrary.searchBookByTitle(book3.isTitle()));


        OnlineStore onlineStore = new OnlineStore();

        onlineStore.addNewBook("link1", book1);
        onlineStore.addNewBook("link1", book2);
        onlineStore.addNewBook("link4", book4);

        onlineStore.removeBook("link1");

        onlineStore.printAllBooks();

        System.out.println("Search in the Online Store: " + onlineStore.searchBookByTitle(book4.isTitle()));
    }
}