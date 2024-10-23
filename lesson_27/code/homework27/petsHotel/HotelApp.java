package homework27.petsHotel;

import homework27.petsHotel.dao.Hotel;
import homework27.petsHotel.dao.HotelImpl;
import homework27.petsHotel.model.Cat;
import homework27.petsHotel.model.Dog;
import homework27.petsHotel.model.Pet;

public class HotelApp {
    public static void main(String[] args) {
        Hotel hotel = new HotelImpl();  // Используем реализацию интерфейса

        // Создание питомцев (операция Create)
        Pet cat = new Cat("001", "Whiskers", "Siamese", 10.00);
        Pet dog = new Dog("002", "Buddy", "Golden Retriever", 20.00);
        hotel.addPet(cat);
        hotel.addPet(dog);

        // Чтение питомцев по породе (операция Read)
        System.out.println("Pets of breed 'Siamese':");
        hotel.findPetsByBreed("Siamese").forEach(System.out::println);

        // Обновление питомца (операция Update)
        System.out.println("Updating daily rate for pet 001...");
        Pet updatedCat = new Cat("001", "Whiskers", "Siamese", 15.00);
        hotel.updatePet(updatedCat);
        System.out.println("Updated pet: " + hotel.findPetById("001"));

        // Удаление питомца (операция Delete)
        System.out.println("Removing pet 002...");
        hotel.removePet("002");

        // Печать всех питомцев (операция Read)
        System.out.println("All pets in the hotel:");
        hotel.printAllPets();

        // Подсчёт выручки за 5 дней
        System.out.println("Total revenue for 5 days: " + hotel.calculateRevenue(5));
    }
}

