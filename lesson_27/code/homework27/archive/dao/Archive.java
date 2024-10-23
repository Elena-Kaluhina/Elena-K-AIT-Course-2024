package homework27.archive.dao;

import homework27.archive.model.Document;

import java.util.List;

public interface Archive {

    void addDocument(Document document);

    Document findDocumentById(String id);

    List<Document> findDocumentsByAuthor(String author);

    List<Document> findDocumentsByTitle(String title);

    void removeDocument(String id);

    void printAllDocuments();

}
