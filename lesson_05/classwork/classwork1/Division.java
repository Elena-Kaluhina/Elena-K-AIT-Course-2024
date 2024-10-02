package classwork1;
//Реализовать метод, определяющий, делится ли одно целое число на другое нацело или нет.

public class Division {
    public static void main(String[] args) {
        int a = 45;
        int b = 17;
        boolean res = isDivided(a, b);
        System.out.println("a = " + a + ", b = " + b + " is divided " + res);

    }//end of main

    public static boolean isDivided(int a, int b){

        return a %  b == 0;

    }

}//end of class
