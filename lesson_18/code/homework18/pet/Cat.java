package homework18.pet;

import java.util.Objects;

public class Cat extends Pet {

    //fields
    private String breed;
    private double height;
    private double weight;

    //constructor
    public Cat(int id, String view, int age, String nickName, String breed, double height, double weight) {
        super(id, view, age, nickName);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    //voice for a cat
    @Override
    public void voice() {
        super.voice();
        System.out.println(nickName + " says: Meow!" );
    }
}
