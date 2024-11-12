package homework44.travel_agency;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TravelAgency {

    // Список средиземноморских стран, в которые специализируется турагентство
    private static final Set<String> MEDITERRANEAN_COUNTRIES = Set.of(
        "Spain", "France", "Italy", "Greece", "Turkey", "Tunis"
    );

    // Метод для получения списка туристов
    private static List<Tourist> getTourists() {
        return List.of(
            new Tourist("Olesia", "Iran", "Kyrgyzstan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
            new Tourist("Bilbo Baggins", "Italy", "Spain", "Turkey"),
            new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
            new Tourist("Anton", "Germany", "Netherlands", "Turkey", "Georgia"),
            new Tourist("Sergei_B", "Tunis", "Turkey", "China", "Vietnam"),
            new Tourist("Galina", "Italy", "France", "Italy"),
            new Tourist("Anatoly", "Montenegro", "Albania", "Greece", "Italy"),
            new Tourist("Andrii", "UK", "Ireland", "Spain"),
            new Tourist("Liubov", "Croatia", "Slovenia", "Spain", "France", "Egypt"),
            new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
            new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
            new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
            new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
            new Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
            new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
            new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
            new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
            new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
            new Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
            new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
            new Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
            new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
            new Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
            new Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
            new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
            new Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
            new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
        );
    }

    public static void main(String[] args) {
        List<Tourist> tourists = getTourists();

        // 1. Найти наиболее популярные страны среди стран Средиземноморья
        Map<String, Long> countryPopularity = tourists.stream()
            .flatMap(tourist -> tourist.getCountriesVisited().stream()) // получаем все посещенные страны
            .filter(MEDITERRANEAN_COUNTRIES::contains) // фильтруем только страны Средиземноморья
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // считаем количество посещений каждой страны

        System.out.println("Most popular Mediterranean countries:");
        countryPopularity.forEach((country, count) -> 
            System.out.println("Country: " + country + ", Visits: " + count));

        // 2. Найти туриста, который посетил наибольшее количество уникальных стран Средиземноморья
        Optional<Tourist> topTourist = tourists.stream()
            .max(Comparator.comparingLong(tourist -> tourist.getCountriesVisited().stream()
                .filter(MEDITERRANEAN_COUNTRIES::contains) // только страны Средиземноморья
                .distinct() // только уникальные страны
                .count())); // считаем количество уникальных стран, посещенных туристом

        topTourist.ifPresent(tourist -> System.out.println("\nTourist with the most Mediterranean countries visited: "
                + tourist.getName() + ", Countries: " + tourist.getCountriesVisited().stream()
                .filter(MEDITERRANEAN_COUNTRIES::contains)
                .distinct()
                .collect(Collectors.toList())));
    }
}

//Класс Tourist:
//Поля: name — имя туриста, countriesVisited — список посещенных стран.
//Конструктор и геттеры для доступа к данным.
//Константа MEDITERRANEAN_COUNTRIES:
//Набор, содержащий страны Средиземноморья, которые интересуют турагентство.
//Метод getTourists:
//Возвращает список туристов с их поездками.
//Анализ данных:
//Популярность стран:
//flatMap извлекает все страны, которые посещали туристы, независимо от количества посещений.
//filter сохраняет только страны Средиземноморья.
//collect(Collectors.groupingBy(...)) считает количество посещений каждой страны и записывает в Map<String, Long>.
//Турист с наибольшим количеством уникальных посещенных стран:
//Используем max(Comparator.comparingLong(...)), чтобы найти туриста с наибольшим количеством уникальных стран Средиземноморья.
//distinct() оставляет только уникальные страны, посещенные этим туристом.
//Результат выводится с именем туриста и списком стран.