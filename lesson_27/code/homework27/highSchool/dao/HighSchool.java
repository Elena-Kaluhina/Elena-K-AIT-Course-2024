package homework27.highSchool.dao;

import homework27.highSchool.model.Student;

import java.util.List;

public interface HighSchool {

    void addStudent(Student student);

    Student findStudentById(String id);

    List<Student> findStudentsByGpaRange(double minGpa, double maxGpa);

    void updateStudent(Student student);

    void removeStudent(String id);

    double calculateAverageGpa();

    void printAllStudents();
}

