package homework20.model;
//Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter.
//Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга, один
// треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public abstract class Shape {
    //fields (радиуса, стороны)
    protected double size;

    //constructor
    public Shape(double size) {
        this.size = size;
    }

    //methods
    public abstract double calcArea();
    public abstract double calcPerimeter();
}
