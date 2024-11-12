package classwork44.programmer_and_technologies;

//1. Кто из программистов знает больше всего языков (поименно)
// Ф И -> количество языков или количество языков -> программист
//2. Какие языки пользуются популярностью среди наших программистов
//язык программирования -> сколько программистов его знают

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProgrammerAppl {

    public static void main(String[] args) {

        // data set
        List<Programmer> programmers = fillListProgrammers(); // Programmers - это новый объект
        // System.out.println(programmers); // печатает одной строкой
        programmers.forEach(System.out::println); // печатает каждого программиста с новой строки

        // print Technology
        System.out.println("===================== List of technologies =====================");
        printTechnologies(programmers);

        // print popular Technology
        System.out.println("===================== Frequency, popular  technologies =====================");
        // technology => frequency
        printTechnologiesByFrequency(programmers);

        System.out.println("===================== Frequency, popular  technologies, sorted =====================");
        printTechnologiesByFrequencySorted(programmers);

        System.out.println("======================= Technology rating =========================");
        printTechnologyRating(programmers);

//        System.out.println("========================= Most skilled Programmers ==============================");
//        printMostSkilledProgrammers(programmers);


    }// end of main

//    private static void printMostSkilledProgrammers(List<Programmer> programmers) {
//        Map<Integer, List<Programmer>> skilledProgrammers = programmers.stream()
//                .collect(Collectors.groupingBy(p -> p.getTechnology().size()));
//
//        skilledProgrammers.forEach(key, value) -> System.out.println(key + " : " + value);
//    }


    private static void printTechnologyRating(List<Programmer> programmers) {
       Map<String, Long> technologyCount = programmers.stream()
               .flatMap(programmer -> programmer.getTechnology().stream())
               .collect(Collectors.groupingBy(technology -> technology, Collectors.counting()));

       technologyCount.entrySet().stream()
               .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
               .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }


    private static void printTechnologiesByFrequencySorted(List<Programmer> programmers) {
        List<String> technologies = programmers.stream()
                .map(Programmer::getTechnology)
                .flatMap(List::stream)
                .distinct()
                .sorted().toList();
        technologies.forEach(System.out::println);
    }


    private static void printTechnologiesByFrequency(List<Programmer> programmers) {
        // Map frequency => technology
        Map<String, Long> technologiesByFrequency = programmers.stream()
                .map(Programmer::getTechnology)  // получаем список технологий каждого программиста
                .flatMap(List::stream)           // объединяем списки в единый поток
                .collect(Collectors.groupingBy(   // группируем по названию технологии
                        technology -> technology,     // ключ - название технологии
                        Collectors.counting()         // считаем количество каждой технологии
                ));
        System.out.println(technologiesByFrequency);
    }


    private static void printTechnologies(List<Programmer> programmers) {
        List<String> technologies = programmers.stream()
                .map(Programmer::getTechnology) //преобразование с помощью map, какие языки знает программист, взяли их с помощью get
                .flatMap(List::stream) // а здесь мы объединили их в один список
                //.distinct() // здесь мы убрали дубликаты
                .sorted()
                .toList();
        System.out.println(technologies);

        // 2-й способ убрать дубликаты
        StreamSupport.stream(technologies.spliterator(), false)
                .distinct()
                .forEach(System.out::println);
    }


    private static List<Programmer> fillListProgrammers() {
        return List.of(
                new Programmer("Peter", List.of("C++", "Python", "Java", "Kotlin")),
                new Programmer("John", List.of("Python", "Java")),
                new Programmer("Helen", List.of("Kotlin", "Scala", "Java", "JavaScript")),
                new Programmer("Jakob", List.of("Python", "Go")),
                new Programmer("Mike", List.of("Fortran", "Algol", "PL-1"))
        );
    }
} // end of class
