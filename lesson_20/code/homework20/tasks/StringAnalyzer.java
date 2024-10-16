package homework20.tasks;

import java.util.Scanner;

// Разработайте приложение, которое принимает от пользователя строку
// (некое предложение, например: "Мама мыла раму.") и выводит:
// - количество символов в строке;
// - количество символов в верхнем регистре;
// - количество цифр в строке;
// - количество пробелов в строке (код пробела = 32);
//в зависимости от последнего символа в строке сообщает, какое это предложение:
// - повествовательное;
// - вопросительное;
// - восклицательное.
// Используйте методы класса Character.
public class StringAnalyzer {
    public static void main(String[] args) {

        //создаём scanner
        Scanner scanner = new Scanner(System.in);
        //просим пользователя ввести предложение
        System.out.println("Input the sentence: ");
        //считываем строку с помощью scanner
        String input = scanner.nextLine();
        //переменные для подсчёта разных символов
        int totalChars = input.length();//длина введённой строки
        int upperCaseCount = 0;//с большой буквы
        int digitCount = 0;//цифры
        int spaceCount = 0;//пробелы

        //перебираем каждый символ строки
        //char currentChar = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            //проверяем является символ буквой в верхнем регистре или нет
            if (Character.isUpperCase(currentChar)) {
                upperCaseCount++;
            }
            //проверяем является символ цифрой или нет
            if (Character.isDigit(currentChar)) {
                digitCount++;
            }
            //проверяем является символ пробелом или нет
            if (currentChar == ' ') {
                spaceCount++;
            }
        }
        //определяем тип предложения по последнему символом
        char lastChar = input.charAt(input.length() - 1);
        String sentenceType;
        if (lastChar == '.') {
            sentenceType = "narrative";
        } else if (lastChar == '?') {
            sentenceType = "interrogative";
        } else if (lastChar == '!') {
            sentenceType = "exclamative";
        } else {
            sentenceType = "undefined";
        }
        System.out.println("Quantity of characters: " + totalChars);
        System.out.println("Quantity of characters in upper case: " + upperCaseCount);
        System.out.println("Quantity of numbers: " + digitCount);
        System.out.println("Quantity of spaces:" + spaceCount);
        System.out.println("Type of sentence: " + sentenceType);
    }
}
