package homework27.library.dao;

import homework27.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryImpl implements Library {

    //fields
    private List<Book> books;

    //constructor
    public LibraryImpl() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    @Override
    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}