package homework45.compare_file;

import java.io.FileInputStream;
import java.io.IOException;

public class CompareFileAppl {
    public static void main(String[] args) {
        // Проверяем, что переданы два аргумента - имена файлов для сравнения
        if (args.length < 2) {
            System.out.println("Please provide two file names as arguments.");
            return;
        }

        String file1Path = args[0]; // Первый файл, переданный через аргументы
        String file2Path = args[1]; // Второй файл, переданный через аргументы

        try (FileInputStream fis1 = new FileInputStream(file1Path);
             FileInputStream fis2 = new FileInputStream(file2Path)) {

            // Проверяем, совпадает ли длина файлов
            if (fis1.available() != fis2.available()) {
                System.out.println("The files are different.");
                return;
            }

            int byte1, byte2;
            // Читаем файлы побайтово и сравниваем каждый байт
            while ((byte1 = fis1.read()) != -1) {
                byte2 = fis2.read();
                if (byte1 != byte2) {
                    System.out.println("The files are different.");
                    return;
                }
            }

            // Если все байты совпали, файлы идентичны
            System.out.println("The files are identical.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the files: " + e.getMessage());
        }
    }
}
