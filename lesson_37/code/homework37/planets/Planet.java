package homework37.planets;

public class Planet {

    private String name;         // Наименование планеты
    private double distance;     // Расстояние до Солнца в миллионах километров
    private double mass;         // Масса планеты в массах Земли
    private int satellites;      // Количество спутников

    public Planet(String name, double distance, double mass, int satellites) {
        this.name = name;
        this.distance = distance;
        this.mass = mass;
        this.satellites = satellites;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public double getMass() {
        return mass;
    }

    public int getSatellites() {
        return satellites;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planet{")
                .append("name='").append(name).append('\'')
                .append(", distance=").append(distance).append(" million km")
                .append(", mass=").append(mass).append(" Earth masses")
                .append(", satellites=").append(satellites)
                .append('}');
        return sb.toString();
    }
}
