package homework31.countries;

// Создать класс Country с полями название и население.
// Класс должен поддерживать сортировку по населению.

import java.util.Objects;

public class Country implements Comparable<Country> {

    private String name; // название страны
    private int population; // население страны

    // Конструктор для инициализации полей name и population
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name; // возвращает название страны
    }

    public void setName(String name) {
        this.name = name; // устанавливает новое значение для названия страны
    }

    public int getPopulation() {
        return population; // возвращает население страны
    }

    public void setPopulation(int population) {
        this.population = population; // устанавливает новое значение для населения страны
    }

    @Override
    public boolean equals(Object o) {
        // Проверяет, равны ли текущий объект и объект o
        if (this == o) return true;
        if (!(o instanceof Country country)) return false;
        // Сравнивает поля name и population
        return population == country.population && Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population); // вычисляет хэш-код на основе name и population
    }

    @Override
    public String toString() {
        // Создает форматированную строку с информацией о стране
        // %s - подставляет название страны (name)
        // %d - подставляет население страны (population)
        return String.format("Country name: %s, population: %d", name, population);
    }

    @Override
    public int compareTo(Country o) {
        // Сравнивает текущий объект с объектом o по полю population
        return Integer.compare(this.getPopulation(), o.getPopulation());
    }
}
