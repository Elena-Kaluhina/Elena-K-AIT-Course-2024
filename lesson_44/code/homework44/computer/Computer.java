package homework44.computer;

class Computer {

    private final String manufacturer;
    private final String model;
    private final int year;
    private final String processor;
    private final int ram; // Оперативная память в ГБ
    private final double price;

    public Computer(String manufacturer, String model, int year, String processor, int ram, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.processor = processor;
        this.ram = ram;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("Computer{")
            .append("manufacturer='").append(manufacturer).append('\'')
            .append(", model='").append(model).append('\'')
            .append(", year=").append(year)
            .append(", processor='").append(processor).append('\'')
            .append(", ram=").append(ram)
            .append("GB, price=").append(price)
            .append('}')
            .toString();
    }
}