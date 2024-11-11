package homework31.rivers;

// Создать класс River с полями название и длина.
// Класс должен поддерживать сортировку по длине.

import java.util.Objects;

public class River implements Comparable<River> {

    private String name; // название реки
    private int length; // длина реки в километрах

    // Конструктор для инициализации полей name и length
    public River(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name; // возвращает название реки
    }

    public void setName(String name) {
        this.name = name; // устанавливает новое значение для названия реки
    }

    public int getLength() {
        return length; // возвращает длину реки
    }

    public void setLength(int length) {
        this.length = length; // устанавливает новое значение для длины реки
    }

    @Override
    public boolean equals(Object o) {
        // Проверяет, равны ли текущий объект и объект o
        if (this == o) return true;
        if (!(o instanceof River river)) return false;
        // Сравнивает поля name и length
        return length == river.length && Objects.equals(name, river.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length); // вычисляет хэш-код на основе name и length
    }

    @Override
    public String toString() {
        // Создает форматированную строку с информацией о реке
        return String.format("River name: %s, length: %d km", name, length);
    }

    @Override
    public int compareTo(River o) {
        // Сравнивает текущий объект с объектом o по полю length
        return Integer.compare(this.getLength(), o.getLength());
    }
}
