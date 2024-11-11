package homework38.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupDivider {

    public static void main(String[] args) {

        // Создаем список из 17 студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Smith", "Female", 20));
        students.add(new Student("Bob", "Johnson", "Male", 21));
        students.add(new Student("Charlie", "Brown", "Male", 19));
        students.add(new Student("David", "Williams", "Male", 22));
        students.add(new Student("Eva", "Jones", "Female", 23));
        students.add(new Student("Frank", "Garcia", "Male", 20));
        students.add(new Student("Grace", "Miller", "Female", 21));
        students.add(new Student("Hannah", "Davis", "Female", 22));
        students.add(new Student("Ian", "Martinez", "Male", 23));
        students.add(new Student("Jane", "Lopez", "Female", 20));
        students.add(new Student("Kevin", "Gonzalez", "Male", 21));
        students.add(new Student("Linda", "Wilson", "Female", 22));
        students.add(new Student("Mike", "Anderson", "Male", 19));
        students.add(new Student("Nina", "Thomas", "Female", 20));
        students.add(new Student("Oscar", "Taylor", "Male", 22));
        students.add(new Student("Paula", "Moore", "Female", 21));
        students.add(new Student("Rick", "Jackson", "Male", 23));

        // Перемешиваем список случайным образом
        Collections.shuffle(students);

        // Находим индекс середины для разделения списка на две группы
        int midIndex = students.size() / 2;

        // Создаем две группы: вторая группа может быть больше на одного человека
        List<Student> group1 = new ArrayList<>(students.subList(0, midIndex));
        List<Student> group2 = new ArrayList<>(students.subList(midIndex, students.size()));

        // Выводим первую группу студентов
        System.out.println("Group 1:");
        for (Student student : group1) {
            System.out.println(student);
        }

        // Выводим вторую группу студентов
        System.out.println("\nGroup 2:");
        for (Student student : group2) {
            System.out.println(student);
        }
    }
}
