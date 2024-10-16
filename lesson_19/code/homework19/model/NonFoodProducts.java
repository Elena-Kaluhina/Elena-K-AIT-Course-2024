package homework19.model;

public class NonFoodProducts extends Product{
    //field
    private String category;

    //constructor

    public NonFoodProducts(double price, String name, long barCode, String category) {
        super(price, name, barCode);
        this.category = category;
    }

    //toString
    @Override
    public String toString() {
        return "NonFoodProducts{" +
                "category='" + category + '\'' +
                "} " + super.toString();
    }
}
