package homework18.pet;

public class Dog extends Pet {

    //fields
    private String breed;
    private double height;
    private double weight;

    //constructor
    public Dog(int id, String view, int age, String nickName, String breed, double height, double weight) {
        super(id, view, age, nickName);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    //voice for a dog

    @Override
    public void voice() {
        super.voice();
        System.out.println(nickName + " says: Bau!" );
    }
}
