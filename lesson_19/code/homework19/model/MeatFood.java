package homework19.model;

public class MeatFood extends Food {
    private String meatType;

    public MeatFood(double price, String name, long barCode, String expDate, String meatType) {
        super(price, name, barCode, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    @Override
    public String toString() {
        return "MeatFood{" +
                "meatType='" + meatType + '\'' +
                ", " + super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        MeatFood that = (MeatFood) o;
        return meatType.equals(that.meatType);
    }
}
