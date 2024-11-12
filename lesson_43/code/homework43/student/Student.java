package homework43.student;


import java.util.List;

class Student {

    private final String name; // Имя студента
    private final List<Integer> grades; // Список оценок студента по предметам

    // Конструктор класса Student
    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    // Геттер для имени студента
    public String getName() {
        return name;
    }

    // Геттер для списка оценок
    public List<Integer> getGrades() {
        return grades;
    }

    // Метод для вычисления среднего балла студента
    public double getAverageGrade() {
        // Преобразуем список оценок в поток, суммируем и находим среднее значение
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    // Переопределение метода toString для вывода информации о студенте
    @Override
    public String toString() {
        return name + " with average grade: " + getAverageGrade();
    }
}

