package homework44.computer;

import java.util.OptionalDouble;
import java.util.Set;

public class ComputerApp {

    public static void main(String[] args) {

        Set<Computer> computers = Set.of(
            new Computer("Dell", "XPS", 2019, "Intel i7", 16, 1200.0),
            new Computer("Apple", "MacBook Pro", 2020, "M1", 8, 1500.0),
            new Computer("HP", "Spectre", 2018, "Intel i5", 8, 1000.0),
            new Computer("Asus", "ROG", 2021, "AMD Ryzen 9", 32, 1800.0)
        );

        // Отобразить все компьютеры
        System.out.println("All computers:");
        computers.forEach(System.out::println);

        // Отобразить компьютеры с указанным процессором
        String processor = "Intel i7";
        System.out.println("\nComputers with processor " + processor + ":");
        computers.stream()
            .filter(computer -> computer.getProcessor().equalsIgnoreCase(processor))
            .forEach(System.out::println);

        // Компьютеры, выпущенные в заданном диапазоне лет
        int startYear = 2018;
        int endYear = 2020;
        System.out.println("\nComputers released between " + startYear + " and " + endYear + ":");
        computers.stream()
            .filter(computer -> computer.getYear() >= startYear && computer.getYear() <= endYear)
            .forEach(System.out::println);

        // Сортировка компьютеров по оперативной памяти в порядке убывания
        System.out.println("\nComputers sorted by RAM descending:");
        computers.stream()
            .sorted((c1, c2) -> Integer.compare(c2.getRam(), c1.getRam()))
            .forEach(System.out::println);

        // Компьютер с максимальной оперативной памятью
        Computer maxRamComputer = computers.stream()
            .max((c1, c2) -> Integer.compare(c1.getRam(), c2.getRam()))
            .orElse(null);
        System.out.println("\nComputer with maximum RAM: " + maxRamComputer);

        // Средняя стоимость компьютеров
        OptionalDouble averagePrice = computers.stream()
            .mapToDouble(Computer::getPrice)
            .average();
        System.out.println("\nAverage price of computers: " + (averagePrice.isPresent() ? averagePrice.getAsDouble() : "N/A"));
    }
}