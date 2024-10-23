package homework27.highSchool.model;

public class Aspirant extends Student {

    //fields
    private String researchTopic;

    //constructor
    public Aspirant(String id, String name, double gpa, String researchTopic) {
        super(id, name, gpa);
        this.researchTopic = researchTopic;
    }

    //getters and setters
    public String getResearchTopic() { return researchTopic; }
    public void setResearchTopic(String researchTopic) { this.researchTopic = researchTopic; }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", researchTopic='").append(researchTopic).append('\'');
        return sb.toString();
    }
}
