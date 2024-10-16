package homework20.model;
//Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter.
//Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга, один
// треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public class Circle extends Shape {

    //constructor
    public Circle(double radius) {
        super(radius);//передаём радиус в родительский класс
    }

    //метод для расчёта площади круга
    @Override
    public double calcArea() {
        return Math.PI * size * size; //S = π * r^2
    }

    //метод для расчёта периметра

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * size; //Perimeter = 2 * π * r
    }
}
