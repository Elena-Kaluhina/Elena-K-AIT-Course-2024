package homework40.tree_set_example;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // Добавление элементов
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        System.out.println("TreeSet after adding elements: " + numbers); // [5, 10, 15, 20]

        // Проверка наличия элемента
        System.out.println("Contains 10? " + numbers.contains(10)); // true
        System.out.println("Contains 30? " + numbers.contains(30)); // false

        // Получение первого и последнего элемента
        System.out.println("First element: " + numbers.first()); // 5
        System.out.println("Last element: " + numbers.last());   // 20

        // Поднаборы
        System.out.println("SubSet (5 to 15): " + numbers.subSet(5, 15)); // [5, 10]
        System.out.println("HeadSet (to 15): " + numbers.headSet(15));    // [5, 10]
        System.out.println("TailSet (from 10): " + numbers.tailSet(10));  // [10, 15, 20]

        // Удаление элемента
        numbers.remove(15);
        System.out.println("TreeSet after removing 15: " + numbers); // [5, 10, 20]

        // Размер набора
        System.out.println("Size of TreeSet: " + numbers.size()); // 3

        // Очистка набора
        numbers.clear();
        System.out.println("TreeSet after clear: " + numbers); // []
    }
    //Работа кода
    //Добавление элементов: Метод add вставляет элементы в отсортированном порядке.
    //Проверка наличия элемента: contains определяет, содержится ли элемент в TreeSet.
    //Первый и последний элемент: first и last возвращают минимальный и максимальный элементы, соответственно.
    //Подмножества: Методы subSet, headSet, и tailSet возвращают подмножества элементов в зависимости от указанных границ.
    //Удаление и очистка: Метод remove удаляет один элемент, а clear — все элементы.
}

//TreeSet — это структура данных в Java, которая хранит элементы в отсортированном порядке и не допускает дубликатов. Ниже перечислены основные методы TreeSet и примеры их использования.
//
//Основные методы TreeSet
//Добавление и удаление элементов:
//add(E e): добавляет элемент в набор.
//remove(Object o): удаляет указанный элемент из набора.
//Поиск элементов:
//contains(Object o): возвращает true, если элемент присутствует в наборе.
//first(): возвращает первый (наименьший) элемент.
//last(): возвращает последний (наибольший) элемент.
//Срезы и подмножества:
//subSet(E fromElement, E toElement): возвращает поднабор от fromElement до toElement (не включая toElement).
//headSet(E toElement): возвращает поднабор всех элементов меньше toElement.
//tailSet(E fromElement): возвращает поднабор всех элементов больше или равных fromElement.
//Очистка и получение размера:
//clear(): удаляет все элементы из набора.
//size(): возвращает количество элементов в наборе.
//Обход элементов:
//iterator(): возвращает итератор для набора, позволяя обходить элементы в порядке возрастания.


