package homework27.petsHotel.dao;

import homework27.petsHotel.model.Pet;

import java.util.List;

public interface Hotel {

    void addPet(Pet pet);  // Create

    Pet findPetById(String id);  // Read

    List<Pet> findPetsByBreed(String breed);  // Read

    void updatePet(Pet pet);  // Update

    void removePet(String id);  // Delete

    double calculateRevenue(int days);  //подсчёт выручки

    void printAllPets();  //печать всех питомцев
}

