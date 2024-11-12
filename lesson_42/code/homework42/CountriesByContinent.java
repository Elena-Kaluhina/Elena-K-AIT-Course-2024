package homework42;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountriesByContinent {

    public static void main(String[] args) {

        // Создаем карту с континентами и странами
        Map<String, List<String>> continentCountries = new HashMap<>();
        continentCountries.put("Africa", List.of("Nigeria", "Egypt", "South Africa"));
        continentCountries.put("Asia", List.of("China", "India", "Japan"));
        continentCountries.put("Europe", List.of("Germany", "France", "Italy", "Spain"));
        continentCountries.put("North America", List.of("United States", "Canada", "Mexico"));
        continentCountries.put("South America", List.of("Brazil", "Argentina", "Chile"));
        continentCountries.put("Oceania", List.of("Australia", "New Zealand"));

        // Подсчет и вывод стран на каждом континенте
        for (Map.Entry<String, List<String>> entry : continentCountries.entrySet()) {
            String continent = entry.getKey();
            List<String> countries = entry.getValue();
            System.out.println("Continent: " + continent);
            System.out.println("Countries: " + countries);
            System.out.println("Number of Countries: " + countries.size());
            System.out.println();
        }
    }
}
