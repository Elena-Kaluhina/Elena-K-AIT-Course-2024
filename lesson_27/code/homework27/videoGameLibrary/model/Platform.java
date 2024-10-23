package homework27.videoGameLibrary.model;

public class Platform {

    //fields
    private String id;
    private String name;
    private String manufacturer;  //производитель платформы

    //constructor
    public Platform(String id, String name, String manufacturer) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    //getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    //equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platform platform = (Platform) o;
        return id.equals(platform.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    //StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Platform{id='").append(id).append('\'')
                .append(", name='").append(name).append('\'')
                .append(", manufacturer='").append(manufacturer).append('\'')
                .append('}');
        return sb.toString();
    }
}
