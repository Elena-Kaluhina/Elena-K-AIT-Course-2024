package classwork18.computer_shop;

//Создать несколько экземпляров каждого класса.
//Какой общий объем памяти у всех устройств на складе?
//Какова общая стоимость всех устройств на складе?

import classwork18.computer_shop.model.Computer;
import classwork18.computer_shop.model.Laptop;
import classwork18.computer_shop.model.SmartPhone;

import java.util.concurrent.Callable;

public class ShopAppl {
    public static void main(String[] args) {

        Computer computer = new Computer("i7", 8, 256, "Acer", 1200);
        System.out.println(computer);

        Laptop laptop = new Laptop("m2", 8, 256, "Apple AirBook", 2200, 14, 1.5,10, "blue");
        System.out.println(laptop);

        Computer[] computers = new Computer[6]; //тип Computer (это родительский класс)

        computers[0] = new Computer("i7", 8, 256, "Acer", 1200);
        computers[1] = new Computer("i5", 16, 256, "HP", 1500);
        computers[2] = new Computer("AMD", 8, 256, "NoName", 2000); // no casting
        computers[3] = new Laptop("Apple", 8, 256, "MacBook", 2000, 14, 1.5, 10, "white"); // down casting
        computers[4] = new Laptop("Apple", 16, 512, "MacBookAir", 2500, 14.2, 1.8, 12,"black"); // down casting
        computers[5] = new SmartPhone("A1", 128, 256, "Samsung", 1300, 9, 0.45, 12, "pink", 123L); // down casting


        double totalWeight = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] instanceof Laptop){
                Laptop myLaptop = (Laptop) computers[i]; // upper casting
                totalWeight += myLaptop.getWeight();
            }
        }

        System.out.println("Total weight: " + totalWeight);


        int totalSsd = 0;
        for (int i = 0; i < computers.length; i++) {
            totalSsd += computers[i].getSsd();
        }

        //sout всегда пишем за циклом
        System.out.println("Total SSD: " + totalSsd);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
            totalPrice += computers[i].getPrice();
        }

        System.out.println("Total price: " + totalPrice);

        System.out.println("---------------------------------");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);
        }

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getBrand());
        }
    }
}
