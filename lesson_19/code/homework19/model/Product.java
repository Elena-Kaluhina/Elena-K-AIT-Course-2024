package homework19.model;
//Создать класс Product, с полями:
//private double price
//private String name
//private long barCode; Создать класс Food расширяющий класс Product с полем private String expDate,
// которое хранит дату истечения срока годности. Создать класс MeatFood расширяющий класс Food с
// полем private String meatType, которое хранит тип мяса, из которого изготовлен продукт. Создать
// класс MilkFood расширяющий класс Food с полями private String milkType, private double fat, которые
// хранят тип молока и жирность продукта соответственно. Во всех классах переопределить метод toString.
// Создать класс MarketAppl и в нем метод main. В методе main создать массив в котором хранятся по одному
// объекту для каждого продукта. Реализовать методы: печатающий все продукты из массива, и метод
// возвращающий сумму цен всех продуктов.

public class Product {
    //fields
    private double price;
    private String name;
    private long barCode;


    //constructor
    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    //getters
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public long getBarCode() {
        return barCode;
    }

    //toString
    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }

    //equals
    @Override
    public boolean equals(Object o) { // o = object
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return barCode == product.barCode;
    }
}
