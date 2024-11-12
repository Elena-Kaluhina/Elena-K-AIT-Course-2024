package homework41.citizens.dao;

import homework41.citizens.model.Person;

import java.util.HashSet;
import java.util.Set;

public class CitizensSetImpl implements Citizens {

    private Set<Person> citizensSet; // Set для хранения уникальных объектов Person

    // Конструктор инициализирует пустой HashSet
    public CitizensSetImpl() {
        citizensSet = new HashSet<>();
    }

    // Метод добавления Person в Set
    // Средняя сложность O(1), так как HashSet использует хеширование
    @Override
    public boolean add(Person person) {
        return person != null && citizensSet.add(person); // добавляет только уникальные объекты
    }

    // Метод удаления Person по id
    // Средняя сложность O(1) для поиска и удаления, т.к. используется хеширование
    @Override
    public boolean remove(int id) {
        Person victim = find(id); // ищем объект по id
        return victim != null && citizensSet.remove(victim); // удаляем, если найден
    }

    // Метод поиска Person по id
    // Средняя сложность O(n), так как приходится перебирать все элементы
    @Override
    public Person find(int id) {
        for (Person person : citizensSet) { // проходим по каждому Person
            if (person.getId() == id) {
                return person; // возвращаем, если id совпал
            }
        }
        return null; // возвращаем null, если объект не найден
    }

    // Метод нахождения Person в диапазоне возраста
    // Средняя сложность O(n), требуется обход всех элементов
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        Set<Person> ageRangeSet = new HashSet<>(); // создаем новый Set для результатов
        for (Person person : citizensSet) {
            int age = person.getAge();
            if (age >= minAge && age <= maxAge) { // проверка диапазона
                ageRangeSet.add(person); // добавляем в результат
            }
        }
        return ageRangeSet;
    }

    // Метод нахождения Person по фамилии
    // Средняя сложность O(n), требуется обход всех элементов
    @Override
    public Iterable<Person> find(String lastName) {
        Set<Person> lastNameSet = new HashSet<>(); // новый Set для хранения результатов
        for (Person person : citizensSet) {
            if (person.getLastName().equals(lastName)) { // сравниваем фамилию
                lastNameSet.add(person); // добавляем в результат
            }
        }
        return lastNameSet;
    }

    // Метод возвращает всех Person, упорядоченных по id
    // Средняя сложность O(n), так как требуются операции перебора и сортировки
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return citizensSet.stream().sorted((p1, p2) -> Integer.compare(p1.getId(), p2.getId())).toList();
    }

    // Метод возвращает всех Person, упорядоченных по фамилии
    // Средняя сложность O(n log(n)) из-за сортировки
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return citizensSet.stream().sorted((p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName());
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId());
        }).toList();
    }

    // Метод возвращает всех Person, упорядоченных по возрасту
    // Средняя сложность O(n log(n)) из-за сортировки
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return citizensSet.stream().sorted((p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge());
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId());
        }).toList();
    }

    // Метод возвращает количество элементов в Set
    // Сложность O(1), так как это просто обращение к полю размера
    @Override
    public int size() {
        return citizensSet.size();
    }
}

//Сравнение сложности операций с реализацией на ArrayList
//Операция	                    ArrayList	               HashSet в CitizensSetImpl
//add	                     O(log(n)) + O(n) 	                   O(1) средняя
//                         (вставка по индексу)

//remove	                       O(n)	                           O(1) средняя

//find (по id)                  O(log(n))	                       O(n)

//find                        	O(log(n))	                       O(n)
//(по возрасту/фамилии)

//getAllPersonSortedBy...	       O(1)             	       O(n log(n)) (сортировка при запросе)
//                          (уже отсортирован)

//size	                           O(1)                         	O(1)

//Использование HashSet повышает производительность добавления и удаления, но увеличивает сложность
// поиска и сортировки, так как HashSet не сохраняет порядок элементов.
