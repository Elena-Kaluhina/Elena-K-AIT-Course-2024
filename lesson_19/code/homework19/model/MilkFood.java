package homework19.model;

public class MilkFood extends Food {

    //fields
    private String milkType;
    private double fat;

    //constructor
    public MilkFood(double price, String name, long barCode, String expDate, String milkType, double fat) {
        super(price, name, barCode, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    //getters
    public String getMilkType() {
        return milkType;
    }

    public double getFat() {
        return fat;
    }

    //toString
    @Override
    public String toString() {
        return "MilkFood{" +
                "milkType='" + milkType + '\'' +
                ", fat=" + fat +
                ", " + super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        MilkFood that = (MilkFood) o;
        return Double.compare(that.fat, fat) == 0 && milkType.equals(that.milkType);
    }
}
