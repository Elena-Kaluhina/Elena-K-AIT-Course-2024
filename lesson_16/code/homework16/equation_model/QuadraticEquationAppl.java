package homework16.equation_model;
/*
Создать клас EquationAppl в пакете equation с методом main. В методе main создать
несколько экземпляров QuadraticEquation и вывести для каждого из них результаты
работы методов display, delta, quantityRoots.
 */

public class QuadraticEquationAppl {
    public static void main(String[] args) {

        //создаём экземпляры
        QuadratiсEquation equation1 = new QuadratiсEquation(2, -3, 4);//уравнение 2x^2-3+4=0
        QuadratiсEquation equation2 = new QuadratiсEquation(2,3,2); //уравнение 2x^2+3+2=0
        QuadratiсEquation equation3 = new QuadratiсEquation(1,0,-4); //уравнение x^2-4=0

        //display
        System.out.println("Equation 1: ");
        equation1.display();
        System.out.println("Delta: " + equation1.delta());
        System.out.println("Quantity of roots: " + equation1.quantityRoots());

        System.out.println("\nEquation 2: ");
        equation2.display();
        System.out.println("Delta " + equation2.delta());
        System.out.println("Quantity of roots: " + equation2.quantityRoots());

        System.out.println("\nEquation 3: ");
        equation3.display();
        System.out.println("Delta: " + equation3.delta());
        System.out.println("Quantity of roots: " + equation3.quantityRoots());
    }

}
