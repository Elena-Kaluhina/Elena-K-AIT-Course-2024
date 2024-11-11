package homework38.temperature_analysis.model;

import java.time.LocalDate;

public class DayTemperature {

    private LocalDate date;        // Дата измерения температуры
    private double temperature;    // Температура в этот день

    // Конструктор для инициализации полей класса
    public DayTemperature(LocalDate date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    // Геттер для даты
    public LocalDate getDate() {
        return date;
    }

    // Геттер для температуры
    public double getTemperature() {
        return temperature;
    }

    // Метод для строкового представления объекта, использующий StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DayTemperature{")
                .append("date=").append(date)
                .append(", temperature=").append(temperature)
                .append("°C}");
        return sb.toString();
    }
}

