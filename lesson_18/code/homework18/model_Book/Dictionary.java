package homework18.model_Book;

public class Dictionary extends Book{

    //fields
    private String language;
    private int numberOfWords;
    private boolean isIllustrated;

    //constructor
    public Dictionary(String title, String author, int yearOfPublishing, String ISBN, String language, int numberOfWords, boolean isIllustrated) {
        super(title, author, yearOfPublishing, ISBN);
        this.language = language;
        this.numberOfWords = numberOfWords;
        this.isIllustrated = isIllustrated;
    }

    //getters and setters
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    public boolean isIllustrated() {
        return isIllustrated;
    }

    public void setIllustrated(boolean illustrated) {
        isIllustrated = illustrated;
    }

    //display method
    @Override
    public void display() {
        super.display(); //вызов метода display из класса Book
        System.out.println("Language: " + language);
        System.out.println("Number of words: " + numberOfWords);
        System.out.println("Illustrated: " + (isIllustrated ? "Yes" : "No"));
    }
}
