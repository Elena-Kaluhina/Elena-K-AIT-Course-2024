package homework16.pets;
/*
Дополнительные методы:
- спать
- есть
- делать звук
- играть
- гулять
 */

public class PetActions {

    //метод для симуляции сна питомца
    public void sleep(Pet pet){
        System.out.println(pet.getNickName() + " is sleeping.");
    }

    //метод для симуляции еды
    public void eat(Pet pet){
        System.out.println(pet.getNickName() + " is eating.");
    }

    //метод для симуляции звука
    public void makeSound(Pet pet){
        System.out.println(pet.getNickName() + " is making a sound.");
    }

    //метод для игры
    public void play(Pet pet){
        System.out.println(pet.getNickName() + " is playing.");
    }

    //метод для прогулки
    public void walk(Pet pet){
        System.out.println(pet.getNickName()+ " is going for a walk.");
    }
}
