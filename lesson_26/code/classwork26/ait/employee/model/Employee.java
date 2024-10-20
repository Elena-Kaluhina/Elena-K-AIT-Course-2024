package classwork26.ait.employee.model;

import java.util.Objects;

public abstract class Employee {

    protected static double minWage = 12.48; //constants always in upper low
    protected final int id;
    protected String name;
    protected String surName;
    protected double hours;

    public static double getMinWage(){
        return minWage;
    }

    //method
    public static void setMinWage(double minWage){
        if (Employee.minWage > Employee.minWage){//если минимальная ставка больше, чем минимальная ставка работника
            Employee.minWage = minWage; //минимальная ставка работника будет = минимальной ставка
        }
    }

    //constructor
    public Employee(int id, String name, String surName, double hours) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.hours = hours;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //toString Builder
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surName='").append(surName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append('}');
        return sb.toString();
    }

    //methods for salary
    public abstract double calcSalary();

    //method "protect employee" от неверной з/п
    protected double ensureSalary(double salary){
        if (salary < hours * minWage){
            System.out.println("Set min salary.");
            salary = hours * minWage;
        }
        return salary;
    }
}
