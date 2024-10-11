package homework16.students;

public class StudentAppl {
    public static void main(String[] args) {

        //создаём студентов
        Student student1 = new Student(123, "Petr", "Ivanov", 1981, "Chirurg");
        Student student2 = new Student(235, "Emily", "Petrova", 1979, "Ingeneer");
        Student student3 = new Student(56724345, "Vladislav", "Bunny", 1949, "Lawyer");

        //выводим информацию о студентах
        student1.display();
        student2.display();
        student3.display();

        //студенческая учёба
        System.out.println("\nLearning process: ");
        student1.study();
        student2.study();
        student3.study();

        //сдача экзаменов
        System.out.println("\nExams: ");
        student1.passExam();
        student2.passExam();
        student3.passExam();

        //один из студентов ушёл в отпуск
        System.out.println("\nHolidays: ");
        student3.holidays();

        //двое из студентов заболели
        System.out.println("\nDeafness: ");
        student1.deafness();
        student2.deafness();

        //один на работе
        System.out.println("\nWork: ");
        student2.work();
    }
}
