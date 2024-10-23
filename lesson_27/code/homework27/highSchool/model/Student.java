package homework27.highSchool.model;

public class Student {

    //fields
    private String id;  // ID студента
    private String name;
    private double gpa;  // Средний балл (Grade Point Average)


    //constructor
    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    // equals и hashCode для сравнения студентов по id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{id='").append(id).append('\'')
                .append(", name='").append(name).append('\'')
                .append(", gpa=").append(gpa)
                .append('}');
        return sb.toString();
    }
}

