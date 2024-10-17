package homework24.archiveDocuments.archive;

import homework24.archiveDocuments.documents.Document;

import java.util.ArrayList;
import java.util.List;

public class Archive {
    private List <Document> documents;

    //конструктор
    public Archive() {
        this.documents = new ArrayList<>();
    }

    //метод для добавления документа
    public void addDocument(Document document) {
        for (Document doc : documents) {
            if (doc.getDocumentNumber().equals(document.getDocumentNumber())) {
                throw new IllegalArgumentException("Document with this number already exists.");
            }
        }
        documents.add(document);
    }

    //метод для поиска документа по номеру
    public Document findDocumentByNumber(String documentNumber) {
        for (Document document : documents) {
            if (document.getDocumentNumber().equals(documentNumber)) {
                return document;
            }
        }
        return null; //если документ не найден
    }

    //метод для вывода всех документов
    public void printAllDocuments() {
        for (Document document : documents) {
            System.out.println(document);
        }
    }
}