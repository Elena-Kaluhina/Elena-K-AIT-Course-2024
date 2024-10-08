package classwork19.compare_string;

//равенство строк - как понять?

public class CompareStringAppl {
    public static void main(String[] args) {

        int x = 5; //stack
        int y = 5; //stack

        boolean checker = (x==y);
        System.out.println(checker);

        String str1 = "Europe"; // str1 - stack => (link) Europe - heap
        String str2 = "Europe"; // str2 - stack => (link) Europe - heap

        checker = (str1 == str2); // compare Strings
        System.out.println(checker);

        String str3 = new String("Europe"); // create new object
        checker = (str1 == str3);
        System.out.println(checker); // false, because links NOT equals!

        checker = str1.equals(str3); // compare Strings with method equals
        System.out.println(checker);

    }
}
