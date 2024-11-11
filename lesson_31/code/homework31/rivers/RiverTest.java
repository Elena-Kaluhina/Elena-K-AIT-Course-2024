package homework31.rivers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class RiverTest {

    River[] rivers; // массив рек для тестирования

    @BeforeEach
    void setUp() {
        // Инициализируем массив рек с разными значениями name и length
        rivers = new River[6];
        rivers[0] = new River("Nile", 6650);
        rivers[1] = new River("Amazon", 6400);
        rivers[2] = new River("Yangtze", 6300);
        rivers[3] = new River("Mississippi", 6275);
        rivers[4] = new River("Yenisei", 5539);
        rivers[5] = new River("Yellow River", 5464);
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
        // Тестирует сортировку по length (по умолчанию)
        printArray(rivers, "List of rivers as is");
        Arrays.sort(rivers); // сортировка по длине реки
        printArray(rivers, "List of rivers sorted by length.");

        River pattern = new River(null, 6400); // объект для поиска
        int index = Arrays.binarySearch(rivers, pattern); // бинарный поиск
        System.out.println("Index of Amazon: " + index); // выводит индекс реки с заданной длиной
    }

    @Test
    void testComparatorByName() {
        // Сортировка рек по названию
        Comparator<River> comparatorByName = Comparator.comparing(River::getName);
        Arrays.sort(rivers, comparatorByName); // сортировка по алфавиту
        printArray(rivers, "List of rivers sorted by name.");

        River pattern = new River("Amazon", 0); // объект для поиска
        int index = Arrays.binarySearch(rivers, pattern, comparatorByName);
        if (index >= 0) {
            System.out.println("Found river " + pattern.getName() + " at index: " + index);
        } else {
            System.out.println("River " + pattern.getName() + " not found, expected position: " + (-index - 1));
        }
    }

    @Test
    void testArrayCopy() {
        // Копирование массива в массив в два раза больше
        River[] riversCopy = Arrays.copyOf(rivers, rivers.length * 2);
        printArray(riversCopy, "riversCopy as is");

        Comparator<River> comparatorByName = Comparator.nullsLast(Comparator.comparing(River::getName));
        Arrays.sort(riversCopy, comparatorByName); // сортировка с учетом null значений
        printArray(riversCopy, "riversCopy after sorting by name");

        River pattern = new River("Danube", 0); // объект для поиска
        int index = Arrays.binarySearch(riversCopy, 0, rivers.length, pattern, comparatorByName);
        System.out.println("Index of Danube: " + index);
    }

    @Test
    void testInsertKeepSorting() {
        // Вставка элемента и сохранение порядка сортировки по length
        Arrays.sort(rivers); // сортировка по умолчанию (длина реки)
        printArray(rivers, "Native sorting by length");

        River[] riversCopy7 = Arrays.copyOf(rivers, rivers.length + 1); // увеличиваем массив
        River river = new River("Danube", 2860); // новая река для добавления
        int index = Arrays.binarySearch(riversCopy7, 0, riversCopy7.length - 1, river);
        index = index >= 0 ? index : -index - 1; // обработка отрицательного индекса

        // Сдвигаем элементы и вставляем новый объект
        System.arraycopy(riversCopy7, index, riversCopy7, index + 1, riversCopy7.length - index - 1);
        riversCopy7[index] = river;
        rivers = riversCopy7;
        printArray(rivers, "List with added river");
    }

    @Test
    void testSystemArrayCopy() {
        // Проверка работы метода System.arraycopy
        River[] riversCopyPlus2 = new River[rivers.length + 2];
        System.arraycopy(rivers, 2, riversCopyPlus2, 3, 3);
        printArray(rivers, "Original array");
        printArray(riversCopyPlus2, "Copy of array");
    }

    @Test
    void testArraysCopyOfRange() {
        // Проверка метода Arrays.copyOfRange
        River[] riversCopy = Arrays.copyOfRange(rivers, 1, 3);
        printArray(rivers, "Original (source) array");
        printArray(riversCopy, "Copy of range");
    }
}
