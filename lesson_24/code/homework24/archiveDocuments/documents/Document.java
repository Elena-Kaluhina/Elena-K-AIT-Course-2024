package homework24.archiveDocuments.documents;

//Реализуйте класс Document и приложение Archive по аналогии с Book и Library.
// Уникальный номер документа содержит 10 цифр.

public class Document {

    //fields
    private String title;
    private String description;
    private String documentNumber; //уникальный номер, состоящий из 10 цифр

    //constructor
    public Document(String title, String description, String documentNumber) {
        if (!documentNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException("Document number must contain exactly 10 digits.");
        }
        this.title = title;
        this.description = description;
        this.documentNumber = documentNumber;
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    //toString
    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return documentNumber.equals(document.documentNumber);
    }

    @Override
    public int hashCode() {
        return documentNumber.hashCode();
    }
}
