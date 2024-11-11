package homework38.temperature_analysis;

import homework38.temperature_analysis.model.DayTemperature;

import java.time.LocalDate;
import java.util.ArrayList;

public class TemperatureAnalysis {

    public static void main(String[] args) {

        // Создаем два списка для хранения данных о температуре:
        // один для последней недели октября и один для первой недели ноября

        ArrayList<DayTemperature> octoberTemps = new ArrayList<>();
        ArrayList<DayTemperature> novemberTemps = new ArrayList<>();

        // Заполняем список данными о температуре за последнюю неделю октября
        octoberTemps.add(new DayTemperature(LocalDate.of(2024, 10, 25), 15.0));
        octoberTemps.add(new DayTemperature(LocalDate.of(2024, 10, 26), 14.2));
        octoberTemps.add(new DayTemperature(LocalDate.of(2024, 10, 27), 13.5));
        octoberTemps.add(new DayTemperature(LocalDate.of(2024, 10, 28), 12.0));
        octoberTemps.add(new DayTemperature(LocalDate.of(2024, 10, 29), 10.5));
        octoberTemps.add(new DayTemperature(LocalDate.of(2024, 10, 30), 9.8));
        octoberTemps.add(new DayTemperature(LocalDate.of(2024, 10, 31), 11.2));

        // Заполняем список данными о температуре за первую неделю ноября
        novemberTemps.add(new DayTemperature(LocalDate.of(2024, 11, 1), 8.6));
        novemberTemps.add(new DayTemperature(LocalDate.of(2024, 11, 2), 9.1));
        novemberTemps.add(new DayTemperature(LocalDate.of(2024, 11, 3), 10.4));
        novemberTemps.add(new DayTemperature(LocalDate.of(2024, 11, 4), 11.5));
        novemberTemps.add(new DayTemperature(LocalDate.of(2024, 11, 5), 12.3));
        novemberTemps.add(new DayTemperature(LocalDate.of(2024, 11, 6), 13.8));
        novemberTemps.add(new DayTemperature(LocalDate.of(2024, 11, 7), 14.0));

        // Объединяем оба списка в один список allTemps
        ArrayList<DayTemperature> allTemps = new ArrayList<>();
        allTemps.addAll(octoberTemps);
        allTemps.addAll(novemberTemps);

        // Переменные для вычислений средней, минимальной и максимальной температур
        double totalTemp = 0; // Общая сумма температур для расчета средней
        double minTemp = Double.MAX_VALUE; // Начальное значение для минимальной температуры
        double maxTemp = Double.MIN_VALUE; // Начальное значение для максимальной температуры
        LocalDate minTempDate = null; // Дата с минимальной температурой
        LocalDate maxTempDate = null; // Дата с максимальной температурой

        // Перебираем каждый день в allTemps и выполняем необходимые вычисления
        for (DayTemperature day : allTemps) {
            double temp = day.getTemperature(); // Получаем температуру текущего дня
            totalTemp += temp; // Добавляем к общей сумме для последующего расчета средней

            // Проверка на минимальную температуру
            if (temp < minTemp) {
                minTemp = temp;
                minTempDate = day.getDate(); // Сохраняем дату с минимальной температурой
            }

            // Проверка на максимальную температуру
            if (temp > maxTemp) {
                maxTemp = temp;
                maxTempDate = day.getDate(); // Сохраняем дату с максимальной температурой
            }
        }

        // Рассчитываем среднюю температуру за две недели
        double averageTemp = totalTemp / allTemps.size();
        System.out.printf("Average temperature over the past two weeks: %.2f°C%n", averageTemp);

        // Выводим день с минимальной температурой, если такой день найден
        if (minTempDate != null) {
            // %s — выводит дату, %.2f — выводит температуру с двумя знаками после запятой
            System.out.printf("Day with minimum temperature: %s (%.2f°C)%n", minTempDate, minTemp);
        }

        // Выводим день с максимальной температурой, если такой день найден
        if (maxTempDate != null) {
            System.out.printf("Day with maximum temperature: %s (%.2f°C)%n", maxTempDate, maxTemp);
        }
    }
}


//Инициализация списков octoberTemps и novemberTemps:
//Эти списки предназначены для хранения данных о температуре за последнюю неделю октября и первую неделю ноября.
//Заполнение списков данными о температуре:
//В каждый список добавляется по одному объекту DayTemperature для каждого дня недели.
//Объединение списков в allTemps:
//Все данные объединяются в один список allTemps, чтобы можно было проводить вычисления сразу для всех двух недель.
//Переменные для вычисления средних, минимальных и максимальных значений:
//totalTemp — суммирует все значения температур для последующего расчета средней.
//minTemp и maxTemp — используются для хранения минимальной и максимальной температур.
//minTempDate и maxTempDate — сохраняют даты, соответствующие минимальной и максимальной температуре.
//Цикл for для вычислений:
//Перебирает каждый объект DayTemperature в списке allTemps.
//Обновляет totalTemp, minTemp, maxTemp, minTempDate, и maxTempDate по мере необходимости.
//Расчет и вывод средней температуры:
//Средняя температура рассчитывается как totalTemp / allTemps.size().
//Выводится с помощью System.out.printf, где %.2f форматирует значение до двух знаков после запятой.
//Вывод дней с минимальной и максимальной температурой:
//Используется формат "%s (%.2f°C)%n":
//%s выводит дату.
//%.2f выводит температуру с двумя знаками после запятой.
//%n — символ переноса строки.
