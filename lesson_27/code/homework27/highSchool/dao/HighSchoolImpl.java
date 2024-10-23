package homework27.highSchool.dao;

import homework27.highSchool.model.Student;

import java.util.ArrayList;
import java.util.List;

public class HighSchoolImpl implements HighSchool {

    private List<Student> students;

    public HighSchoolImpl() {
        this.students = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);  // Create
    }

    @Override
    public Student findStudentById(String id) {
        for (Student student : students) {  // Read
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findStudentsByGpaRange(double minGpa, double maxGpa) {
        List<Student> result = new ArrayList<>();  // Read
        for (Student student : students) {
            if (student.getGpa() >= minGpa && student.getGpa() <= maxGpa) {
                result.add(student);
            }
        }
        return result;
    }

    @Override
    public void updateStudent(Student updatedStudent) {  // Update
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(updatedStudent.getId())) {
                students.set(i, updatedStudent);  // Обновляем студента
                break;
            }
        }
    }

    @Override
    public void removeStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));  // Delete
    }

    @Override
    public double calculateAverageGpa() {
        return students.stream().mapToDouble(Student::getGpa).average().orElse(0);  // Расчёт среднего балла
    }

    @Override
    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);  // Печать всех студентов
        }
    }
}

