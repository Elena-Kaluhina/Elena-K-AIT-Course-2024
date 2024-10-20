package classwork26.ait.employee.test;

import classwork26.ait.employee.dao.Company;
import classwork26.ait.employee.dao.CompanyImpl;
import classwork26.ait.employee.model.Employee;
import classwork26.ait.employee.model.Manager;
import classwork26.ait.employee.model.SalesManager;
import classwork26.ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    //fields
    Company company;
    Employee[] employees;


    @BeforeEach
    void setUp() {

        company = new CompanyImpl(5);
        employees = new Employee[4];
        employees[0] = new Manager(1, "N1", "L1", 160, 5000, 25);//grade - это почасовая ставка
        employees[1] = new SalesManager(2, "N2", "L2", 160, 50000, 0.1);
        employees[2] = new SalesManager(3, "N3", "L3", 160,  80000, 0.15);
        employees[3] = new Worker(4, "N4", "L4", 160, 20);//grade - это почасовая ставка

    }

    @Test
    void addEmployee() {

    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void updateEmployee() {
    }

    @Test
    void quantity() {
    }

    @Test
    void printEmployee() {
    }

    @Test
    void totalSalary() {
    }

    @Test
    void totalSales() {
    }

    @Test
    void findEmployeeHoursGreatThan() {
    }

    @Test
    void findEmployeeSalaryRange() {
    }
}