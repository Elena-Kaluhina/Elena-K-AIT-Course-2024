package classwork32.ait.employee.model;
// - создать дочерние классы Manager, SalesManager и Worker, реализовать в них методы начисления зарплаты:
// - Manager: base + grade*hours
// - SalesManager: salesValue * percent
// - Worker: grade*hours

public class SalesManager extends Employee {//делаем имплементацию из Employee

    private double salesValue;
    private double percent;

    //constructor
    public SalesManager(int id, String name, String surName, double hours, double salesValue, double percent) {
        super(id, name, surName, hours);
        this.salesValue = salesValue;
        this.percent = percent;
    }

    //getters and setters
    public double getSalesValue(){
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    //method
    @Override
    public double calcSalary() {
        double salary = salesValue * percent;
        return ensureSalary(salary);
    }
}
