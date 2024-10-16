package homework17.loopsWhile;
//Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Использовать цикл do...while.

public class PrintDivisibleByFive {
    public static void main(String[] args) {

        int number = 1;
        int count = 0;

        //цикл do-while, который будет продолжаться до тех пор, пока не будет
        //напечатано семь чисел
        do {
            //проверяем делится ли число на 5 без остатка
            if (number % 5 == 0){
                System.out.println(number);
                count++; //увеличиваем счётчик чисел, которые кратные 5
            }
            number++; //увеличиваем число на 1 для следующей итерации

        }while (count < 7); //продолжаем цикл пока не напечатаются 7 чисел

    }
}
