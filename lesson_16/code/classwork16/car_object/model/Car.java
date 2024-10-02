package classwork16.car_object.model;

public class Car {

    //FIELD
    //описали поля объекта
    private String brand;
    private int year;
    private double price;
    private String color;
    private boolean isNew;

    //CONSTRUCTOR
    //теперь соберем все предыдущие поля в одно имя
    //вызываем constructor и собираем в один объект типа car (через правую кнопку мыши: Generate, constructor)
    //это метод, но он ничего не возвращает, он называется по имени класса и
    //по сути он void - овский
    public Car(String brand, int year, double price, String color, boolean isNew) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.isNew = isNew;
    }

    //GETTERS AND SETTERS
    //будут помогать устанавливать и считывать значения
    //правая кнопка мыши и выбираем: Generate, getters and setters
    //зажимаем shift и выделяем все элементы, нажимаем ОК

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    //выводим одной строкой
    //правая кнопка мыши:
    //Generate, toString(), String concat (+)
    public String display() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", isNew=" + isNew +
                '}';
    }//end of method

    public void move(){
        System.out.println("Car is moving...");
    }

    public void stop(){
        System.out.println("Car stopped.");
    }

}//end of class
