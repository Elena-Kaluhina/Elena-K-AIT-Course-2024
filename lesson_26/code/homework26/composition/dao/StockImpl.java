package homework26.composition.dao;

import homework26.composition.model.Detail;
import homework26.composition.dao.Stock;

import java.util.ArrayList;
import java.util.List;

public class StockImpl implements Stock {

    //список для хранения деталей
    private List<Detail> details = new ArrayList<>();


    //метод для добавления детали
    @Override
    public void addDetail(Detail detail) {
        details.add(detail);
    }


    //метод для поиска детали по штрих-коду
    @Override
    public Detail findDetailByBarCode(long barCode) {

        for (Detail detail : details) {
            if (detail.getBarCode() == barCode) {
                return detail;
            }
        }
        return null;
    }


    //метод для обновления данных о детали
    @Override
    public void updateDetail(Detail updateDetail) {

        for (int i = 0; i < details.size(); i++) {
            if (details.get(i).getBarCode() == updateDetail.getBarCode()) {
                details.set(i, updateDetail);
                break;
            }
        }
    }


    @Override
    public void printDetail() {

    }


    @Override
    public void printDetails() {

        if (details.isEmpty()) {
            System.out.println("Stock is empty.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Detail detail : details) {
                sb.append(detail.toString()).append("\n");
            }
            System.out.println(sb.toString());
        }
    }


    //метод для удаления детали
    @Override
    public void removeDetail(long barCode) {
        for (int i = 0; i < details.size(); i++) {
            if (details.get(i).getBarCode() == barCode) {
                details.remove(i);
                break;
            }
        }

    }

    //метод для вычисления общей массы всех деталей на складе
    @Override
    public double totalWeight() {
        double totalWeight = 0;
        for (Detail detail : details) {
            totalWeight += detail.getWeight();
        }
        return totalWeight;
    }

    //метод для вычисления средней массы всех деталей на складе
    @Override
    public double averageWeight() {
        if (details.isEmpty()) {
            return 0;
        }
        double totalWeight = totalWeight();
        return totalWeight / details.size();
    }
}
