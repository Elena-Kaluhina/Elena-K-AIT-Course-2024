package homework37.planets;

import java.util.ArrayList;
import java.util.Comparator;

public class PlanetsListOperations {

    public static void main(String[] args) {
        // Создаем список планет
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercury", 57.9, 0.055, 0));
        planets.add(new Planet("Venus", 108.2, 0.815, 0));
        planets.add(new Planet("Earth", 149.6, 1.0, 1));
        planets.add(new Planet("Mars", 227.9, 0.107, 2));
        planets.add(new Planet("Jupiter", 778.3, 317.8, 79));
        planets.add(new Planet("Saturn", 1427.0, 95.2, 82));
        planets.add(new Planet("Uranus", 2871.0, 14.5, 27));
        planets.add(new Planet("Neptune", 4497.1, 17.1, 14));

        System.out.println("Original list:");
        planets.forEach(System.out::println);

        // Сортировка по порядку в солнечной системе (по расстоянию до Солнца)
        planets.sort(Comparator.comparingDouble(Planet::getDistance));
        System.out.println("\nSorted by distance from the Sun:");
        planets.forEach(System.out::println);

        // Сортировка по алфавиту
        planets.sort(Comparator.comparing(Planet::getName));
        System.out.println("\nSorted by name (alphabetical order):");
        planets.forEach(System.out::println);

        // Сортировка по массе
        planets.sort(Comparator.comparingDouble(Planet::getMass));
        System.out.println("\nSorted by mass:");
        planets.forEach(System.out::println);

        // Сортировка по количеству спутников
        planets.sort(Comparator.comparingInt(Planet::getSatellites));
        System.out.println("\nSorted by number of satellites:");
        planets.forEach(System.out::println);
    }
}

//Класс PlanetListOperations:
//Создает ArrayList с объектами Planet для всех планет Солнечной системы.
//Выполняет сортировку:
//По расстоянию от Солнца с использованием Comparator.comparingDouble(Planet::getDistance).
//По названию в алфавитном порядке с использованием Comparator.comparing(Planet::getName).
//По массе с использованием Comparator.comparingDouble(Planet::getMass).
//По количеству спутников с использованием Comparator.comparingInt(Planet::getSatellites).
