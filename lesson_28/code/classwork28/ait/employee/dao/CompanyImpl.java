package classwork28.ait.employee.dao;

import classwork28.ait.employee.model.Employee;
import classwork28.ait.employee.model.SalesManager;

public class CompanyImpl implements Company {

    private Employee[] employees; //элемент массива employees[0] типа Employee
    private int size;

    //constructor (capacity - возможное количество сотрудников)
    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = size;
    }


    @Override
    public boolean addEmployee(Employee employee) {
        //bad cases
        if (employee == null){
            return false;
        }
        if (size == employees.length){
            return false;
        }
        if (findEmployee(employee.getId()) != null){
            return false;
        }

        //good case
        employees[size] = employee;
        size++;
        return true;
    }


    @Override
    public Employee removeEmployee(int id) {

        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                Employee victim = employees[i];
                employees[i] = employees[size -1];
                employees[size -1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }


    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
        return null;
    }


    @Override
    public Employee updateEmployee(Employee employee) {

        return null;
    }



    @Override
    public int quantity() {

        return size;
    }




    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }



    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }
        return totalSalary;
    }



    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager){ //обязательная проверка перед кастингом
                SalesManager sm = (SalesManager) employees[i];
                totalSales += sm.getSalesValue();
            }

        }
        return totalSales;
    }



    @Override
    public Employee[] findEmployeeHoursGreatThan(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double minSalary, double maxSalary) {
        return new Employee[0];
    }
}
