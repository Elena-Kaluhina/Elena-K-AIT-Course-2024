package homework17.model_cube;
//Создать класс Cube, описывающий куб cо стороной a.
// Реализовать в нем методы определения периметра p
// (сумма длин всех ребер), площади s (сумма площадей
// всех граней) и объема v. Создать приложение CubeAppl,
// в котором создать несколько экземпляров класса Cube.
// Для каждого экземпляра вызвать методы класса Cube и р
// ассчитать p, s и v.

public class Cube {

    //fields
    private Double a; //сторона куба

    //constructor
    public Cube(Double a) {
        this.a = a;
    }

    //method for calculating perimeter
    public double getPerimeter(){
        return 12 * a; //куб имеет 12 ребёр
    }
    //method for calculating area
    public double getSurfaceArea(){
        return 6 * a * a; //у куба 6 квадратных граней
    }

    //method for calculating volume of cube
    public double getVolume(){
        return a * a * a; //объём куба
    }

    //method display
    public void display(){
        System.out.println("Cube with side: " + a);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Surface area: " + getSurfaceArea());
        System.out.println("Volume: " + getVolume());
    }
}
