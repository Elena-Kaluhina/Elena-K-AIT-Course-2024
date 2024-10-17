package homework23.italienVacation;

import homework23.italienVacation.modelAuto.Auto;

public class AutoRentalApp {
    public static void main(String[] args) {

        //создаем массив автомобилей
        Auto[] cars = {
                new Auto("Audi", 'd', 6.6, 45),
                new Auto("BMW", 'b', 6.8, 49),
                new Auto("Opel", 'd', 6.9, 45),
                new Auto("VW", 'd', 6.5, 39),
                new Auto("Mercedes", 'b', 6.3, 49)
        };

        //цены на топливо
        double dieselPrice = 1.6;
        double benzinePrice = 1.8;

        //общая дистанция поездки
        double totalDistance = 3000; // 3000 км

        //переменные для поиска наименьшей стоимости
        double minCost = Double.MAX_VALUE;
        Auto bestCar = null;

        //рассчитываем стоимость для каждого автомобиля
        for (Auto car : cars) {
            double tripCost = car.calculateTripCost(totalDistance, dieselPrice, benzinePrice);
            System.out.println("Cost for " + car.getBrand() + ": " + tripCost + " euros");

            if (tripCost < minCost) {
                minCost = tripCost;
                bestCar = car;
            }
        }

        //выводим наилучший вариант
        if (bestCar != null) {
            System.out.println("The best car to choose is: " + bestCar.getBrand() + " with a total cost of: " + minCost + " euros");
        }
    }
}

