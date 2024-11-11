package homework33.to_do;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoListApp {

    // Основной метод для запуска приложения
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu(); // Выводим меню для пользователя
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем оставшуюся строку после ввода числа

            switch (choice) {
                case 1 -> addTask(scanner);  // Вызывает метод для добавления задачи
                case 2 -> viewTasks();       // Вызывает метод для просмотра всех задач
                case 3 -> deleteTask(scanner); // Вызывает метод для удаления задачи
                case 4 -> {
                    System.out.println("Exiting the menu.");
                    running = false; // Завершает цикл и выходит из программы
                }
                default -> System.out.println("Invalid choice. Please try again."); // Обработка некорректного ввода
            }
        }
        scanner.close(); // Закрываем Scanner в конце работы программы
    }

    // Список для хранения задач
    private static List<String> tasks = new ArrayList<>();

    // Метод printMenu выводит на экран доступные пункты меню
    public static void printMenu() {
        System.out.println("Todo List Application Menu:");
        for (MenuOption option : MenuOption.values()) {
            System.out.println(option); // Использует метод toString() из MenuOption для вывода
        }
    }

    // Метод для добавления новой задачи
    private static void addTask(Scanner scanner) {
        System.out.print("Enter a new task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Метод для просмотра всех задач
    private static void viewTasks() {
        System.out.println("Your tasks:");
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Метод для удаления задачи по номеру
    private static void deleteTask(Scanner scanner) {
        viewTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks to delete.");
            return;
        }

        System.out.print("Enter the task number to delete: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Считываем оставшуюся строку после ввода числа

        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            String removedTask = tasks.remove(taskNumber - 1);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
