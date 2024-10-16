package homework18.pet;

public class HousePetAppl {
    public static void main(String[] args) {

        //создаём животных
        Dog dog1 = new Dog(346, "Dog", 3, "Bunny", "Labrador", 50.5, 30.0);
        Dog dog2 = new Dog(247, "Dog", 7, "Rocky", "Boxer", 47.7, 28);

        Cat cat1 = new Cat(224, "Cat", 7, "Mimmy", "Main coon", 37.7, 6.0);
        Cat cat2 = new Cat(21, "Cat", 3, "Pussy", "Siamese", 25.5, 6);
        Cat cat3 = new Cat(37, "Cat", 4, "Blitz", "Britain", 45, 8);

        //1 день в доме
        System.out.println("Morning in the house)))");
        dog1.voice();
        dog2.voice();
        cat2.voice();
        cat1.voice();

        System.out.println("\nThe cats are resting in the kitchen.");
        restWithCats(cat1, cat2, cat3);

        System.out.println("\nThe dogs are playing in the backyard.");
        playWithDogs(dog1, dog2);
    }

    //метод для кошек
    public static void restWithCats(Cat...cats){
        for (Cat cat : cats){
            System.out.println(cat.nickName + " is eating and purring.");
        }
    }

    //метод для собак
    public static void playWithDogs(Dog...dogs){
        for (Dog dog : dogs){
            System.out.println(dog.nickName + " is running around and playing.");
        }
    }

}