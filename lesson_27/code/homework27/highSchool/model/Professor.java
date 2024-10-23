package homework27.highSchool.model;

public class Professor {

    //fields
    private String id;
    private String name;
    private String department;

    //constructor
    public Professor(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    // equals и hashCode для сравнения профессоров по id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return id.equals(professor.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Professor{id='").append(id).append('\'')
                .append(", name='").append(name).append('\'')
                .append(", department='").append(department).append('\'')
                .append('}');
        return sb.toString();
    }
}
