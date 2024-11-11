package homework36.alphabet_array;

import java.util.ArrayList;

public class AlphabetArrayList {

    public static void main(String[] args) {

        ArrayList<Character> alphabet = new ArrayList<>();

        // Заполняем ArrayList символами от 'A' до 'Z'
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            alphabet.add(ch);
        }

        // Выводим содержимое ArrayList
        System.out.println("Alphabet ArrayList: " + alphabet);
    }
}

//Объяснение кода
//Создаём ArrayList<Character> alphabet:
//Этот список будет хранить символы латинского алфавита.
//Цикл для добавления символов:
//Используем цикл for, начиная с символа 'A' и заканчивая символом 'Z'.
//Каждый символ добавляется в ArrayList с помощью alphabet.add(ch).
//Выводим содержимое ArrayList:
//Печатаем ArrayList, чтобы увидеть все символы от A до Z.
