package homework15;
/*
Дана строка "I'm proud to learn Java! Java is the most famous
programming language!!!" Выполнить практикум с этой строкой:
- Распечатать последний символ строки.
- Найти позицию подстроки “Java” в строке.
- Проверить, содержит ли заданная строка подстроку “Java”.
- Заменить все символы “o” на “a”.
- Преобразуйте строку к верхнему регистру.
- Преобразуйте строку к нижнему регистру.
- Вырезать подстроку Java c помощью метода substring().
- Проверить, заканчивается ли строка подстрокой “!!!”.
- Проверить, начинается ли строка подстрокой “I'm proud”.
 */

public class Task1 {
    public static void main(String[] args) {

        String string = "I'm proud to learn Java! Java is the most famous programming language!!!";

        //распечатать последний символ строки
        char lastChar = string.charAt(string.length() - 1);
        System.out.println("The last character of the string: " + lastChar);

        //найти позицию подстроки “Java” в строке
        int firstJavaIndex = string.indexOf("Java");
        System.out.println("The 1st position of the Java substring: " + firstJavaIndex);

        //проверить, содержит ли заданная строка подстроку “Java”
        boolean containsJava = string.contains("Java");
        System.out.println("Does the string contain 'Java': " + containsJava);

        //заменить все символы "о" на "а"
        String replacedString = string.replace('o', 'a');
        System.out.println("A string replacing 'o' with 'a': " + replacedString);

        //преобразуйте строку к верхнему регистру
        String upperString = string.toUpperCase();
        System.out.println("String in upper case: " + upperString);

        //преобразуйте строку к нижнему регистру
        String lowerString = string.toLowerCase();
        System.out.println("A string in lower case: " + lowerString);

        //вырезать подстроку Java с помощью метода substring()
        String javaSubstring = string.substring(string.indexOf("Java"), string.indexOf("Java") + 4);
        System.out.println("A cut string of 'Java': " + javaSubstring);

        //проверить заканчивается ли строка подстрокой "!!!"
        boolean endWithExclamation = string.endsWith("!!!");
        System.out.println("Is the string ending with '!!!': " + endWithExclamation);

        //проверить начинается ли строка подстрокой "I'm proud"
        boolean startsWithProud = string.startsWith("I'm proud");
        System.out.println("Does the string start with 'I'm proud': " + startsWithProud);


    }
}
