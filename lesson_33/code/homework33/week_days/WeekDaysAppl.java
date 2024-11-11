package homework33.week_days;

public class WeekDaysAppl {

    public static void main(String[] args) {
        // Пример использования метода values(): возвращает массив всех дней недели
        WeekDays[] weekDays = WeekDays.values();
        System.out.println("All days of week:");
        for (WeekDays day : weekDays) {
            System.out.println(day); // Использует метод toString() для вывода
        }

        // Пример использования метода toString(): возвращает строковое представление дня недели
        System.out.println("String representation MONDAY: " + WeekDays.MONDAY.toString());

        // Пример использования метода ordinal(): возвращает порядковый номер дня
        System.out.println("Ordinal number WEDNESDAY: " + WeekDays.WEDNESDAY.ordinal());

        // Пример использования метода valueOf(): возвращает элемент перечисления по его имени
        WeekDays dayFromValue = WeekDays.valueOf("FRIDAY");
        System.out.println("Day from valueOf: " + dayFromValue);

        // Пример использования метода addDays: прибавляет заданное количество дней к текущему дню
        WeekDays startDay = WeekDays.MONDAY;
        int daysToAdd = 10;
        WeekDays resultDay = startDay.addDays(daysToAdd);
        System.out.println("Result of adding " + daysToAdd + " days to " + startDay + " = " + resultDay);
    }
}
