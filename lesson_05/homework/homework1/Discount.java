package homework1;
//Сделайте расчет покупки товаров со скидками. Товар А стоит X евро и на него скидка D%,
// а товар B стоит Y евро и на него скидка С%. Клиент взял N товаров A и M товаров B.
// Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
// Вычислите итоговую стоимость покупки и величину полученной скидки.

public class Discount {
    private static double calculateDiscountPercent(double price, double discountPercent) {
        return price - (price * discountPercent / 100);

    }//end of method

    public static void main(String[] args) {
        double priceA = 30.0;//цена за товар А в евро
        double discountA = 15.0;//процент скидки на товар А

        double priceB = 70.0;//цена за товар B в евро
        double discountB = 25.0;//процент скидки на товар B

        int N = 5;//количество товара, которое взял покупатель N
        int M = 7;//количество товара, которое взял покупатель M

        double discountPriceA = calculateDiscountPercent(priceA, discountA);
        double totalA = discountPriceA * N;

        double discountPriceB = calculateDiscountPercent(priceB, discountB);
        double totalB = discountPriceB * M;

        double totalOriginalPrice = (priceA * N) + (priceB * M);

        double totalPurchase = totalA + totalB;

        if (totalPurchase > 100) {
            totalPurchase = totalPurchase - (totalPurchase * 5 / 100);
        }

        double totalDiscaunt = totalOriginalPrice - totalPurchase;

        System.out.println("Итоговая стоимость покупки: " + totalPurchase + " евро. ");
        System.out.println("Итоговая величина скидки: " + totalDiscaunt + " евро. ");


        }//end of main

}//end of class
