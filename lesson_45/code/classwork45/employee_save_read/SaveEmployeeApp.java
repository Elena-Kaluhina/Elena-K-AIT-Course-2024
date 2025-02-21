package classwork45.employee_save_read;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SaveEmployeeApp {
    public static void main(String[] args) {

        Address address1 = new Address("Ettlingen", "Allmendstraße", 10, 3, 76275);
        Address address2 = new Address("Spessart", "Allmendstraße", 12, 5, 76275);

        Employee e1 = new Employee(1, "Peter", LocalDate.of(2000, 04, 01), 5900, address1);
        Employee e2 = new Employee(2, "Jakob", LocalDate.of(2000, 04, 10), 5800, address2);


        Set<Employee> firma = new HashSet<>();
        firma.add(e1);
        firma.add(e2);

        // отправляем в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"))) {

            oos.writeObject(firma);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}