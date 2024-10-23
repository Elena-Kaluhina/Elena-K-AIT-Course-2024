package homework27.highSchool.test;

import homework27.highSchool.dao.HighSchool;
import homework27.highSchool.dao.HighSchoolImpl;
import homework27.highSchool.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HighSchoolTest {

    private HighSchool highSchool;

    @BeforeEach
    public void setUp() {
        highSchool = new HighSchoolImpl();  // Используем реализацию HighSchoolImpl
    }

    @Test
    public void testAddStudent() {
        Student student = new Student("001", "Alice", 3.8);
        highSchool.addStudent(student);
        assertEquals(student, highSchool.findStudentById("001"));  // Проверяем добавление студента
    }

    @Test
    public void testFindStudentsByGpaRange() {
        Student student1 = new Student("001", "Alice", 3.8);
        Student student2 = new Student("002", "Bob", 2.5);
        highSchool.addStudent(student1);
        highSchool.addStudent(student2);

        List<Student> students = highSchool.findStudentsByGpaRange(3.0, 4.0);  // Read по среднему баллу
        assertEquals(1, students.size());
        assertTrue(students.contains(student1));
        assertFalse(students.contains(student2));
    }

    @Test
    public void testUpdateStudent() {
        Student student = new Student("001", "Alice", 3.8);
        highSchool.addStudent(student);

        // Обновляем студента
        Student updatedStudent = new Student("001", "Alice", 4.0);
        highSchool.updateStudent(updatedStudent);  // Update

        // Проверяем, что студент обновился
        Student found = highSchool.findStudentById("001");
        assertEquals(4.0, found.getGpa());
    }

    @Test
    public void testRemoveStudent() {
        Student student = new Student("001", "Alice", 3.8);
        highSchool.addStudent(student);
        highSchool.removeStudent("001");  // Delete
        assertNull(highSchool.findStudentById("001"));
    }

    @Test
    public void testCalculateAverageGpa() {
        Student student1 = new Student("001", "Alice", 3.8);
        Student student2 = new Student("002", "Bob", 2.5);
        highSchool.addStudent(student1);
        highSchool.addStudent(student2);

        double averageGpa = highSchool.calculateAverageGpa();  // Расчёт среднего балла
        assertEquals(3.15, averageGpa, 0.001);  // (3.8 + 2.5) / 2 = 3.15
    }

    @Test
    public void testPrintAllStudents() {
        Student student1 = new Student("001", "Alice", 3.8);
        Student student2 = new Student("002", "Bob", 2.5);
        highSchool.addStudent(student1);
        highSchool.addStudent(student2);

        // Проверим, что метод printAllStudents не вызывает ошибок
        assertDoesNotThrow(() -> highSchool.printAllStudents());
    }
}

