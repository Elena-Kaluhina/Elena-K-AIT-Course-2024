package classwork24.book_library.test;

import classwork24.book_library.controller.Library;
import classwork24.book_library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library;

    Book[] books;
    int size = 0;

    @BeforeEach
    void setUp() {

        library = new Library(5);

        books = new Book[5];

        books[0] = new Book("1984", "Oruell", 1_111_111_111_110L, 2010);
        books[1] = new Book("T1", "A1", 1_111_111_111_111L, 2011);
        books[2] = new Book("T2", "A2", 1_111_111_111_112L, 2009);
        books[3] = new Book("T3", "A3", 1_111_111_111_113L, 2005);

        // TODO
        //положить объекты в массив, который "внутри" объекта library
        for (int i = 0; i < books.length; i++) {//пока только 4 книги кладём в library
            library.addBook(books[i]);
        }

    }


    //method addBook is: boolean (true, false)
    //- не добавлять null
    //- не добавлять дубликат
    //- не добавлять больше, чем может вместить в себя библиотека.
    @Test
    void addBookTest(){
        // - не добавлять null
        assertFalse(library.addBook(null));

        //- не добавлять дубликат
        assertFalse(library.addBook(books[0]));

        // добавляем ещё одну новую книгу
        Book newBook = new Book("T4", "A4", 1_111_111_111_114L, 2924);
        assertTrue(library.addBook(newBook));
        assertEquals(5, library.size());

        //добавляем ещё одну сверх capacity
        Book oneMoreBook = new Book("T5", "A5", 1_111_111_111_115L, 2924);
        assertFalse(library.addBook(oneMoreBook));
    }


    @Test
    void findBookTest(){
        Book foundBook = library.findBook(1_111_111_111_110L);
        assertEquals( books[0], library.findBook(1_111_111_111_110L)); // find existed book
        assertNull(library.findBook(1_111_111_111_119L)); // find absent book
        //

    }


    @Test
    void removeBookTest(){
        //remove existed book
        assertEquals(books[0], library.removeBook(1_111_111_111_110L));
        assertEquals(3, library.size());
        //remove absent book
        assertNull(library.removeBook(1_111_111_111_119L));

    }


    @Test
    void sizeTest(){
        assertEquals(4, library.size());
    }


    @Test
    void printBookTest(){
        System.out.println("======================================");
        library.printBooks();
    }





}
