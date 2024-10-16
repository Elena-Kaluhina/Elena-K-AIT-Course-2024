package homework20.model;
//Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter.
//Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга, один
// треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public class Triangle extends Shape { private double height;

    //constructor для стороны и высоты треугольника
    public Triangle(double base, double height) {
        super(base);//передаем длину основания в родительский класс
        this.height = height;
    }

    //method для расчёта площади треугольника
    @Override
    public double calcArea() {
        return 0.5 * size * height;
    }

    //method для расчёта периметра равностороннего треугольника
    @Override
    public double calcPerimeter() {
        return 3 * size;
    }
}
