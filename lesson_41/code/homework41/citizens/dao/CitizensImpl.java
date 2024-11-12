package homework41.citizens.dao;

import homework41.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Класс CitizenImpl реализует интерфейс Citizens, представляющий методы для работы с людьми
public class CitizensImpl implements Citizens {

    // Компараторы для сортировки по фамилии и возрасту
    // статические переменные класса
    private static Comparator<Person> lastNameComparator; // Компаратор для сравнения по фамилии
    private static Comparator<Person> ageComparator; // Компаратор для сравнения по возрасту

    // Статический блок инициализации, задает логику сравнения для сортировки по фамилии и возрасту
    // Статический блок для инициализации компараторов
    static {
        // Компаратор для сортировки по фамилии, затем по ID, если фамилии совпадают
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // Сравниваем по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // Если фамилии одинаковые, тогда сравниваем по id
        };
        // Компаратор для сортировки по возрасту, затем по ID, если возраст одинаковый
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // Сравниваем по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // Если возраст равен, тогда сравниваем по id
        };
    }

    // Списки для хранения людей, отсортированных по разным критериям
    // fields
    private List<Person> idList; // Список отсортированный по ID
    private List<Person> lastNameList; // Список отсортированный по фамилии
    private List<Person> ageList; // Список отсортированный по возрасту

    // Конструктор без параметров инициализирующий пустые списки
    public CitizensImpl() {
        idList = new ArrayList<>(); // Создаем пустой список для хранения людей по ID
        lastNameList = new ArrayList<>(); // Создаем пустой список для хранения людей по фамилии
        ageList = new ArrayList<>(); // Создаем пустой список для хранения людей по возрасту
    }

    // Конструктор с параметром, который добавляет всех граждан из списка citizens
    // Конструктор, принимающий список людей и добавляющий их в хранилище
    public CitizensImpl(List<Person> citizens) {
        this(); // Инициализация списков через основной конструктор
        citizens.forEach(p -> add(p)); // Добавляем каждого человека в списки
    }

    // O(log(n))
    // Добавляет человека в списки, если его еще нет
    // Метод add добавляет нового гражданина в отсортированные списки.
    // O(log(n)) - для добавления в отсортированные списки через binarySearch и добавления по индексу
    @Override
    public boolean add(Person person) {
        // что проверяем?
        if (person == null) { // Проверяем, что передан непустой объект
            return false; // Если объект пустой, возвращаем false — добавление не выполнено
        }
        // что делает этот код?
        // Ищем позицию для вставки в idList по ID, используя бинарный поиск
        int index = Collections.binarySearch(idList, person); // что делаем? // O(log(n))
        if (index >= 0) { // что делаем, если index >= 0? // Если ID уже существует в списке
            return false; // Возвращаем false, так как дубликаты не допускаются
        }
        index = -index - 1; // что делаем с index? зачем? // Пересчитываем индекс для вставки, если человек не найден
        idList.add(index, person); // что делаем? // Вставляем человека в idList на вычисленную позицию

        // что делается в методе далее?
        // Повторяем процесс для вставки по возрасту в ageList
        index = Collections.binarySearch(ageList, person, ageComparator); // O(log(n))
        index = index >= 0 ? index : -index - 1; // Пересчитываем индекс, если не найден
        ageList.add(index, person); // Вставляем в ageList

        // Повторяем процесс для вставки по фамилии в lastNameList
        index = Collections.binarySearch(lastNameList, person, lastNameComparator); // O(log(n))
        index = index >= 0 ? index : -index - 1; // Пересчитываем индекс, если не найден
        lastNameList.add(index, person); // O(1) // Вставляем в lastNameList

        return true; // Возвращаем true, так как добавление выполнено успешно
    }


    // O - ???
    // Метод remove удаляет человека по ID из всех списков.
    // Сложность: O(n) — удаление требует поиска и возможного сдвига элементов в списках
    @Override
    public boolean remove(int id) {
        Person victim = find(id); // Ищем человека с данным ID с помощью метода find
        if (victim == null) { // Если человек не найден
            return false; // Возвращаем false, так как удалять нечего
        }
        idList.remove(victim); // Удаляем из idList
        ageList.remove(victim); // Удаляем из ageList
        lastNameList.remove(victim); // Удаляем из lastNameList
        return true; // Возвращаем true, так как удаление выполнено успешно
    }

    // O - ???
    // Метод find находит человека по ID.
    // Сложность: O(log(n)) — использует бинарный поиск в отсортированном списке
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now()); // Создаем шаблон объекта для поиска по ID
        int index = Collections.binarySearch(idList, pattern); // Ищем индекс с помощью бинарного поиска
        return index < 0 ? null : idList.get(index); // Если не найдено, возвращаем null; иначе — объект
    }

    // O - ???
    // Находит людей в заданном возрастном диапазоне от minAge до maxAge
    // Сложность: O(log(n) + k), где k — количество людей в возрастном диапазоне
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now(); // Получаем текущую дату

        // Находим начальную позицию для minAge
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge)); // Шаблон для минимального возраста
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1; // Позиция для вставки minAge

        // Находим конечную позицию для maxAge
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge)); // Шаблон для максимального возраста
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1; // Позиция для вставки maxAge
        return ageList.subList(from, to); // to - правый край не входит // Возвращаем подсписок людей в указанном возрастном диапазоне
    }

    // O - ???
    // Находит всех людей с указанной фамилией.
    // Сложность: O(log(n) + k), где k — количество людей с той же фамилией
    @Override
    public Iterable<Person> find(String lastName) {

        LocalDate now = LocalDate.now(); // Получаем текущую дату

        // Находим начальную позицию для фамилии
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now); // Шаблон для поиска фамилии
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1; // Позиция для вставки

        // Находим конечную позицию для фамилии
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now); // Шаблон для поиска фамилии
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1; // Позиция для вставки
        return lastNameList.subList(from, to); // to - правый край не входит // Возвращаем подсписок людей с указанной фамилией
    }

    // O - ???
    // Метод getAllPersonSortedById возвращает всех людей, отсортированных по id.
    // Сложность: O(1), так как список уже отсортирован и не требует дополнительной обработки.
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;
    }

    // O - ???
    // Метод getAllPersonSortedByLastName возвращает всех людей, отсортированных по фамилии.
    // Сложность: O(1), так как список уже отсортирован.
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameList;
    }

    // O - ???
    // Метод getAllPersonSortedByAge возвращает всех людей, отсортированных по возрасту.
    // Сложность: O(1), так как список уже отсортирован.
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;
    }

    // O - ???
    // Метод size возвращает количество людей в списке.
    // Сложность: O(1), так как обращается к полю размера списка.
    @Override
    public int size() {
        return idList.size();
    }
}


//  Объяснение сложности операций
//  O(1) — Константная сложность: операция выполняется за фиксированное время, независимо от размера данных.
//  O(log(n)) — Логарифмическая сложность: операция выполняется за логарифмическое время от размера данных,
//  что означает, что выполнение операции ускоряется по мере увеличения размера списка
//  O(n) — Линейная сложность: операция требует обхода всех элементов списка, что может замедлить выполнение
//  при большом //количестве данных.
