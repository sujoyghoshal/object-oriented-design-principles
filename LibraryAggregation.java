import java.util.ArrayList;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBook();
        }
    }
}

public class LibraryAggregation {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Effective Java", "Joshua Bloch");

        Library library = new Library("City Library");
        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}
