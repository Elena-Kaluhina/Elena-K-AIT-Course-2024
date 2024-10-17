package homework24.archiveDocuments.application;

import homework24.archiveDocuments.archive.Archive;
import homework24.archiveDocuments.documents.Document;

public class ArchiveApp {
    public static void main(String[] args) {

        //создаем архив
        Archive archive = new Archive();

        //создаем документы
        Document doc1 = new Document("Contract", "Legal contract for services", "1234567890");
        Document doc2 = new Document("Invoice", "Invoice for purchase", "0987654321");

        //добавляем документы в архив
        archive.addDocument(doc1);
        archive.addDocument(doc2);

        //печатаем все документы
        System.out.println("All documents in the archive:");
        archive.printAllDocuments();

        //ищем документ по номеру
        Document foundDoc = archive.findDocumentByNumber("1234567890");
        if (foundDoc != null) {
            System.out.println("Found document: " + foundDoc);
        } else {
            System.out.println("Document not found.");
        }
    }
}
