package homework17.klava;

import java.util.Scanner;

/*
Реализовать приложение, которое запрашивает информацию о вас, и выводит итоговую строку.
Пример: Введите ваше имя: Иван Введите вашу фамилию: Иванов Введите ваш город: Берлин
Введите ваш возраст: 29 Введите ваш рост (в метрах): 1.80
Вывод в консоль: Меня зовут Иван Иванов, мне 29 лет, мой город Берлин, мой рост 180 см.
 */
public class UserInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name, please: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name, please: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter your city, please: ");
        String city = scanner.nextLine();

        System.out.println("Enter your age, please: ");
        int age = scanner.nextInt();

        System.out.println("Enter your height (in meters), please: ");
        double heightMeters = scanner.nextDouble();

        int heightCm = (int) (heightMeters * 100);

        System.out.println("My name is: " + firstName + " " + lastName + ", I am " + age + " years old and I live in " + city + ", and my height is " + heightCm + " cm.");

    }
}
