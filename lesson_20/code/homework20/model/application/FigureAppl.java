package homework20.model.application;

import homework20.model.Circle;
import homework20.model.Shape;
import homework20.model.Square;
import homework20.model.Triangle;

public class FigureAppl {
    public static void main(String[] args) {

        //создаём массив
        Shape[] shapes = {new Circle(5), new Circle(7), new Triangle(6, 4), new Square(4)};

        //переменные для общей площади и периметра
        double totalArea = 0;
        double totalPerimeter = 0;

        //проходим по всем фигурам в массиве и суммируем их площади и периметры
        for (Shape shape : shapes){
            totalArea += shape.calcArea();
            totalPerimeter += shape.calcPerimeter();
        }
        //выводим результат
        System.out.println("Total area of all figures: " + totalArea);
        System.out.println("Total perimeter of all figures: " + totalPerimeter);
    }
}
//Абстрактный класс Shape содержит поле size, которое используется для хранения основного параметра фигуры (радиус для
//круга, сторона для квадрата, основание для треугольника). Также в нём определены два абстрактных метода calcArea и
//calcPerimeter, которые должны быть реализованы в дочерних классах
