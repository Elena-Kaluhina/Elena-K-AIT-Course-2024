package homework33.week_days;

public enum WeekDays {

    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    // Поля для названия и номера дня недели.
    // Используем final, чтобы сделать их неизменяемыми после инициализации,
    // так как каждый день недели — это постоянное значение.
    private final String name;
    private final int dayNumber;

    // Конструктор, инициализирующий поля name и dayNumber для каждого элемента перечисления WeekDay.
    WeekDays(String name, int dayNumber) {
        this.name = name;
        this.dayNumber = dayNumber;
    }

    // Геттер для получения названия дня недели
    public String getName() {
        return name;
    }

    // Геттер для получения номера дня недели
    public int getDayNumber() {
        return dayNumber;
    }

    // Метод addDays позволяет прибавить указанное количество дней к текущему дню недели.
    // Использует текущее значение ordinal() (индекс) и прибавляет к нему daysToAdd.
    // Результат делится по модулю на количество дней в неделе (7), чтобы зацикливать неделю.
    public WeekDays addDays(int daysToAdd) {
        WeekDays[] days = WeekDays.values(); // Получаем массив всех дней недели
        int currentIndex = this.ordinal(); // Получаем порядковый номер текущего дня недели
        int newIndex = (currentIndex + daysToAdd) % days.length; // Вычисляем индекс конечного дня
        return days[newIndex]; // Возвращаем конечный день недели
    }

    // Метод toString создает строковое представление дня недели с использованием StringBuilder.
    // Это позволяет более эффективно создавать строку, особенно если добавляется много значений.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WeekDay{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dayNumber=").append(dayNumber);
        sb.append('}');
        return sb.toString();
    }
}
