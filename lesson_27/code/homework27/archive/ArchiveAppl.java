package homework27.archive;

import homework27.archive.dao.Archive;
import homework27.archive.dao.ArchiveImpl;
import homework27.archive.model.Document;

public class ArchiveAppl {

    public static void main(String[] args) {
        Archive archive = new ArchiveImpl();

        Document doc1 = new Document("1", "Contract", "John Doe", "Legal contract for services");
        archive.addDocument(doc1);


        // Добавляем документы
        archive.addDocument(new Document("1", "Contract", "John Doe", "Legal contract"));
        archive.addDocument(new Document("2", "Invoice", "Jane Doe", "Invoice for payment"));
        archive.addDocument(new Document("3", "Report", "John Doe", "Annual report"));

        // Печатаем все документы
        System.out.println("All documents:");
        archive.printAllDocuments();

        // Ищем документы по автору
        System.out.println("Documents by John Doe:");
        archive.findDocumentsByAuthor("John Doe").forEach(System.out::println);

        // Удаляем документ
        archive.removeDocument("1");
        System.out.println("After removal:");
        archive.printAllDocuments();
    }
}
