package homework27.videoGameLibrary.model;

public class Game {

    //fields
    private String id;
    private String title;
    private String genre;
    private double price;
    private String publisherId;

    //constructor
    public Game(String id, String title, String genre, double price, String publisherId) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.publisherId = publisherId;
    }

    //getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getPublisherId() { return publisherId; }  // Новый геттер для publisherId
    public void setPublisherId(String publisherId) { this.publisherId = publisherId; }  // Новый сеттер

    //equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id.equals(game.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    //StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Game{id='").append(id).append('\'')
                .append(", title='").append(title).append('\'')
                .append(", genre='").append(genre).append('\'')
                .append(", price=").append(price)
                .append(", publisherId='").append(publisherId).append('\'')  // Вывод publisherId
                .append('}');
        return sb.toString();
    }
}

