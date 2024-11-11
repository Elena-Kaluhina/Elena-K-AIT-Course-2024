package homework37.athlete_results;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class RaceResults {

    private ArrayList<Athlete> athletes; // Список для хранения данных спортсменов

    // Конструктор, инициализирующий пустой список спортсменов
    public RaceResults() {
        athletes = new ArrayList<>();
    }

    // Метод для добавления спортсмена в список
    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    // Метод для вывода итогового протокола соревнований
    public void printFinalProtocol() {
        // Сортировка списка спортсменов по результатам
        athletes.sort(Comparator.comparingDouble(Athlete::getResult));

        System.out.println("\nFinal Results Protocol:");

        // Выводим спортсменов в отсортированном порядке
        for (int i = 0; i < athletes.size(); i++) {
            // %d - номер спортсмена, %s - строковое представление объекта, %n - перенос строки
            System.out.printf("%d. %s%n", i + 1, athletes.get(i));
        }
    }

    // Главный метод для ввода данных и вывода итогового протокола
    public static void main(String[] args) {
        RaceResults raceResults = new RaceResults(); // Создаем экземпляр для работы с результатами
        Scanner scanner = new Scanner(System.in); // Создаем сканер для ввода данных

        System.out.println("Enter race results for 10 athletes:");

        // Ввод данных для 10 спортсменов
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Athlete %d:%n", i); // Выводим номер текущего спортсмена

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine(); // Читаем фамилию

            System.out.print("First Name: ");
            String firstName = scanner.nextLine(); // Читаем имя

            System.out.print("Registration Number: ");
            int regNumber = scanner.nextInt(); // Читаем регистрационный номер
            scanner.nextLine(); // Очищаем буфер после ввода числа

            System.out.print("Club: ");
            String club = scanner.nextLine(); // Читаем название клуба

            System.out.print("Result (seconds): ");
            double result = scanner.nextDouble(); // Читаем результат
            scanner.nextLine(); // Очищаем буфер после ввода числа

            // Создаем объект Athlete и добавляем его в список результатов
            Athlete athlete = new Athlete(lastName, firstName, regNumber, club, result);
            raceResults.addAthlete(athlete);

            System.out.println(); // Пустая строка для разделения данных о спортсменах
        }

        // Выводим итоговый протокол соревнований
        raceResults.printFinalProtocol();
        scanner.close(); // Закрываем сканер после завершения ввода данных
    }
}
