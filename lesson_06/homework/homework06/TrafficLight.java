package homework06;
//Напишите программу для машины на светофоре.
// Что делать водителю, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.

import java.util.Scanner;

public class TrafficLight {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the colors of the traffic lights (red - 1, yellow - 2, green -3):");

        int lightColors = scanner.nextInt();

        switch (lightColors) {
            case 1:
                System.out.println("STOP!!! You can't go!");
                break;

            case 2:
                System.out.println("WAIT! Get ready!");
                break;

            case 3:
                System.out.println("GOOOO!!!");
                break;

            default:
                System.out.println("Wrong input!");
                break;

        }
    }//end of main
}//end of class
