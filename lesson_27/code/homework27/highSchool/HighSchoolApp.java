package homework27.highSchool;

import homework27.highSchool.dao.HighSchool;
import homework27.highSchool.dao.HighSchoolImpl;
import homework27.highSchool.model.Student;

public class HighSchoolApp {

    public static void main(String[] args) {

        HighSchool highSchool = new HighSchoolImpl();


        Student student1 = new Student("001", "Alice", 3.8);
        Student student2 = new Student("002", "Bob", 2.5);
        highSchool.addStudent(student1);
        highSchool.addStudent(student2);

        //чтение студентов по диапазону GPA (операция Read)
        System.out.println("Students with GPA between 3.0 and 4.0:");
        highSchool.findStudentsByGpaRange(3.0, 4.0).forEach(System.out::println);

        //обновление студента (операция Update)
        System.out.println("Updating GPA for student 001...");
        Student updatedStudent = new Student("001", "Alice", 4.0);
        highSchool.updateStudent(updatedStudent);
        System.out.println("Updated student: " + highSchool.findStudentById("001"));

        //удаление студента (операция Delete)
        System.out.println("Removing student 002...");
        highSchool.removeStudent("002");

        //печать всех студентов (операция Read)
        System.out.println("All students in the high school:");
        highSchool.printAllStudents();

        //подсчёт среднего GPA
        System.out.println("Average GPA: " + highSchool.calculateAverageGpa());
    }
}

