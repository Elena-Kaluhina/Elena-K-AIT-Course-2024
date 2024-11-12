package homework43.student;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentGradeAppl {

    public static void main(String[] args) {

        Random random = new Random(); // Создаем генератор случайных чисел

        // Генерируем список из 20 студентов с их случайными оценками
        List<Student> students = IntStream.range(1, 21) // Создаем поток чисел от 1 до 20
                .mapToObj(i -> new Student("Student: " + i, // Для каждого числа создаем студента с уникальным именем
                        random.ints(10, 1, 6).boxed().collect(Collectors.toList()))) // Генерируем 10 случайных оценок от 1 до 5
                .collect(Collectors.toList()); // Сохраняем всех студентов в список

        // Находим студента с максимальным средним баллом
        Student topStudent = students.stream() // Преобразуем список студентов в поток
                .max(Comparator.comparingDouble(Student::getAverageGrade)) // Ищем студента с наибольшим средним баллом
                .orElse(null); // Если список пуст, возвращаем null

        // Находим студента с минимальным средним баллом
        Student bottomStudent = students.stream() // Преобразуем список студентов в поток
                .min(Comparator.comparingDouble(Student::getAverageGrade)) // Ищем студента с наименьшим средним баллом
                .orElse(null); // Если список пуст, возвращаем null

        // Выводим студента с наивысшим средним баллом
        System.out.println("Student with highest average grade: " + topStudent);

        // Выводим студента с наименьшим средним баллом
        System.out.println("Student with lowest average grade: " + bottomStudent);
    }
}

