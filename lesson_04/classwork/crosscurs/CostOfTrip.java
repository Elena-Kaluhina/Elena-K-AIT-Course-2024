package crosscurs;

public class CostOfTrip {
    //расход топлива и стоимости на поездку
    public static void main(String[] args) {
        double distance = 760; //distance of the trip
        double fuelConsumPer100km = 10; //fuel consum in liters per 100 km
        double fuelPricePerLiter = 1.52; //price of fuel in euros per liter
        double totalCost = calculateTripCost(distance, fuelConsumPer100km, fuelPricePerLiter);
        System.out.println("Total cost of the trip: " + totalCost + " Euros ");

    }//end of main

    private static double calculateTripCost(double distance, double fuelConsumPer100km, double fuelPricePerLiter){
        double totalFuelconsum = distance / fuelConsumPer100km;
        double totalCost = totalFuelconsum * fuelPricePerLiter;
        System.out.println("Total fuel consum: " + totalFuelconsum + " liters");
        return totalCost;

    }

}//end of class
