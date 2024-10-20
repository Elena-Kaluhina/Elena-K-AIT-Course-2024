package homework26.composition.test;

import homework26.composition.dao.Stock;
import homework26.composition.dao.StockImpl;
import homework26.composition.model.Detail;
import homework26.composition.model.Gear;
import homework26.composition.model.Lever;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StockImplTest {

    private Stock stock;
    private Detail gear;
    private Detail lever;


    @BeforeEach
    void setUp() {
        stock = new StockImpl();
        gear = new Gear(123, 22.5, "Steel", "V1", 17, 12, 56);
        lever = new Lever(321, 15, "Titanium", "V2", 12, 32);
    }

    //тест на добавление детали
    @Test
    void addDetailTest() {
        stock.addDetail(gear);
        assertEquals(gear, stock.findDetailByBarCode(123));
    }

    //тест для поиска детали по штрих-коду
    @Test
    void findDetailByBarCodeTest() {
        stock.addDetail(gear);
        stock.addDetail(lever);
        //проверяем, что метод правильно находит детали по штрих-коду
        assertEquals(gear, stock.findDetailByBarCode(123));
        assertEquals(lever, stock.findDetailByBarCode(321));
        //проверяем, что метод возвращает null
        assertNull(stock.findDetailByBarCode(6766)); //штрих-код которого нет на нашем складе
    }

    //тест для метода обновления данных о детали
    @Test
    void updateDetailTest() {
        stock.addDetail(gear);
        gear = new Gear(123, 20.5, "Steel", "V1", 12, 15, 60);
        stock.updateDetail(gear);
        assertEquals(60, ((Gear) stock.findDetailByBarCode(123)).getTooth());
    }

    //тест для метода удаления детали
    @Test
    void removeDetailTest() {
        stock.addDetail(gear);
        stock.removeDetail(123);
        assertNull(stock.findDetailByBarCode(123));

    }

    //тест для вычисления общей массы
    @Test
    void totalWeightTest() {
        stock.addDetail(gear);
        stock.addDetail(lever);
        assertEquals(29, stock.totalWeight());
    }

    //тест для вычисления средней массы
    @Test
    void averageWeightTest() {
        stock.addDetail(gear);
        stock.addDetail(lever);
        assertEquals(14.5, stock.averageWeight());

    }

    @Test
    public void printDetailsTest(){
        stock.addDetail(gear);
        stock.addDetail(lever);
        stock.printDetails();
    }
}
