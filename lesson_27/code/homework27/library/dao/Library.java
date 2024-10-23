package homework27.library.dao;

import homework27.library.model.Book;
import java.util.List;

public interface Library {

    void addBook(Book book);

    Book findBookByIsbn(String isbn);

    List<Book> findBooksByAuthor(String author);

    void removeBook(String isbn);

    void printAllBooks();
}


