package classwork15.string_methods;

public class StringApplication {
    public static void main(String[] args) {

        String str1 = "Hello,";

        char[] chars = { 32, 'W', 'o', 'r', 'l', 'd', '!'};// 32 - это код пробела по таблице ASCII

        String str2 = new String(chars); //str2 - это объект класса String, сделанный конструктором (тоже метод)
        //new - это обращение к конструктору класса
        //с помощью new мы обращаемся к конструктору класса

        System.out.println(str1);//Hello,
        System.out.println(str2);// World!

        //concat - объединяем, складываем объекты типа String
        //для этого есть специальный метод
        String str = str1 + str2;
        System.out.println(str);

        str1.concat(str2);//конкатинация (соединение) с помощью метода
        System.out.println(str1);//str1 не изменилось так как тип String immutable (неизменяемый)
        System.out.println(str1.concat(str2));

        //length of String - длинна строки
        int l = str.length();//определяем длину строки str
        System.out.println(l);

        //first symbol
        char ch = str.charAt(0);
        System.out.println("First symbol: " + ch);
        //last symbol
        ch = str.charAt(str.length() - 1);//это будет индекс последнего элемента массива
        System.out.println("Last symbol: " + ch);

        //print str with spaces
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println();

        //check equals - проверка равенства
        String str3 = " worLD!";
        boolean checker = str3.equals(str2);//str2 = "World!"
        System.out.println(checker);//false
        checker = str3.equalsIgnoreCase(str2);//str2 = "World!"
        System.out.println(checker);//true

        System.out.println("----------------------------------------");
        //symbol in position
        System.out.println(str);

        int index = str.indexOf('W');
        System.out.println(index);// 7
        int index1 = str.lastIndexOf('d');//идём справа на лево при поиске
        System.out.println(index1);
        index = str.indexOf('o');
        index1 = str.lastIndexOf('o');
        System.out.println(index + ", " + index1);
        index = str.indexOf('x');
        System.out.println(index);//выводит -1, потому что такого символа не бывает


        System.out.println("------------------substrings-----------------------");
        System.out.println(str.substring(7));
        System.out.println(str.substring(7, 10));


        System.out.println("-------------------replace----------------------");
        System.out.println(str.replace("o", "0-0-0"));


        System.out.println("-------------------split----------------------");
        //number of words
        String str4 = "I love string in Java";
        String[] words = str4.split(" ");
        int word = words.length;
        System.out.println("Numbers of words in the sentence: " + word);

        //number of letters
        String[] symbols = str4.split("");
        int symbol = symbols.length;
        System.out.println("Number of symbols in sentence: " + symbol);


        System.out.println("-------------------String.format----------------------");
        //Вставьте в строку дату полета Гагарина в виде:
        //"Дата полета Гагарина в космос: число – месяц – год."
        // и напечатайте ее в консоли.
        //Используйте String.format()
        int day = 12;
        String month = "April";
        int year = 1961;

        String gagarinDay = String.format("Дата полета Гагарина в космос: %d - %s - %d", day, month, year);
        System.out.println(gagarinDay);
    }
}
