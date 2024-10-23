package homework27.petsHotel.dao;

import homework27.petsHotel.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class HotelImpl implements Hotel {

    private List<Pet> pets;

    public HotelImpl() {
        this.pets = new ArrayList<>();
    }

    @Override
    public void addPet(Pet pet) {
        pets.add(pet);  // Create
    }

    @Override
    public Pet findPetById(String id) {
        for (Pet pet : pets) {  // Read
            if (pet.getId().equals(id)) {
                return pet;
            }
        }
        return null;
    }

    @Override
    public List<Pet> findPetsByBreed(String breed) {
        List<Pet> result = new ArrayList<>();  // Read
        for (Pet pet : pets) {
            if (pet.getBreed().equalsIgnoreCase(breed)) {
                result.add(pet);
            }
        }
        return result;
    }

    @Override
    public void updatePet(Pet updatedPet) {  // Update
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getId().equals(updatedPet.getId())) {
                pets.set(i, updatedPet);  // Обновляем питомца
                break;
            }
        }
    }

    @Override
    public void removePet(String id) {
        pets.removeIf(pet -> pet.getId().equals(id));  // Delete
    }

    @Override
    public double calculateRevenue(int days) {
        return pets.stream().mapToDouble(pet -> pet.getDailyRate() * days).sum();  // Подсчёт выручки
    }

    @Override
    public void printAllPets() {
        for (Pet pet : pets) {
            System.out.println(pet);  // Печать всех питомцев
        }
    }
}
