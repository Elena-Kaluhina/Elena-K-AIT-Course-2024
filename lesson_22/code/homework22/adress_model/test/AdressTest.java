package homework22.adress_model.test;

import static org.junit.jupiter.api.Assertions.*;

import homework22.adress_model.model.Adress;
import org.junit.jupiter.api.Test;

    public class AdressTest {

        @Test
        public void testValidAddress() {
            Adress address = new Adress("Berlin", "12345");
            assertEquals("Berlin", address.getCity());
            assertEquals("12345", address.getPostalCode());
        }

        @Test
        public void testInvalidCity() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                new Adress("berlin", "12345");
            });
            assertEquals("City name must start with a capital letter.", exception.getMessage());
        }

        @Test
        public void testInvalidPostalCode() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                new Adress("Berlin", "1234");
            });
            assertEquals("Postal code must contain exactly 5 digits.", exception.getMessage());
        }
    }
