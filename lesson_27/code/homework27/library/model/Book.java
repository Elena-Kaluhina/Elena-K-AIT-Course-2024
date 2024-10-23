package homework27.library.model;

public class Book {

    //fields
    private String isbn;
    private String title;
    private String author;
    private int year;

    //constructor
    public Book(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //getters and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //toStringBuilder
    @Override
    public String toString() {
        // Используем StringBuilder для построения строки
        StringBuilder sb = new StringBuilder();
        sb.append("Book{")
                .append("isbn='").append(isbn).append('\'')
                .append(", title='").append(title).append('\'')
                .append(", author='").append(author).append('\'')
                .append(", year=").append(year)
                .append('}');
        return sb.toString();  // возвращаем собранную строку
    }

    //equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}
