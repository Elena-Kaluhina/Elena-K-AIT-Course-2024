package homework26.composition.model;

public class Lever extends Detail {

    //fields
    private double power;


    //constructor
    public Lever(long barCode, double size, String material, String vendor, double weight, double power) {
        super(barCode, size, material, vendor, weight);
        this.power = power;
    }


    //getters and setters
    public double getPower() {

        return power;
    }

    public void setPower(double power) {

        this.power = power;
    }


    //toStringBuilder
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lever{");
        sb.append("power=").append(power);
        sb.append(", barCode=").append(barCode);
        sb.append(", size=").append(size);
        sb.append(", material='").append(material).append('\'');
        sb.append(", vendor='").append(vendor).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
