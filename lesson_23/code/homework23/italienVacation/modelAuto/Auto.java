package homework23.italienVacation.modelAuto;
//Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км. Имеется информация о
// 5 автомобилях на жидком топливе (бензин или дизтопливо):
//марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
//тип расходуемого топлива: d, b, d, d, b
//стоимость 1 литра топлива: d - 1.6, b - 1.8
//расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
//стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49
// Какой автомобиль ей следует выбрать, исходя из минимальной стоимости?

public class Auto {

    //fields
    private String brand;
    private char fuelType; // 'd' для дизеля, 'b' для бензина
    private double fuelConsumption; //расход на 100 км
    private double rentalCost; //стоимость аренды за неделю

    //constructor
    public Auto(String brand, char fuelType, double fuelConsumption, double rentalCost) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.rentalCost = rentalCost;
    }

    public String getBrand() {
        return brand;
    }

    public double calculateTripCost(double distance, double dieselPrice, double benzinePrice) {
        double fuelCost = 0;
        if (fuelType == 'd') {
            fuelCost = (fuelConsumption / 100) * distance * dieselPrice;
        } else if (fuelType == 'b') {
            fuelCost = (fuelConsumption / 100) * distance * benzinePrice;
        }
        return fuelCost + rentalCost;
    }

}
