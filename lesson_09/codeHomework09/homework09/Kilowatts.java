package homework09;

/*
Анна использует различные электроприборы в своем доме.
У неё есть холодильник, который потребляет 150 Вт, и
кондиционер с потреблением 2000 Вт. Анна хочет узнать,
сколько она тратит на электроэнергию в месяц, если стоимость
1 кВт·ч составляет 0.15 евро. Вопросы: Сколько электроэнергии
тратят холодильник и кондиционер вместе в час? (calculateHourlyConsumption)
Сколько Анна тратит на электроэнергию в месяц? (calculateMonthlyCost)
 */
public class Kilowatts {
    public static void main(String[] args) {
        // Мощности приборов
        int fridgePower = 150; // Холодильник: 150 Вт
        int acPower = 2000;    // Кондиционер: 2000 Вт

        // Стоимость 1 кВт·ч
        double costPerKwh = 0.15; // Евро за кВт·ч

        // Вводим параметры
        int hoursPerDay = 24; // Приборы работают 24 часа в сутки
        int daysInMonth = 30; // Допустим, в месяце 30 дней

        // Расчет потребления энергии в час
        double hourlyConsumption = calculateHourlyConsumption(fridgePower, acPower);

        // Расчет месячной стоимости электроэнергии
        double monthlyCost = calculateMonthlyCost(hourlyConsumption, costPerKwh, hoursPerDay, daysInMonth);

        System.out.println("Потребление энергии в час: " + hourlyConsumption + " кВт·ч");
        System.out.println("Месячная стоимость электроэнергии: " + monthlyCost + " евро");

    }//end of main

    // Метод для расчета потребления энергии в час
    public static double calculateHourlyConsumption(int fridgePower, int acPower) {
        // Преобразуем ватты в киловатты
        double fridgeKw = fridgePower / 1000.0;
        double acKw = acPower / 1000.0;

        // Общая потребляемая мощность в час
        return fridgeKw + acKw;
    }

    // Метод для расчета месячной стоимости электроэнергии
    public static double calculateMonthlyCost(double hourlyConsumption, double costPerKwh, int hoursPerDay, int daysInMonth) {

        // Рассчитываем общую стоимость электроэнергии за месяц
        return hourlyConsumption * hoursPerDay * daysInMonth * costPerKwh;

    }

}//end of class


