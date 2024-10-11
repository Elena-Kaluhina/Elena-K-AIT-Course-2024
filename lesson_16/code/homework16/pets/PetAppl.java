package homework16.pets;
/*
В классе PetAppl создать несколько экземпляров
домашних животных. Отобразить прожитый день.
 */

public class PetAppl {
    public static void main(String[] args) {

        //создаём домашних животных
        Pet cat = new Pet(123,"Cat",5, "Moon");
        Pet dog = new Pet(235, "Dog", 4, "Buks");
        Pet hamster = new Pet(325, "Hamster", 1, "Jojo");
        Pet parrot = new Pet(228, "Parrot", 7, "Clogs");

        //создаём экземпляр класса PetActions
        PetActions actions = new PetActions();

        //прожитый день каждого питомца
        System.out.println("A day in the life of " + cat.getNickName() + ":");
        actions.sleep(cat);
        actions.eat(cat);
        actions.makeSound(cat);
        actions.play(cat);
        actions.walk(cat);

        System.out.println("\nA day in the life of " + dog.getNickName() + ":");//"\n" выводит с новой строки
        actions.sleep(dog);
        actions.eat(dog);
        actions.makeSound(dog);
        actions.play(dog);
        actions.walk(dog);

        System.out.println("\nA day in the life of " + hamster.getNickName() + ":");
        actions.sleep(hamster);
        actions.eat(hamster);
        actions.makeSound(hamster);
        actions.play(hamster);
        actions.walk(hamster);

        System.out.println("\nA day in the life of " + parrot.getNickName() + ":");
        actions.sleep(parrot);
        actions.eat(parrot);
        actions.makeSound(parrot);
        actions.play(parrot);
        actions.walk(parrot);
    }
}
