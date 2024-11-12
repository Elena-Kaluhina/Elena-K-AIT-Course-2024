package homework44.containars_shipment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ShipmentAppl {

    public static void main(String[] args) {

        Random random = new Random();
        List<Container> containers = new ArrayList<>();

        // Создаем случайное количество контейнеров (от 10 до 20)
        int numberOfContainers = random.nextInt(11) + 10;
        for (int i = 0; i < numberOfContainers; i++) {
            String label = "Container_" + (i + 1);
            List<Box> boxes = new ArrayList<>();

            // Для каждого контейнера создаем случайное количество коробок (от 10 до 20)
            int numberOfBoxes = random.nextInt(11) + 10;
            for (int j = 0; j < numberOfBoxes; j++) {
                List<Parcel> parcels = new ArrayList<>();

                // Для каждой коробки создаем случайное количество посылок (от 5 до 10)
                int numberOfParcels = random.nextInt(6) + 5;
                for (int k = 0; k < numberOfParcels; k++) {
                    parcels.add(new Parcel(2.0)); // Вес каждой посылки - 2 кг
                }
                boxes.add(new Box(parcels));
            }
            containers.add(new Container(label, boxes));
        }

        // Подсчет общего количества посылок и общего веса
        int totalParcels = 0;
        double totalWeight = 0.0;
        for (Container container : containers) {
            for (Box box : container) {
                totalParcels += box.getParcelCount();
                totalWeight += box.getParcels().stream().mapToDouble(Parcel::getWeight).sum();
            }
        }
        System.out.println("Total parcels: " + totalParcels);
        System.out.println("Total weight: " + totalWeight + " kg");

        // Находим контейнер с максимальным количеством посылок
        int maxParcelsInContainer = containers.stream()
            .mapToInt(Container::getTotalParcels)
            .max()
            .orElse(0);

        // Находим контейнеры с максимальным количеством посылок
        List<String> maxParcelsContainers = containers.stream()
            .filter(container -> container.getTotalParcels() == maxParcelsInContainer)
            .map(Container::getLabel)
            .collect(Collectors.toList());

        System.out.println("Container(s) with the most parcels (" + maxParcelsInContainer + " parcels): " + maxParcelsContainers);
    }
}