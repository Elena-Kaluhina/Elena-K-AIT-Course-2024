package homework26.composition.dao;

import homework26.composition.model.Detail;

public interface Stock {

    void addDetail(Detail detail);

    Detail findDetailByBarCode(long barCode);

    void updateDetail(Detail detail);

    void printDetail();

    void printDetails();

    void removeDetail(long barCode);

    double totalWeight();

    double averageWeight();

}
