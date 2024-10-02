package mathematics;
//Метод вычисляющий площадь квадрата по его стороне;
//Метод вычисляющий площадь круга по его радиусу;
//Метод вычисляющий периметр прямоугольника по двум сторонам; В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль. Например:
//площадь круга для R = 200 равна ...
//Площадь квадрата со стороной 500 составляет ...
//Периметр прямоугольника со сторонами 1000 и 2000 равен ...
//Добавить методы, вычисляющие (*)
//Величину 3-го угла треугольника по известным первым двум.
//Площадь треугольника по стороне и высоте треугольника.
//Гипотенузу по двум катетам (теорема Пифагора).

public class Geometry1 {

    // Метод для вычисления площади квадрата по его стороне
    // Формула: S = a^2
    // S - площадь квадрата, a - длина стороны
    public static double calculateSquareArea(double side) {
        return side * side; // Возвращает площадь квадрата
    }

    // Метод для вычисления площади круга по его радиусу
    // Формула: S = π * r^2
    // S - площадь круга, r - радиус круга
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius; // Используем значение π из Math.PI
    }

    // Метод для вычисления периметра прямоугольника по двум сторонам
    // Формула: P = 2 * (a + b)
    // P - периметр прямоугольника, a и b - стороны прямоугольника
    public static double calculateRectanglePerimeter(double side1, double side2) {
        return 2 * (side1 + side2); // Суммируем стороны и умножаем на 2 для получения периметра
    }

    // Метод для вычисления третьего угла треугольника по двум известным углам
    // Формула: γ = 180° - (α + β)
    // γ - третий угол, α и β - два известных угла треугольника
    public static double calculateThirdAngle(double angle1, double angle2) {
        return 180 - (angle1 + angle2); // Вычитаем сумму двух углов из 180 градусов
    }

    // Метод для вычисления площади треугольника по стороне и высоте
    // Формула: S = 1/2 * a * h
    // S - площадь треугольника, a - основание, h - высота
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height; // Возвращает половину произведения основания и высоты
    }

    // Метод для вычисления гипотенузы по двум катетам (теорема Пифагора)
    // Формула: c = √(a^2 + b^2)
    // c - гипотенуза, a и b - катеты прямоугольного треугольника
    public static double calculateHypotenuse(double sideA, double sideB) {
        return Math.sqrt((sideA * sideA) + (sideB * sideB)); // Возвращает корень суммы квадратов катетов
    }

    public static void main(String[] args) {
        //вызов методов

        //площадь квадрата со стороной 500
        double squareSide = 500;
        double squareArea = calculateSquareArea(squareSide);
        System.out.println("The area of a square with side " + squareSide + " is " + squareArea);

        //площадь круга с радиусом 200
        double circleRadius = 200;
        double circleArea = calculateCircleArea(circleRadius);
        System.out.println("The area of a circle with radius " + circleRadius + " is " + circleArea);

        //периметр прямоугольника со сторонами 1000 и 2000
        double rectangleSide1 = 1000;
        double rectangleSide2 = 2000;
        double rectanglePerimeter = calculateRectanglePerimeter(rectangleSide1, rectangleSide2);
        System.out.println("The perimeter of a rectangle with sides " + rectangleSide1 + " and " + rectangleSide2 + " is " + rectanglePerimeter);

        //третий угол треугольника, если два угла 45 и 60 градусов
        double angle1 = 45;
        double angle2 = 60;
        double thirdAngle = calculateThirdAngle(angle1, angle2);
        System.out.println("The third angle of a triangle is " + thirdAngle);

        //площадь треугольника с основанием 100 и высотой 50
        double triangleBase = 100;
        double triangleHeight = 50;
        double triangleArea = calculateTriangleArea(triangleBase, triangleHeight);
        System.out.println("The area of a triangle with base " + triangleBase + " and height " + triangleHeight + " is " + triangleArea);

        //гипотенуза треугольника с катетами 3 и 4 (теорема Пифагора)
        double sideA = 3;
        double sideB = 4;
        double hypotenuse = calculateHypotenuse(sideA, sideB);
        System.out.println("The hypotenuse of a triangle with sides " + sideA + " and " + sideB + " is " + hypotenuse);

    } // end of main

} // end of class

