package classwork18.inheritance.people.model;

public class Employee extends Human{

    int id;
    double salary;
    String jobTitle;
    int workExperience;

    //CONSTRUCTOR
    public Employee(boolean gender, double height, double weight, String race, String country, String eyeColor, int id, double salary, String jobTitle, int workExperience) {
        super(gender, height, weight, race, country, eyeColor);
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.workExperience = workExperience;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", workExperience=" + workExperience +
                "} " + super.toString();
    }
}
