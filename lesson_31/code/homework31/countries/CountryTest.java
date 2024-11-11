package homework31.countries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CountryTest {

    Country[] countries; // массив стран для тестирования

    @BeforeEach
    void setUp() {
        // Инициализируем массив стран с разными значениями name и population
        countries = new Country[6];
        countries[0] = new Country("Germany", 83000000);
        countries[1] = new Country("France", 67000000);
        countries[2] = new Country("Italy", 60000000);
        countries[3] = new Country("Spain", 47000000);
        countries[4] = new Country("Poland", 38000000);
        countries[5] = new Country("Netherlands", 17000000);
    }

    public void printArray(Object[] array, String titleOfReport) {
        // Метод для печати массива с заголовком
        System.out.println("--------------- titleOfReport ------------------- ");
        for (Object o : array) {
            System.out.println(o);
        }
    }

    @Test
    void testComparable() {
        // Тестирует сортировку по population (по умолчанию)
        printArray(countries, "List of countries as is");
        Arrays.sort(countries); // сортировка по населению
        printArray(countries, "List of countries sorted by population.");

        Country pattern = new Country(null, 60000000); // объект для поиска
        int index = Arrays.binarySearch(countries, pattern); // бинарный поиск
        System.out.println("Index of Italy: " + index); // выводит индекс страны с заданным населением
    }

    @Test
    void testComparatorByName() {
        // Сортировка стран по названию
        Comparator<Country> comparatorByName = Comparator.comparing(Country::getName);
        Arrays.sort(countries, comparatorByName); // сортировка по алфавиту
        printArray(countries, "List of countries sorted by name.");

        Country pattern = new Country("France", 0); // объект для поиска
        int index = Arrays.binarySearch(countries, pattern, comparatorByName);
        if (index >= 0) {
            System.out.println("Found country " + pattern.getName() + " at index: " + index);
        } else {
            System.out.println("Country " + pattern.getName() + " not found, expected position: " + (-index - 1));
        }
    }

    @Test
    void testArrayCopy() {
        // Копирование массива в массив в два раза больше
        Country[] countriesCopy = Arrays.copyOf(countries, countries.length * 2);
        printArray(countriesCopy, "countriesCopy as is");

        Comparator<Country> comparatorByName = Comparator.nullsLast(Comparator.comparing(Country::getName));
        Arrays.sort(countriesCopy, comparatorByName); // сортировка с учетом null значений
        printArray(countriesCopy, "countriesCopy after sorting by name");

        Country pattern = new Country("Austria", 0); // объект для поиска
        int index = Arrays.binarySearch(countriesCopy, 0, countries.length, pattern, comparatorByName);
        System.out.println("Index of Austria: " + index);
    }

    @Test
    void testInsertKeepSorting() {
        // Вставка элемента и сохранение порядка сортировки по population
        Arrays.sort(countries); // сортировка по умолчанию (население)
        printArray(countries, "Native sorting by population");

        Country[] countriesCopy7 = Arrays.copyOf(countries, countries.length + 1); // увеличиваем массив
        Country country = new Country("Sweden", 10000000); // новая страна для добавления
        int index = Arrays.binarySearch(countriesCopy7, 0, countriesCopy7.length - 1, country);
        index = index >= 0 ? index : -index - 1; // обработка отрицательного индекса

        // Сдвигаем элементы и вставляем новый объект
        System.arraycopy(countriesCopy7, index, countriesCopy7, index + 1, countriesCopy7.length - index - 1);
        countriesCopy7[index] = country;
        countries = countriesCopy7;
        printArray(countries, "List with added country");
    }

    @Test
    void testSystemArrayCopy() {
        // Проверка работы метода System.arraycopy
        Country[] countriesCopyPlus2 = new Country[countries.length + 2];
        System.arraycopy(countries, 2, countriesCopyPlus2, 3, 3);
        printArray(countries, "Original array");
        printArray(countriesCopyPlus2, "Copy of array");
    }

    @Test
    void testArraysCopyOfRange() {
        // Проверка метода Arrays.copyOfRange
        Country[] countriesCopy = Arrays.copyOfRange(countries, 1, 3);
        printArray(countries, "Original (source) array");
        printArray(countriesCopy, "Copy of range");
    }
}
