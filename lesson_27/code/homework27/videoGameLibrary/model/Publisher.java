package homework27.videoGameLibrary.model;

public class Publisher {

    private String id;
    private String name;
    private String country;  //страна, в которой находится издатель

    //constructor
    public Publisher(String id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    //getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    //equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return id.equals(publisher.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    //StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Publisher{id='").append(id).append('\'')
                .append(", name='").append(name).append('\'')
                .append(", country='").append(country).append('\'')
                .append('}');
        return sb.toString();
    }
}

