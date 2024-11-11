package homework37.computer.model;

public class Computer {

    private String brand;
    private int ram; // объем RAM в ГБ
    private int ssd; // объем SSD в ГБ

    public Computer(String brand, int ram, int ssd) {
        this.brand = brand;
        this.ram = ram;
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer{")
                .append("brand='").append(brand).append('\'')
                .append(", ram=").append(ram)
                .append(", ssd=").append(ssd)
                .append('}');
        return sb.toString();
    }
}
