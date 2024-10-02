package crosscurs;
// Напишите метод, который переводит морские мили в километры.
// Формулу пересчета найти в Интернете.
// Вызовите метод в main.
// Формула: 1 миля = 1852 метра = 1.852км
// но в интернете пишется, что 1 миля = 1.60934 км

public class MillieKilometres {

    public static void main(String[] args) {
        // Пример использования метода для пересчета морских миль в километры
        // Значение в морских милях
        double nauticalMiles = 10;// Переводим морские мили в километры
        double kilometers = nauticalMilesToKilometers(nauticalMiles);// Выводим результат
        System.out.println(nauticalMiles + " морских миль соответствует " + kilometers + " километрам");

        //перевод дорожных миль в километры
        double roadMiles = 20;//количество миль, которые мы будем переводить
        double kilometers1 = roadMilesToKilometers(roadMiles);
        System.out.println(roadMiles + " миль соответствуют " + kilometers1 + " километрам ");


    } // end of main

    // Метод для перевода морских миль в километры
    // 1 морская миля = 1.852 километра
    //begin of method
    public static double nauticalMilesToKilometers(double nauticalMiles) {
        return nauticalMiles * 1.852; // Преобразуем морские мили в километры

    }//end of method

    //метод для перевода дорожных миль в километры
    //1 миля = 1.60934
    //begin of method
    public static double roadMilesToKilometers(double roadMiles) {
        return roadMiles * 1.60934;

    }//end of the method

} // end of class

