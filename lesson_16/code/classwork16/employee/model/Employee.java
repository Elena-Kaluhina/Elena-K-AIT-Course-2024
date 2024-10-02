package classwork16.employee.model;
//  - создадим класс Employee (работник):
//  - поля
//  - конструктор
//  - геттеры и сеттеры
//  - метод display
//  - создадим класс FirmaAppl, в котором:
//  - создаем объекты типа Employee
//  - определим зарплату и вычислим ее общую сумму.

import classwork16.car_object.model.Car;

public class Employee {
    //FIELD
    //создали поля нашего класса
    private int id;
    private String name;
    private String lastName;
    private double salary;
    private boolean gender;
    //private Adress adress;//для этого создаём в папке car_object класс Adress
    //private Car car;//если мы хотим узнать какая машина у сотрудника

    //CONSTRUCTOR
    public Employee(int id, String name, String lastName, double salary, boolean gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
    }

    //SETTER
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //GETTER
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isGender() {
        return gender;
    }

    public String displayEmployee(){
        return String.format("ID: %d, name: %s, lastname: %s, salary: %.2f, gender: %s",
                id, name, lastName,salary, gender);
    }


}
