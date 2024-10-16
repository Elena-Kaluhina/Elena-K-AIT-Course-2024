package homework18.pet;
/*
 В классе Pet имеются поля:
- id
- вид
- возраст
- кличка

Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями:
- порода
- рост
- вес

Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки.
Смоделируйте жизнь в этом доме в течение дня.
 */

public class Pet {

    //fields
    protected int id;
    protected String view;
    protected int age;
    protected String nickName;

    //constructor
    public Pet(int id, String view, int age, String nickName) {
        this.id = id;
        this.view = view;
        this.age = age;
        this.nickName = nickName;
    }

    //метод, который переопределяется в дочерних классах
    public void voice(){
        System.out.println("This pet doesn't make a specific sound.");
    }

}
