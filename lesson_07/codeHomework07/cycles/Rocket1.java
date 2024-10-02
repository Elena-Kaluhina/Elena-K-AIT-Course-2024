package cycles;
//Задача 2.
//Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".

public class Rocket1 {
    public static void main(String[] args) {
        int countDown = 10;//10 - это секунды с которых мы начинаем обратный отсчёт
        System.out.println("We have: " + countDown + " seconds before Start!");

        while (countDown > 0){//пишем цикл обратного отсчёта
            countDown--;
            System.out.println("We have: " + countDown + " seconds till Start!");

        }//end of while

        //после завершения цикла и дойдя до 0 мы можем написать пожелания удачного полёта
        System.out.println("Here we go! Good luck guys!");

    }//end of main
}//end of class
