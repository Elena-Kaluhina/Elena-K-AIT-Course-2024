package homework17.repetition_tasks;
//По данному числу n закончите фразу "На лугу пасется..."
// одним из возможных продолжений: "n коров", "n корова",
// "n коровы", правильно склоняя слово "корова". Входные
// данные: Дано целое положительное число n (n <= 10),
// Выходные данные: Программа должна вывести введенное
// число n и одно из слов: коров, корова или коровы,
// например, 1 корова, 2 коровы, 5 коров.

import java.util.Scanner;

public class CowsPhrase {
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number from 1 till 10: ");
        //считываем целое число n
        int n = scanner.nextInt();
        //проверяем правильное склонение слова корова
        String res = n + " " + getCorrectForm(n);
        //result
        System.out.println(res);
    }

    //создаём метод для получения правильной формы слова корова
    public static String getCorrectForm(int n) {
        if (n == 1) {
            return "корова";
        } else if (n >= 2 && n <= 4) {
            return "коровы";
        } else {
            return "коров";
        }
    }
}
