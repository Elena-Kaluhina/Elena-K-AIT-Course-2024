package homework30.date_string_sort.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {

    //Компаратор:
    //Строки дат разделяются по символу "-", чтобы получить день, месяц и год.
    //Сначала сравниваются года. Если года одинаковые, сравниваются месяцы.
    //Если и месяцы одинаковые, тогда сравниваются дни.
    Comparator<String> comparator;

    @BeforeEach
    void setUp() {
        comparator = (s1, s2) -> {
            //разделение строк по символу "-" для извлечения дня, месяца и года
            String[] date1 = s1.split("-");
            String[] date2 = s2.split("-");

            //сравнение годов
            int yearComparison = Integer.compare(Integer.parseInt(date1[2]), Integer.parseInt(date2[2]));
            if (yearComparison != 0) {
                return yearComparison;
            }

            //сравнение месяцев
            int monthComparison = Integer.compare(Integer.parseInt(date1[1]), Integer.parseInt(date2[1]));
            if (monthComparison != 0) {
                return monthComparison;
            }

            //сравнение дней
            return Integer.compare(Integer.parseInt(date1[0]), Integer.parseInt(date2[0]));
        };
    }

    //Тест:
    //Проверяется сортировка дат в массиве, сравнивая её с ожидаемым результатом.
    //Этот подход корректно сортирует строки дат в формате dd-MM-yyyy без
    //использования Java Time API(нам его запретили использовать!)
    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };

        System.out.println("Before sorting:");
        for (String date : dates) {
            System.out.println(date);
        }

        Arrays.sort(dates, comparator);

        System.out.println("\nAfter sorting:");
        for (String date : dates) {
            System.out.println(date);
        }

        assertArrayEquals(expected, dates);
    }
}
