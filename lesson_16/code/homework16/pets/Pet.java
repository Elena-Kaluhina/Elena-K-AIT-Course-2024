package homework16.pets;
/*
Создать класс Pet (Домашнее животное) с приватными полями:
- id
- вид
- возраст
- кличка

Стандартные методы:
- конструктор на все поля;
- геттеры и сеттеры на все поля;
- метод toString
*/

public class Pet {

    //FIELDS
    private int id; //присвоение ID
    private String species; //вид животного
    private int age; //возраст животного
    private String nickName; //кличка животного

    //CONSTRUCTOR
    public Pet(int id, String species, int age, String nickName) {
        this.id = id;
        this.species = species;
        this.age = age;
        this.nickName = nickName;
    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    //toSTRING
    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
