package homework16.equation_model;
/*
В этом классе определить поля private double a; private double b; private double c;.
Создать конструктор public QuadraticEquation(double a, double b, double c) для
инициализации полей. Создать геттеры и сеттеры. Создать метод public void display()
для печати в консоль квадратного уравнения. Создать методы public double delta() и
public int quantityRoots() для вычисления дискриминанта и количества решений уравнения
соответственно.
 */

public class QuadratiсEquation {

    //fields
    private double a;
    private double b;
    private double c;


    //constructor
    public QuadratiсEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    //getters and setters

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    //display
    public void display(){
        System.out.println(a + " x^2 + " + b + "x + " + c + " = 0");
    }

    //метод для вычисления дискриминанты
    public double delta(){
        return b * b - 4 * a * c;
    }

    //метод для вычисления корней уравнения
    public int quantityRoots(){
        double d = delta();
        if (d > 0){
            return 2; //два различных корня
        } else if (d == 0) {
            return 1; //один корень
        }else {
            return 0; //нет корней
        }
    }
}
