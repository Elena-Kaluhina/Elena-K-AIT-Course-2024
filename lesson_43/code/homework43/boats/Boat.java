package homework43.boats;

class Boat {

    private final String manufacturer; // Производитель (верфь)
    private final String country; // Страна (флаг)
    private final int year; // Год выпуска
    private final double length; // Длина яхты
    private final String hullMaterial; // Материал корпуса (дерево, пластик, металл)
    private final double price; // Стоимость

    public Boat(String manufacturer, String country, int year, double length, String hullMaterial, double price) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.year = year;
        this.length = length;
        this.hullMaterial = hullMaterial;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public double getPrice() {
        return price;
    }

    // Переопределение метода toString с использованием StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Boat{")
                .append("manufacturer='").append(manufacturer).append('\'')
                .append(", country='").append(country).append('\'')
                .append(", year=").append(year)
                .append(", length=").append(length)
                .append(", hullMaterial='").append(hullMaterial).append('\'')
                .append(", price=").append(price)
                .append('}');
        return sb.toString();
    }
}
