package classwork18.computer_shop.model;

public class SmartPhone extends Laptop{

    //fields
    private long imei;

    //constructor
    public SmartPhone(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color, long imea) {
        super(cpu, ram, ssd, brand, price, displaySize, weight, batteryLife, color);
        this.imei = imei;
    }

    //method to string

    @Override
    public String toString() {
        return "SmartPhone{" +
                "imei=" + imei +
                "} " + super.toString();
    }
}

