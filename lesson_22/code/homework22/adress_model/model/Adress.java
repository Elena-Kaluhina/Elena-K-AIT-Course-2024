package homework22.adress_model.model;

public class Adress {

    private String city;
    private String postalCode;

    //конструктор с проверками
    public Adress(String city, String postalCode) {
        setCity(city);
        setPostalCode(postalCode);
    }

    //getters and setters
    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    //сеттер для города с проверкой на заглавную букву
    public void setCity(String city) {
        if (Character.isUpperCase(city.charAt(0))) {
            this.city = city;
        } else {
            throw new IllegalArgumentException("City name must start with a capital letter.");
        }
    }

    //сеттер для почтового индекса с проверкой на 5 цифр
    public void setPostalCode(String postalCode) {
        if (postalCode.matches("\\d{5}")) {
            this.postalCode = postalCode;
        } else {
            throw new IllegalArgumentException("Postal code must contain exactly 5 digits.");
        }
    }

    //toString
    @Override
    public String toString() {
        return "Address{city='" + city + "', postalCode='" + postalCode + "'}";
    }
}
