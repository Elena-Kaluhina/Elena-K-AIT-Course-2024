package homework44.containars_shipment;

import java.util.Iterator;
import java.util.List;

class Container implements Iterable<Box> {

    private final String label;
    private final List<Box> boxes;

    public Container(String label, List<Box> boxes) {
        this.label = label;
        this.boxes = boxes;
    }

    public String getLabel() {
        return label;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    // Подсчитывает общее количество посылок в контейнере
    public int getTotalParcels() {
        return boxes.stream().mapToInt(Box::getParcelCount).sum();
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}