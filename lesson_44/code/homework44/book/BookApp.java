package homework44.book;

import java.util.OptionalDouble;
import java.util.Set;

public class BookApp {

    public static void main(String[] args) {

        Set<Book> books = Set.of(
            new Book("Author A", "Title A", 2001, "Fiction", 15.5),
            new Book("Author B", "Title B", 1995, "Science", 22.0),
            new Book("Author C", "Title C", 2010, "Fiction", 18.5),
            new Book("Author D", "Title D", 2018, "History", 25.0)
        );

        // Отобразить все книги
        System.out.println("All books:");
        books.forEach(System.out::println);

        // Отобразить книги определенного жанра
        String genre = "Fiction";
        System.out.println("\nBooks of genre " + genre + ":");
        books.stream()
            .filter(book -> book.getGenre().equalsIgnoreCase(genre))
            .forEach(System.out::println);

        // Книги, изданные в заданном диапазоне лет
        int startYear = 2000;
        int endYear = 2015;
        System.out.println("\nBooks published between " + startYear + " and " + endYear + ":");
        books.stream()
            .filter(book -> book.getPublicationYear() >= startYear && book.getPublicationYear() <= endYear)
            .forEach(System.out::println);

        // Сортировка книг по стоимости
        System.out.println("\nBooks sorted by price:");
        books.stream()
            .sorted((b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()))
            .forEach(System.out::println);

        // Находим самую дорогую книгу
        Book mostExpensiveBook = books.stream()
            .max((b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()))
            .orElse(null);
        System.out.println("\nMost expensive book: " + mostExpensiveBook);

        // Средняя стоимость книг
        OptionalDouble averagePrice = books.stream()
            .mapToDouble(Book::getPrice)
            .average();
        System.out.println("\nAverage price of books: " + (averagePrice.isPresent() ? averagePrice.getAsDouble() : "N/A"));
    }
}