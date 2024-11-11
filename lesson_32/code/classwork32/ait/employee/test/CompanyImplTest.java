package classwork32.ait.employee.test;

import classwork32.ait.employee.dao.Company;
import classwork32.ait.employee.dao.CompanyImpl;
import classwork32.ait.employee.model.Employee;
import classwork32.ait.employee.model.Manager;
import classwork32.ait.employee.model.SalesManager;
import classwork32.ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    //fields
    Company company;
    Employee[] employees;


    @BeforeEach
    void setUp() {
        //здесь мы создаём объект
        company = new CompanyImpl(5);
        //а здесь мы его заполняем
        employees = new Employee[4];
        employees[0] = new Manager(1, "N1", "L1", 160, 5000, 25);//grade - это почасовая ставка
        employees[1] = new SalesManager(2, "N2", "L2", 170, 50000, 0.1);
        employees[2] = new SalesManager(3, "N3", "L3", 165,  80000, 0.15);
        employees[3] = new Worker(4, "N4", "L4", 160, 20);//grade - это почасовая ставка

        // TODO поместить объекты emp[] в объект company c помощью метода addEmployee
        for (int i = 0; i < 4; i++) {
            company.addEmployee(employees[i]);
        }
    }

    @Test
    void addEmployeeTest() {
        //check size
        assertEquals(4, company.quantity());

        //can't add null
        assertFalse(company.addEmployee(null));

        //can't add duplicate
        assertFalse(company.addEmployee(employees[1]));

        //can add new one employee
        Employee newEmployees = new Worker(5, "N5", "L5", 160, 20);
        assertTrue(company.addEmployee(newEmployees));

        //check size/quantity
        assertEquals(5, company.quantity());

        //can't add one more employee
        Employee oneMoreEmployees = new Worker(6, "N6", "L6", 160, 20);
        assertFalse(company.addEmployee(oneMoreEmployees));
    }

    @Test
    void removeEmployeeTest() {
        // can remove existed
        assertEquals(employees[1], company.removeEmployee(2));

        //check size
        assertEquals(3,company.quantity());

        //can't remove absent
        assertNull(company.removeEmployee(7));
    }


    @Test
    void findEmployeeTest() {
        //find existed
        assertEquals(employees[2], company.findEmployee(3));

        //find absent
        assertNull(company.findEmployee(7));
    }


    @Test
    @DisplayName("Update employee is working...")
    void updateEmployeeTest() {
        Employee upDateEmployee = new SalesManager(2,"n2", "New2Name", 170, 55000, 0.1);
        assertEquals("New2Name", company.updateEmployee(upDateEmployee).getSurName());

    }


    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
    }


    @Test
    void printEmployeeTest() {
        company.printEmployee();
        //методы типа void не проверяются с помощью assert...

    }


    @Test
    void totalSalaryTest() {
        double totalSalary = 29200; //это предположение
        assertEquals(totalSalary, company.totalSalary());

    }



    @Test
    void totalSalesTest() {
        assertEquals(130000, company.totalSales());

    }



    @Test
    void findEmployeeHoursGreatThanTest() {
        Employee[] expected = {employees[1], employees[2]};
        Employee[] actual = company.findEmployeeHoursGreatThan(160);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeeSalaryRangeTest() {
        Employee[] expected = {employees[0], employees[1], employees[3]};
        Employee[] actual = company.findEmployeeSalaryRange(3000, 10000);
        assertArrayEquals(expected, actual);

    }
}