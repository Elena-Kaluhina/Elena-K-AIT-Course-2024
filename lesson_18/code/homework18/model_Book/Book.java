package homework18.model_Book;
//Создайте или возьмите из прошлого домашнего задания класс Book с полями:
// название - title автор - author год издания - year уникальный номер - ISBN
// В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и
// метод display, который выводит информацию о книге. Создайте класс Dictionary,
// который расширяет класс Book. Предложите для него набор полей и переопределите
// метод display. В классе BookAppl в методе main создайте несколько словарей и
// выведите информацию о них в консоль.

public class Book {
    //fields
    private String title;
    private String author;
    private int yearOfPublishing;
    private String ISBN;

    //constructor
    public Book(String title, String author, int yearOfPublishing, String ISBN) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.ISBN = ISBN;
    }

    //getters and setters
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    //method display
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of publication: " + yearOfPublishing);
        System.out.println("ISBN: " + ISBN);
    }
}
