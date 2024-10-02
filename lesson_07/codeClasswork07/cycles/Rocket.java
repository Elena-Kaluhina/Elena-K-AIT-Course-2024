package cycles;
//Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".

public class Rocket {

    public static void main(String[] args) {

        //задаем начальные данные
        int countDown = 10;
        System.out.println("We have " + countDown + " seconds before Start!");

        while (countDown > 0){

            countDown--;
            System.out.println("We have " + countDown + " seconds to Start.");

        }

        System.out.println("Here we GO!");

    }//end of main
}//end of class
