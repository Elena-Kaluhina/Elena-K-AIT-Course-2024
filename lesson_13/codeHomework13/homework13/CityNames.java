package homework13;

public class CityNames {

    public static void main(String[] args) {
        // создаем массив с названиями городов
        String[] cities = {"New York", "Berlin", "Kiev", "Rome", "Paris", "Tokyo", "Strasbourg", "Los Angeles"};

        // вызываем метода для поиска самой короткой и самой длинной строки
        String[] result = findShortestAndLongest(cities);

        // выводим результат
        System.out.println("Shortest city name: " + result[0]); // самая короткая строка
        System.out.println("Longest city name: " + result[1]);  // самая длинная строка
    }

    // метод для поиска самой короткой и самой длинной строки в массиве
    public static String[] findShortestAndLongest(String[] array) {
        // инициализируем самую короткую и самую длинную строки
        String shortest = array[0];  // самая короткая строка - первый элемент с индексом 0
        String longest = array[0];   // самая длинная строка - первый элемент с индексом 0

        // запускаем цикл for i
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() < shortest.length()) {
                shortest = array[i];
            }
            if (array[i].length() > longest.length()) {
                longest = array[i];

            }
        }

        // присвоение значений в массив result
        String[] result = new String[2];  // cоздаем массив на 2 элемента (самой короткой и самой длинной строки)
        // и его возврат является необходимым, потому что задание требует возвращения массива,
        // а не просто вывода результатов.
        result[0] = shortest;
        result[1] = longest;

        // возвращаем массив с результатами
        return result;
    }
}


