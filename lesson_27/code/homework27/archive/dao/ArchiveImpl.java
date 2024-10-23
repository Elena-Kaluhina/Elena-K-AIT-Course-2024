package homework27.archive.dao;

import homework27.archive.model.Document;

import java.util.ArrayList;
import java.util.List;

public class ArchiveImpl implements Archive {
    private List<Document> documents;

    public ArchiveImpl() {
        this.documents = new ArrayList<>();
    }

    @Override
    public void addDocument(Document document) {
        documents.add(document);
    }

    @Override
    public Document findDocumentById(String id) {
        for (Document document : documents) {
            if (document.getId().equals(id)) {
                return document;
            }
        }
        return null;
    }

    @Override
    public List<Document> findDocumentsByAuthor(String author) {
        List<Document> result = new ArrayList<>();
        for (Document document : documents) {
            if (document.getAuthor().equals(author)) {
                result.add(document);
            }
        }
        return result;
    }

    @Override
    public List<Document> findDocumentsByTitle(String title) {
        List<Document> result = new ArrayList<>();
        for (Document document : documents) {
            if (document.getTitle().equals(title)) {
                result.add(document);
            }
        }
        return result;
    }

    @Override
    public void removeDocument(String id) {
        documents.removeIf(document -> document.getId().equals(id));
    }

    @Override
    public void printAllDocuments() {
        for (Document document : documents) {
            System.out.println(document);
        }
    }
}
