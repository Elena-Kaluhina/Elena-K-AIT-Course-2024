package homework33.week_days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeekDaysTest {

    @Test
    void testAddDays() {
        // Проверка работы метода addDays
        System.out.println("Monday + 10 days = " + WeekDays.MONDAY.addDays(10));
        assertEquals(WeekDays.THURSDAY, WeekDays.MONDAY.addDays(10), "Monday + 10 days should be Thursday");

        System.out.println("Saturday + 1 day = " + WeekDays.SATURDAY.addDays(1));
        assertEquals(WeekDays.SUNDAY, WeekDays.SATURDAY.addDays(1), "Saturday + 1 day should be Sunday");

        System.out.println("Monday + 7 days = " + WeekDays.MONDAY.addDays(7));
        assertEquals(WeekDays.MONDAY, WeekDays.MONDAY.addDays(7), "Monday + 7 days should be Monday");

        System.out.println("Friday + 5 days = " + WeekDays.FRIDAY.addDays(5));
        assertEquals(WeekDays.WEDNESDAY, WeekDays.FRIDAY.addDays(5), "Friday + 5 days should be Wednesday");
    }

    @Test
    void testEnumMethods() {
        // Проверка метода values(): должен вернуть массив из 7 элементов
        WeekDays[] days = WeekDays.values();
        assertEquals(7, days.length, "Week should have 7 days");

        // Проверка метода toString(): должен вернуть название и номер дня
        assertEquals("WeekDay{name='Monday', dayNumber=1}", WeekDays.MONDAY.toString());

        // Проверка метода ordinal(): порядковый номер должен соответствовать позиции
        assertEquals(2, WeekDays.WEDNESDAY.ordinal(), "Ordinal of WEDNESDAY should be 2");

        // Проверка метода valueOf(): должен вернуть день по строковому значению
        assertEquals(WeekDays.FRIDAY, WeekDays.valueOf("FRIDAY"), "Value of 'FRIDAY' should return WeekDay.FRIDAY");
    }

}
