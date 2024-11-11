package homework39.supermarket.dao;

import homework39.supermarket.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SupermarketImpl implements Supermarket {

    private Collection<Product> products;

    public SupermarketImpl() {
        this.products = new ArrayList<>();
    }

    @Override
    public boolean addProduct(Product product) {
        // Проверка на уникальность штрихкода перед добавлением
        for (Product p : products) {
            if (p.getBarCode() == product.getBarCode()) {
                return false;
            }
        }
        return products.add(product);
    }

    @Override
    public Product removeProduct(long barCode) {
        for (Product p : products) {
            if (p.getBarCode() == barCode) {
                products.remove(p);
                return p;
            }
        }
        return null;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product p : products) {
            if (p.getBarCode() == barCode) {
                return p;
            }
        }
        return null;
    }

//    @Override
//    public Iterable<Product> findByCategory(String category) {
//        List<Product> result = new ArrayList<>();
//        for (Product p : products) {
//            if (p.getCategory().equalsIgnoreCase(category)) {
//                result.add(p);
//            }
//        }
//        return result;
//    }
    @Override
    public Iterable<Product> findByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            // Если категория пустая, возвращаем все продукты
            if (category.isEmpty() || p.getCategory().equalsIgnoreCase(category)) {
                result.add(p);
            }
        }
        return result;
    }


    @Override
    public Iterable<Product> findByBrand(String brand) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getBrand().equalsIgnoreCase(brand)) {
                result.add(p);
            }
        }
        return result;
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        List<Product> expiredProducts = new ArrayList<>();
        LocalDate today = LocalDate.now();
        for (Product p : products) {
            if (p.getExpDate().isBefore(today)) {
                expiredProducts.add(p);
            }
        }
        return expiredProducts;
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }
}
