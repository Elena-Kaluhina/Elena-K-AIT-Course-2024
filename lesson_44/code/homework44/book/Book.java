package homework44.book;

public class Book {

    private final String author;
    private final String title;
    private final int publicationYear;
    private final String genre;
    private final double price;

    public Book(String author, String title, int publicationYear, String genre, double price) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Book{")
                .append("author='").append(author).append('\'')
                .append(", title='").append(title).append('\'')
                .append(", publicationYear=").append(publicationYear)
                .append(", genre='").append(genre).append('\'')
                .append(", price=").append(price)
                .append('}')
                .toString();
    }
}
