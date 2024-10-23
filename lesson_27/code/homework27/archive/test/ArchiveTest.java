package homework27.archive.test;

import homework27.archive.*;
import homework27.archive.dao.Archive;
import homework27.archive.dao.ArchiveImpl;
import homework27.archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArchiveTest {

    private Archive archive;

    @BeforeEach
    public void setUp() {
        archive = new ArchiveImpl();  // используем реализацию ArchiveImpl
    }

    @Test
    public void testAddDocument() {
        Document doc = new Document("1", "Contract", "John Doe", "Legal contract");
        archive.addDocument(doc);
        assertEquals(doc, archive.findDocumentById("1"));
    }

    @Test
    public void testFindDocumentsByAuthor() {
        Document doc1 = new Document("1", "Contract", "John Doe", "Legal contract");
        Document doc2 = new Document("2", "Invoice", "John Doe", "Invoice for services");
        archive.addDocument(doc1);
        archive.addDocument(doc2);

        List<Document> docs = archive.findDocumentsByAuthor("John Doe");
        assertEquals(2, docs.size());
        assertTrue(docs.contains(doc1));
        assertTrue(docs.contains(doc2));
    }


    @Test
    public void testFindDocumentsByTitle() {
        Document doc1 = new Document("1", "Contract", "John Doe", "Legal contract");
        Document doc2 = new Document("2", "Contract", "Jane Doe", "Contract for services");
        archive.addDocument(doc1);
        archive.addDocument(doc2);

        List<Document> docs = archive.findDocumentsByTitle("Contract");
        assertEquals(2, docs.size());
        assertTrue(docs.contains(doc1));
        assertTrue(docs.contains(doc2));
    }

    @Test
    public void testRemoveDocument() {
        Document doc = new Document("1", "Contract", "John Doe", "Legal contract");
        archive.addDocument(doc);
        archive.removeDocument("1");
        assertNull(archive.findDocumentById("1"));
    }

    @Test
    public void testPrintAllDocuments() {
        Document doc1 = new Document("1", "Contract", "John Doe", "Legal contract");
        Document doc2 = new Document("2", "Invoice", "Jane Doe", "Invoice for services");
        archive.addDocument(doc1);
        archive.addDocument(doc2);

        // проверим, что метод printAllDocuments не вызывает ошибок
        assertDoesNotThrow(() -> archive.printAllDocuments());
    }
}
