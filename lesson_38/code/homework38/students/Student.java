package homework38.students;

import java.util.Objects;

public class Student {

    // fields
    private String firstName;  // Имя студента
    private String lastName;   // Фамилия студента
    private String gender;     // Гендер ("Male" или "Female")
    private int age;           // Возраст студента

    // constructor
    public Student(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return age == student.age && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, age);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(" ")
                .append(lastName).append(", ")
                .append(gender).append(", age ")
                .append(age);
        return sb.toString();
    }
}
