package homework38.german_cities;

import java.util.Collections;
import java.util.LinkedList;

public class GermanyAppl {

    public static void main(String[] args) {

        // Создаем LinkedList для хранения городов - столиц земель Германии
        LinkedList<String> cities = new LinkedList<>();

        // Добавляем города - столицы земель Германии
        cities.add("Berlin");        // Столица Германии и столица земли Берлин
        cities.add("Munich");        // Столица Баварии
        cities.add("Stuttgart");     // Столица Баден-Вюртемберга
        cities.add("Dresden");       // Столица Саксонии
        cities.add("Hanover");       // Столица Нижней Саксонии
        cities.add("Wiesbaden");     // Столица Гессена
        cities.add("Mainz");         // Столица Рейнланд-Пфальца
        cities.add("Saarbrücken");   // Столица Саара
        cities.add("Bremen");        // Вольный город Бремен
        cities.add("Düsseldorf");    // Столица Северного Рейна-Вестфалии
        cities.add("Potsdam");       // Столица Бранденбурга
        cities.add("Magdeburg");     // Столица Саксонии-Анхальт
        cities.add("Kiel");          // Столица Шлезвиг-Гольштейна
        cities.add("Erfurt");        // Столица Тюрингии
        cities.add("Schwerin");      // Столица Мекленбург-Передней Померании

        System.out.println("Original list of German state capitals:");
        System.out.println(cities);

        // Добавление вольного города Гамбург в начало списка
        cities.addFirst("Hamburg");
        System.out.println("\nList after adding Hamburg at the beginning:");
        System.out.println(cities);

        // Добавление Гамбурга в середину списка
        int middleIndex = cities.size() / 2;
        cities.add(middleIndex, "Hamburg");
        System.out.println("\nList after adding Hamburg in the middle:");
        System.out.println(cities);

        // Добавление Гамбурга в конец списка
        cities.addLast("Hamburg");
        System.out.println("\nList after adding Hamburg at the end:");
        System.out.println(cities);

        // Сортировка списка по алфавиту
        Collections.sort(cities);
        System.out.println("\nList sorted in alphabetical order:");
        System.out.println(cities);

        // Сортировка списка в обратном алфавитном порядке
        Collections.sort(cities, Collections.reverseOrder());
        System.out.println("\nList sorted in reverse alphabetical order:");
        System.out.println(cities);

        // Пример использования некоторых методов LinkedList
        System.out.println("\nSome LinkedList methods:");
        System.out.println("First city in the list: " + cities.getFirst());
        System.out.println("Last city in the list: " + cities.getLast());
        System.out.println("City at index 5: " + cities.get(5));
        System.out.println("Removing the first city: " + cities.removeFirst());
        System.out.println("Removing the last city: " + cities.removeLast());
        System.out.println("List after removing first and last city:");
        System.out.println(cities);
    }
}

//Создание списка cities:
//Используем LinkedList<String> для хранения названий городов - столиц земель Германии.
//Добавляем столицы земель Германии в список cities.
//Добавление Гамбурга в разные позиции:
//В начало: cities.addFirst("Hamburg"); добавляет Гамбург в начало списка.
//В середину: cities.add(middleIndex, "Hamburg"); добавляет Гамбург в середину, где middleIndex — это индекс, равный половине длины списка.
//В конец: cities.addLast("Hamburg"); добавляет Гамбург в конец списка.
//Сортировка списка:
//По алфавиту: Collections.sort(cities); сортирует список в алфавитном порядке.
//В обратном алфавитном порядке: Collections.sort(cities, Collections.reverseOrder()); сортирует список в обратном алфавитном порядке.
//Пример использования методов LinkedList:
//getFirst(): возвращает первый элемент списка.
//getLast(): возвращает последний элемент списка.
//get(int index): возвращает элемент по указанному индексу.
//removeFirst(): удаляет первый элемент списка.
//removeLast(): удаляет последний элемент списка.
