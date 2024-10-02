package homework08;
/*
В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне,
что увеличит стоимость билета на 25%. Создайте метод calculateTicketPrice,
который принимает возраст клиента, статус студента и флаг VIP-места,
а возвращает итоговую стоимость билета. Реализуйте приложение-бот,
которое задает необходимые вопросы и объявляет стоимость билета.
 */

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        //вводим данные из задачи
        int age = 0;
        boolean isStudent = false;//
        boolean isSenior = false;
        boolean isVIP = false;
        double price = 10.0;//стоимость билета

        Scanner scanner = new Scanner(System.in);
        System.out.println(" You are welcome! ");
        System.out.println(" Input your answer: ");
        System.out.println(" Select: 1 - standard, 2 - student, 3 - senior: ");
        int ticketType = scanner.nextInt();

        switch (ticketType){
            case 1://билет стандартный, ничего не делаем
                break;

            case 2: isStudent = true;
            price = price * 0.9;//-10% скидки
            break;

            case 3: isSenior = true;
            price = price * 0.75;//-25% скидки
            break;

            default:
                System.out.println("Invalid ticket type selected.");
                return;
        }

        System.out.println("Do you want a VIP place? yes - 1, no -2: ");
        int vipResponce = scanner.nextInt();

        if (vipResponce == 1){
            isVIP = true;
            price = price * 1.25;//+25% от стоимости билета
        }

        System.out.println("The final ticket price is: " + price + " euro.");

    }//end of main


}//end of class