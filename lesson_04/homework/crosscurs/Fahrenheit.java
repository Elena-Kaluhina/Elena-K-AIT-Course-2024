package crosscurs;

public class Fahrenheit {
    // Напишите метод, который переводит градусы Цельсия в градусы по Фаренгейту.
    // Формулу пересчета найти в Интернете.
    // Вызовите метод в main.
    // Формула: F = (9/5) * C + 32
    public static void main(String[] args) {

        double celsius = 25;//температура в градусах Цельсия
        double fahrenheit = celsiusToFahrenheit(celsius);//переводим Цельсии в Фаренгейты
        System.out.println(celsius + "°C соответствует " + fahrenheit + "°F");//для того чтобы сделать градусы зажимаем клавишы
                                                                              //Option + shift + 8
    } // end of main

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }

} // end of class


