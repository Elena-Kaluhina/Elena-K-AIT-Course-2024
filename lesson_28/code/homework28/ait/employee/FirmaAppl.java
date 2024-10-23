package homework28.ait.employee;

import classwork28.ait.employee.dao.Company;
import classwork28.ait.employee.dao.CompanyImpl;
import classwork28.ait.employee.model.Manager;
import classwork28.ait.employee.model.SalesManager;
import classwork28.ait.employee.model.Worker;
import java.util.Scanner;

public class FirmaAppl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем компанию с максимальной вместимостью 5 сотрудников
        Company company = new CompanyImpl(5);

        // Добавляем несколько сотрудников
        company.addEmployee(new Manager(1, "John", "Doe", 160, 5000, 25));
        company.addEmployee(new SalesManager(2, "Anna", "Smith", 160, 60000, 0.1));
        company.addEmployee(new Worker(3, "Mike", "Brown", 160, 20));

        // Запуск приложения
        boolean running = true;
        while (running) {
            System.out.println("\nВыберите действие:");
            System.out.println("1 - Показать всех сотрудников");
            System.out.println("2 - Добавить сотрудника");
            System.out.println("3 - Найти сотрудника по ID");
            System.out.println("4 - Удалить сотрудника");
            System.out.println("5 - Показать общую зарплату");
            System.out.println("6 - Показать общие продажи");
            System.out.println("7 - Найти сотрудников по количеству отработанных часов");
            System.out.println("8 - Найти сотрудников по диапазону зарплат");
            System.out.println("9 - Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();  // поглощаем оставшуюся новую строку

            switch (choice) {
                case 1:
                    company.printEmployee();
                    break;
                case 2:
                    addEmployee(scanner, company);
                    break;
                case 3:
                    findEmployee(scanner, company);
                    break;
                case 4:
                    removeEmployee(scanner, company);
                    break;
                case 5:
                    System.out.println("Общая сумма зарплат: " + company.totalSalary());
                    break;
                case 6:
                    System.out.println("Общая сумма продаж: " + company.totalSales());
                    break;
                case 7:
                    findEmployeesByHours(scanner, company);
                    break;
                case 8:
                    findEmployeesBySalaryRange(scanner, company);
                    break;
                case 9:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private static void addEmployee(Scanner scanner, Company company) {
        System.out.println("Введите тип сотрудника (1 - Manager, 2 - Sales Manager, 3 - Worker):");
        int type = scanner.nextInt();
        System.out.println("Введите ID:");
        int id = scanner.nextInt();
        System.out.println("Введите имя:");
        String name = scanner.next();
        System.out.println("Введите фамилию:");
        String surname = scanner.next();
        System.out.println("Введите количество часов:");
        double hours = scanner.nextDouble();

        switch (type) {
            case 1:
                System.out.println("Введите базовую зарплату:");
                double baseSalary = scanner.nextDouble();
                System.out.println("Введите уровень (grade):");
                int grade = scanner.nextInt();
                company.addEmployee(new Manager(id, name, surname, hours, baseSalary, grade));
                break;
            case 2:
                System.out.println("Введите объём продаж:");
                double salesValue = scanner.nextDouble();
                System.out.println("Введите процент:");
                double percent = scanner.nextDouble();
                company.addEmployee(new SalesManager(id, name, surname, hours, salesValue, percent));
                break;
            case 3:
                System.out.println("Введите уровень (grade):");
                int workerGrade = scanner.nextInt();
                company.addEmployee(new Worker(id, name, surname, hours, workerGrade));
                break;
            default:
                System.out.println("Неверный тип сотрудника.");
        }
    }

    private static void findEmployee(Scanner scanner, Company company) {
        System.out.println("Введите ID сотрудника для поиска:");
        int id = scanner.nextInt();
        var employee = company.findEmployee(id);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Сотрудник не найден.");
        }
    }

    private static void removeEmployee(Scanner scanner, Company company) {
        System.out.println("Введите ID сотрудника для удаления:");
        int id = scanner.nextInt();
        var removedEmployee = company.removeEmployee(id);
        if (removedEmployee != null) {
            System.out.println("Сотрудник удалён: " + removedEmployee);
        } else {
            System.out.println("Сотрудник не найден.");
        }
    }

    private static void findEmployeesByHours(Scanner scanner, Company company) {
        System.out.println("Введите минимальное количество часов для поиска сотрудников:");
        int hours = scanner.nextInt();
        var employees = company.findEmployeeHoursGreatThan(hours);
        if (employees.length > 0) {
            for (var emp : employees) {
                System.out.println(emp);
            }
        } else {
            System.out.println("Сотрудники не найдены.");
        }
    }

    private static void findEmployeesBySalaryRange(Scanner scanner, Company company) {
        System.out.println("Введите минимальную зарплату:");
        double minSalary = scanner.nextDouble();
        System.out.println("Введите максимальную зарплату:");
        double maxSalary = scanner.nextDouble();
        var employees = company.findEmployeeSalaryRange(minSalary, maxSalary);
        if (employees.length > 0) {
            for (var emp : employees) {
                System.out.println(emp);
            }
        } else {
            System.out.println("Сотрудники не найдены.");
        }
    }
}
