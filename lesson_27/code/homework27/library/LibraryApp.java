package homework27.library;

import homework27.library.dao.Library;
import homework27.library.dao.LibraryImpl;
import homework27.library.model.Book;

public class LibraryApp {

    public static void main(String[] args) {

        Library library = new LibraryImpl();  // Используем интерфейс Library и реализацию LibraryImpl

        // добавляем книги
        library.addBook(new Book("123AA", "Java Base", "Author A", 2020));
        library.addBook(new Book("098BA", "Advanced Java", "Author A", 2021));
        library.addBook(new Book("111OP", "C++ Programming", "Author B", 2019));
        System.out.println("-------------------------------------");

        // печатаем все книги
        System.out.println("All books:");
        library.printAllBooks();
        System.out.println("-----------------------------------");

        // ищем книги по автору
        System.out.println("Books by Author A:");
        library.findBooksByAuthor("Author A").forEach(System.out::println);
        System.out.println("-----------------------------------");

        // удаляем книгу
        library.removeBook("1234567890");
        System.out.println("After removal:");
        library.printAllBooks();
    }
}
