package homework27.petsHotel.model;

public class Pet {

    //fields
    private String id;  // ID питомца
    private String name;
    private String breed;
    private double dailyRate;

    //constructor
    public Pet(String id, String name, String breed, double dailyRate) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.dailyRate = dailyRate;
    }

    //getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double dailyRate) { this.dailyRate = dailyRate; }

    // equals и hashCode для сравнения питомцев по id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id.equals(pet.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pet{id='").append(id).append('\'')
                .append(", name='").append(name).append('\'')
                .append(", breed='").append(breed).append('\'')
                .append(", dailyRate=").append(dailyRate)
                .append('}');
        return sb.toString();
    }
}
