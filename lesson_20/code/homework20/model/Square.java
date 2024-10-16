package homework20.model;
//Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter.
//Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга, один
// треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public class Square extends Shape {

    //constructor
    public Square(double side) {
        super(side);//передаём длину стороны в родительский класс
    }

    //method S of square
    @Override
    public double calcArea() {
        return size * size;
    }

    //method perimeter of square

    @Override
    public double calcPerimeter() {
        return 4 * size;
    }
}