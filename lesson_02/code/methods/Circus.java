package methods;

public class Circus {

    public static void main(String[] args) {

       lightOn();
       entertainer();
       lightOff();

    }//end of main

    public static void lightOn(){
        System.out.println("Light OOOONNN!!!");
    }

    public static void lightOff(){
        System.out.println("Please lights OOOff!!!");
    }

    public static void entertainer(){
        jogger();
        clown();
        singer();
    }

    public static void jogger(){
        System.out.println("Jogger jogging...");
    }

    public static void clown(){
        System.out.println("I jocking...");
    }

    public static void singer(){
        System.out.println("I singing in the air!!!!");
    }
}//end of class
