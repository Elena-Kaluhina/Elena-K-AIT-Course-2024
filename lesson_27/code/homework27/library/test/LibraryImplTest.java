package homework27.library.test;

import homework27.library.*;
import homework27.library.dao.Library;
import homework27.library.dao.LibraryImpl;
import homework27.library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class LibraryImplTest {

    private Library library;

    @BeforeEach
    public void setUp() {
        library = new LibraryImpl();  // используем реализацию LibraryImpl
    }

    @Test
    public void testAddBook() {
        Book book = new Book("123AA", "Java Base", "Author A", 2020);
        library.addBook(book);
        assertEquals(book, library.findBookByIsbn("123AA"));
    }

    @Test
    public void testFindBooksByAuthor() {
        Book book1 = new Book("123AA", "Java Programming", "Author A", 2020);
        Book book2 = new Book("098BA", "Advanced Java", "Author A", 2021);
        library.addBook(book1);
        library.addBook(book2);
        List<Book> books = library.findBooksByAuthor("Author A");
        assertEquals(2, books.size());
    }

    @Test
    public void testRemoveBook() {
        Book book = new Book("123AA", "Java Base", "Author A", 2020);
        library.addBook(book);
        library.removeBook("123AA");
        assertNull(library.findBookByIsbn("123AA"));
    }
}
