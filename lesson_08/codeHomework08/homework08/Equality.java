package homework08;
/*
Чему равно значение выражения x-- + --x при x = 5?
 */

public class Equality {
    public static void main(String[] args) {

        int x = 5;
        int result = x-- + --x;
        System.out.println("Result: " + result);
        System.out.println("Total value x: " + x);

    }//end of main
}//end of class
