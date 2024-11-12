package homework44.containars_shipment;

import java.util.Iterator;
import java.util.List;

class Box implements Iterable<Parcel> {

    private final List<Parcel> parcels;

    public Box(List<Parcel> parcels) {
        this.parcels = parcels;
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    // Возвращает количество посылок в коробке
    public int getParcelCount() {
        return parcels.size();
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }
}
