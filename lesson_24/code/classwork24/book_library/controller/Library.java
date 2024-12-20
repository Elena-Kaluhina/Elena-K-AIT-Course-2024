package classwork24.book_library.controller;
//Реализовать методы:
// - печать списка всех книг в библиотеке;
// - получение кол-ва книг в библиотеке;
// - поиска книги по ISBN;
// - добавление книги в библиотеку с учетом требований:
//    - не добавлять null
//    - не добавлять дубликат
//    - не добавлять больше, чем может вместить в себя библиотека.
// - удаление книги из библиотеки.

import classwork24.book_library.model.Book;

public class Library {

    // fields
    private Book[] books;
    private int size; // текущее кол-во книг


    // constructor
    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    // CRUD methods
    // boolean addBook(Book book)
    public boolean addBook(Book book) {

        //negative cases
        if (book == null){
            return false;
        }
        if(size == books.length){
            return false;
        }
        if (!(findBook(book.getIsbn()) == null)){
            return false;
        }

        //positive case
        books[size] = book;//ставим книгу в конец массива, на первое свободное место, значение индекса и есть size
        size++;
        return true;
    }


    // size++
    public int size() {
        return size;
    }


    // void printBooks()
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }


    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;
    }


    // Book removeBook(long isbn)
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn){
                Book victim = books[i];
                books[i] = books[size - 1]; //копию последней книги мы должны положить в victim
                books[size - 1] = null; //затираем последний элемент массива и уменьшаем size
                size--;

                return victim;
            }

        }
        return null;
    }


    // boolean updateBook()


}
