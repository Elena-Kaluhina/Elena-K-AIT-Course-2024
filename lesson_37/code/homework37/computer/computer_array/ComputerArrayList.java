package homework37.computer.computer_array;

import homework37.computer.model.Computer;

import java.util.ArrayList;
import java.util.Comparator;

public class ComputerArrayList {

    public static void main(String[] args) {
        // Создаем список компьютеров
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Dell", 16, 512));
        computers.add(new Computer("Apple", 8, 256));
        computers.add(new Computer("Lenovo", 16, 1024));
        computers.add(new Computer("HP", 32, 512));
        computers.add(new Computer("Asus", 8, 128));
        computers.add(new Computer("Acer", 16, 256));

        // Выводим исходный список
        System.out.println("Original list:");
        computers.forEach(System.out::println);

        // Сортировка по бренду
        computers.sort(Comparator.comparing(Computer::getBrand));
        System.out.println("\nList sorted by brand:");
        computers.forEach(System.out::println);

        // Сортировка по RAM, затем по SSD
        computers.sort(Comparator.comparingInt(Computer::getRam)
                .thenComparingInt(Computer::getSsd));
        System.out.println("\nList sorted by RAM, then by SSD:");
        computers.forEach(System.out::println);

        // Подсчет общего объема и среднего значения SSD
        int totalSsd = computers.stream().mapToInt(Computer::getSsd).sum();
        double averageSsd = computers.stream().mapToInt(Computer::getSsd).average().orElse(0);

        System.out.println("\nTotal SSD capacity: " + totalSsd + " GB");
        System.out.println("Average SSD capacity: " + averageSsd + " GB");
    }
}

//Класс Computer:
//Поля brand, ram, и ssd для хранения бренда, объема RAM и объема SSD.
//Создает ArrayList из объектов Computer.
//Выполняет сортировку по brand, затем по ram и ssd, если ram одинаковый.
//Подсчитывает суммарный объем SSD и среднее значение SSD.
//Результаты сортировки и подсчета:
//Список выводится в оригинальном виде, после сортировки по brand, и после сортировки по ram и ssd.
//Выводятся суммарный объем SSD и его среднее значение.