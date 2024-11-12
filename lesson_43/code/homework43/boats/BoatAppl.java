package homework43.boats;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class BoatAppl {

    public static void main(String[] args) {
        Set<Boat> boats = Set.of(
                new Boat("Yard A", "USA", 2015, 30.5, "wood", 50000),
                new Boat("Yard B", "France", 2018, 28.0, "metal", 70000),
                new Boat("Yard C", "Italy", 2020, 35.0, "plastic", 60000),
                new Boat("Yard D", "USA", 2017, 25.5, "wood", 80000),
                new Boat("Yard E", "Spain", 2019, 32.0, "metal", 90000)
        );

        // 1. Отобразить все яхты
        System.out.println("All boats:");
        boats.forEach(System.out::println);

        // 2. Отобразить яхты, сделанные из указанного материала корпуса
        String material = "wood";
        System.out.println("\nBoats made of " + material + ":");
        boats.stream()
                .filter(boat -> boat.getHullMaterial().equalsIgnoreCase(material))
                .forEach(System.out::println);

        // 3. Отобразить яхты дороже указанной цены
        double minPrice = 60000;
        System.out.println("\nBoats with price over " + minPrice + ":");
        boats.stream()
                .filter(boat -> boat.getPrice() > minPrice)
                .forEach(System.out::println);

        // 4. Отобразить яхты, чей год выпуска находится в заданном диапазоне
        int startYear = 2016;
        int endYear = 2019;
        System.out.println("\nBoats released between " + startYear + " and " + endYear + ":");
        boats.stream()
                .filter(boat -> boat.getYear() >= startYear && boat.getYear() <= endYear)
                .forEach(System.out::println);

        // 5. Отсортировать яхты в порядке убывания стоимости
        System.out.println("\nBoats sorted by descending price:");
        boats.stream()
                .sorted((b1, b2) -> Double.compare(b2.getPrice(), b1.getPrice()))
                .forEach(System.out::println);

        // 6. Получить среднюю стоимость яхт из набора
        OptionalDouble averagePrice = boats.stream()
                .mapToDouble(Boat::getPrice)
                .average();
        System.out.println("\nAverage price of boats: " + (averagePrice.isPresent() ? averagePrice.getAsDouble() : "N/A"));

        // 7. Сколько и конкретно какие яхты под каким флагом стоят в порту
        System.out.println("\nBoats grouped by country:");
        Map<String, List<Boat>> boatsByCountry = boats.stream()
                .collect(Collectors.groupingBy(Boat::getCountry));
        boatsByCountry.forEach((country, countryBoats) -> {
            System.out.println("Country: " + country + ", Count: " + countryBoats.size());
            countryBoats.forEach(System.out::println);
        });
    }
}
