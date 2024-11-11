package homework33.to_do;

public enum MenuOption {

    // Перечисление MenuOption содержит пункты меню для управления списком дел
    ADD_TASK(1, "Add a task"),
    VIEW_TASKS(2, "View all tasks"),
    DELETE_TASK(3, "Delete a task by number"),
    EXIT(4, "Exit the menu");

    // Поля для номера и описания действия
    private final int number;
    private final String description;

    // Конструктор для инициализации полей
    MenuOption(int number, String description) {
        this.number = number;
        this.description = description;
    }

    // Геттер для получения номера пункта меню
    public int getNumber() {
        return number;
    }

    // Геттер для получения описания действия
    public String getDescription() {
        return description;
    }

    // Метод для получения строкового представления пункта меню
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(number).append(" - ").append(description);
        return sb.toString();
    }
}