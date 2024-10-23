package homework27.petsHotel.test;

import homework27.petsHotel.dao.Hotel;
import homework27.petsHotel.dao.HotelImpl;
import homework27.petsHotel.model.Cat;
import homework27.petsHotel.model.Dog;
import homework27.petsHotel.model.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {

    private Hotel hotel;

    @BeforeEach
    public void setUp() {
        hotel = new HotelImpl();
    }

    @Test
    public void testAddPet() {
        Pet cat = new Cat("001", "Whiskers", "Siamese", 10.00);
        hotel.addPet(cat);
        assertEquals(cat, hotel.findPetById("001"));
    }

    @Test
    public void testFindPetsByBreed() {
        Pet cat = new Cat("001", "Whiskers", "Siamese", 10.00);
        Pet dog = new Dog("002", "Buddy", "Golden Retriever", 20.00);
        hotel.addPet(cat);
        hotel.addPet(dog);

        List<Pet> siameseCats = hotel.findPetsByBreed("Siamese");  // Read
        assertEquals(1, siameseCats.size());
        assertTrue(siameseCats.contains(cat));
        assertFalse(siameseCats.contains(dog));
    }

    @Test
    public void testUpdatePet() {
        Pet cat = new Cat("001", "Whiskers", "Siamese", 10.00);
        hotel.addPet(cat);

        // Обновляем питомца
        Pet updatedCat = new Cat("001", "Whiskers", "Siamese", 15.00);
        hotel.updatePet(updatedCat);  // Update

        // Проверяем, что питомец обновился
        Pet found = hotel.findPetById("001");
        assertEquals(15.00, found.getDailyRate());
    }

    @Test
    public void testRemovePet() {
        Pet cat = new Cat("001", "Whiskers", "Siamese", 10.00);
        hotel.addPet(cat);
        hotel.removePet("001");  // Delete
        assertNull(hotel.findPetById("001"));
    }

    @Test
    public void testCalculateRevenue() {
        Pet cat = new Cat("001", "Whiskers", "Siamese", 10.00);
        Pet dog = new Dog("002", "Buddy", "Golden Retriever", 20.00);
        hotel.addPet(cat);
        hotel.addPet(dog);

        double revenue = hotel.calculateRevenue(3);  //подсчёт выручки за 3 дня
        assertEquals(90.00, revenue, 0.001);  // 10 * 3 + 20 * 3 = 90
    }

    @Test
    public void testPrintAllPets() {
        Pet cat = new Cat("001", "Whiskers", "Siamese", 10.00);
        Pet dog = new Dog("002", "Buddy", "Golden Retriever", 20.00);
        hotel.addPet(cat);
        hotel.addPet(dog);


        assertDoesNotThrow(() -> hotel.printAllPets());
    }
}

