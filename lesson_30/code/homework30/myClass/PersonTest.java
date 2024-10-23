package homework30.myClass;

import java.util.Arrays;

public class PersonTest {
    public static void main(String[] args) {
        //создание массива объектов Person с новыми полями
        Person[] people = {
                new Person("Alice", 30, 60.5, "New York", true, 165.0, "Female"),
                new Person("Bob", 25, 75.0, "Los Angeles", false, 180.0, "Male"),
                new Person("Charlie", 35, 85.0, "Chicago", true, 175.0, "Male"),
                new Person("David", 40, 70.5, "Miami", true, 170.0, "Male")
        };

        //сортировка по умолчанию (по возрасту)
        Arrays.sort(people);
        System.out.println("Sorting by age:");
        for (Person person : people) {
            System.out.println(person.toStringBuilder());
        }

        //сортировка по двум критериям: по имени и возрасту
        Arrays.sort(people, Person.compareByNameAndAge);
        System.out.println("\nSorting by name and age:");
        for (Person person : people) {
            System.out.println(person.toStringBuilder());
        }

        //сортировка по весу и росту
        Arrays.sort(people, Person.compareByWeightAndHeight);
        System.out.println("\nSorting by weight and height:");
        for (Person person : people) {
            System.out.println(person.toStringBuilder());
        }

        //поиск в массиве с использованием Arrays.binarySearch (после сортировки по возрасту)
        Arrays.sort(people); //сортировка перед бинарным поиском по возрасту
        int index = Arrays.binarySearch(people, new Person("David", 40, 70.5, "Miami", true, 170.0, "Male"));
        System.out.println("\nSearch result for 'David':");
        if (index >= 0) {
            System.out.println("Found: " + people[index].toStringBuilder());
        } else {
            System.out.println("Not found.");
        }
    }
}
