package homework30.myClass;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    //fields
    private String name; // имя
    private int age; // возраст
    private double weight; // вес
    private String city; // город проживания
    private boolean isEmployed; // занятость (работает или нет)
    private double height; // рост
    private String gender; // пол

    //constructor
    public Person(String name, int age, double weight, String city, boolean isEmployed, double height, String gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.city = city;
        this.isEmployed = isEmployed;
        this.height = height;
        this.gender = gender;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static Comparator<Person> getCompareByNameAndAge() {
        return compareByNameAndAge;
    }

    public static void setCompareByNameAndAge(Comparator<Person> compareByNameAndAge) {
        Person.compareByNameAndAge = compareByNameAndAge;
    }

    public static Comparator<Person> getCompareByWeightAndHeight() {
        return compareByWeightAndHeight;
    }

    public static void setCompareByWeightAndHeight(Comparator<Person> compareByWeightAndHeight) {
        Person.compareByWeightAndHeight = compareByWeightAndHeight;
    }

    // метод для сортировки по умолчанию (по возрасту)
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    //toStringBuilder
    public StringBuilder toStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", weight=").append(weight);
        sb.append(", city=").append(city);
        sb.append(", isEmployed=").append(isEmployed);
        sb.append(", height=").append(height);
        sb.append(", gender=").append(gender);
        sb.append('}');
        return sb;
    }

    //сортировка по двум критериям
    public static Comparator<Person> compareByNameAndAge = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            int nameComparison = p1.getName().compareTo(p2.getName());
            if (nameComparison != 0) {
                return nameComparison;
            }
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    };

    public static Comparator<Person> compareByWeightAndHeight = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            int weightComparison = Double.compare(p1.getWeight(), p2.getWeight());
            if (weightComparison != 0) {
                return weightComparison;
            }
            return Double.compare(p1.getHeight(), p2.getHeight());
        }
    };
}
