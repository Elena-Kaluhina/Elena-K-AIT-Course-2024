package classwork28.ait.employee.model;
// - создать дочерние классы Manager, SalesManager и Worker, реализовать в них методы начисления зарплаты:
// - Manager: base + grade*hours
// - SalesManager: salesValue * percent
// - Worker: grade*hours

public class Manager extends Employee {//когда эта строка подчёркивается красным, нажимаем на красную лампочку
                                      //и имплементируем метод, который будет ниже

    private double baseSalary;
    private int grade;//некий уровень з/п (коэфициент) (стоимость человеко-часа)

    //constructor
    public Manager(int id, String name, String surName, double hours, double baseSalary, int grade) {
        super(id, name, surName, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    //getters and setters
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    //нужно обязательно имплементировать
    @Override
    public double calcSalary() {
        double salary = baseSalary + hours * grade;
        return ensureSalary(salary);//check min value of salary
    }
}
