package homework27.supermarket.model;

import java.time.LocalDate;

public class Food extends Product {

    public Food(String id, String name, double price, LocalDate expirationDate) {
        super(id, name, price, expirationDate);
    }


    public class MeatFood extends Food {

        public MeatFood(String id, String name, double price, LocalDate expirationDate) {
            super(id, name, price, expirationDate);
        }


        public class MilkFood extends Food {

            public MilkFood(String id, String name, double price, LocalDate expirationDate) {
                super(id, name, price, expirationDate);
            }
        }
    }
}