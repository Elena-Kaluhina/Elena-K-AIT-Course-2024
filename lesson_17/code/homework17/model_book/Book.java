package homework17.model_book;
/*
 Создайте класс Book с полями:
- уникальный номер ISBN
- название title
- автор author
- год издания yearOfPublishing
- жанр genre
В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display,
который выводит информацию о книге. Создайте конструктор, в котором нет поля ISBN.
Создайте конструктор, в котором есть только поля title, author и genre.
 */

public class Book {

    //fields
    private String ISBN;
    private String title;
    private String author;
    private int yearOfPublishing;
    private String genre;

    //constructor without ISBN
    public Book(String title, String author, int yearOfPublishing, String genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    //constructor with fields only title, author, genre
    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    //getters and setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //method display
    public void display(){
        System.out.println("ISBN: " + (ISBN != null ? ISBN : "N/A"));//если поля ISBN не установлено, будет выводиться "N/A"
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of publishing: " + yearOfPublishing);
        System.out.println("Genre: " + genre);
    }
}
