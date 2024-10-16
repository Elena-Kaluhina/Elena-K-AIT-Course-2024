package homework17.model_cube;

public class CubeAppl {
    public static void main(String[] args) {

        //создаём экземпляры класса Cube
        Cube cube1 = new Cube(5.0);//пишем обязательно с точкой, иначе выдаёт ошибку
        Cube cube2 = new Cube(7.0);
        Cube cube3 = new Cube(3.0);

        //вызов метода
        System.out.println("Cube 1: ");
        cube1.display();

        System.out.println("\nCube 2: ");
        cube2.display();

        System.out.println("\nCube 3: ");
        cube3.display();
    }
}
