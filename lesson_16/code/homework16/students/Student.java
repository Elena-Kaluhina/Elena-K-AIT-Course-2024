package homework16.students;
/*
Создать класс Студент (Student) с приватными полями:
- id
- имя
- фамилия
- год рождения
- специализация

Стандартные методы:
- конструктор на все поля;
- геттеры и сеттеры на все поля;
- метод display

Дополнительные методы:
- учиться
- взять отпуск
- сдать экзамен
- заболеть
- работать
 */

public class Student {

    //fields
    private int id;
    private String firstName;
    private String lastName;
    private int birthYear;
    private String specialisation;


    //constructor
    public Student(int id, String firstName, String lastName, int birthYear, String specialisation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.specialisation = specialisation;
    }


    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }


    //method display
    public void display(){
        System.out.println("ID: " + id + ", Name: " + firstName + ", Lastname: " + lastName + ", Year of birth: " + birthYear + ", Specialisation:  " + specialisation + ".");
    }


    //additional methods
    public void study(){
        System.out.println(firstName + " " + lastName + " is studying " + specialisation + ".");
    }

    public void holidays(){
        System.out.println(firstName + " " + lastName + " is on holidays.");
    }

    public void passExam(){
        System.out.println(firstName + " " + lastName + " passed the exam in " + specialisation + ".");
    }

    public void deafness(){
        System.out.println(firstName + " " + lastName + ", now he is ill.");
    }

    public void work(){
        System.out.println(firstName + " " + lastName + " with ID number: " + id + " is now working.");
    }
}
