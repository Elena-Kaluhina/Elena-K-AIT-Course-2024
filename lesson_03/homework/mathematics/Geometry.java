package mathematics;

//Метод вычисляющий площадь квадрата по его стороне;
//Метод вычисляющий площадь круга по его радиусу;
//Метод вычисляющий периметр прямоугольника по двум сторонам; В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль. Например:
//площадь круга для R = 200 равна ...
//Площадь квадрата со стороной 500 составляет ...
//Периметр прямоугольника со сторонами 1000 и 2000 равен ...

public class Geometry{

    // Метод для вычисления площади квадрата по его стороне
    // Формула: S = a^2
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // Метод для вычисления площади круга по его радиусу
    // Формула: S = π * r^2
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Метод для вычисления периметра прямоугольника по двум сторонам
    // Формула: P = 2 * (a + b)
    public static double calculateRectanglePerimeter(double side1, double side2) {
        return 2 * (side1 + side2);
    }

    public static void main(String[] args) {
        // Пример использования методов

        // Площадь круга с радиусом 200
        double radius = 200;
        double circleArea = calculateCircleArea(radius);
        System.out.println("Площадь круга для R = " + radius + " равна " + circleArea);

        // Площадь квадрата со стороной 500
        double side = 500;
        double squareArea = calculateSquareArea(side);
        System.out.println("Площадь квадрата со стороной " + side + " составляет " + squareArea);

        // Периметр прямоугольника со сторонами 1000 и 2000
        double side1 = 1000;
        double side2 = 2000;
        double rectanglePerimeter = calculateRectanglePerimeter(side1, side2);
        System.out.println("Периметр прямоугольника со сторонами " + side1 + " и " + side2 + " равен " + rectanglePerimeter);
    }//end of main

}//end of class

