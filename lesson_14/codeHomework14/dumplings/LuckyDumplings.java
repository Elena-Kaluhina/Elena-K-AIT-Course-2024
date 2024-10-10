package dumplings;

import java.util.Random;

public class LuckyDumplings {

    public static void main(String[] args) {
        //quantity of dumplings
        int numberOfDumplings = 30;
        int[] dumplings = new int[numberOfDumplings];

        //weight of one dumpling
        int normalWeight = 45;

        //weight of lucky dumpling
        int luckyWeight = normalWeight + 15;

        //generation of a random index for a lucky dumpling
        Random random = new Random();
        int luckyDumplingIndex = random.nextInt(numberOfDumplings);

        //fill array with dumplings
        for (int i = 0; i < numberOfDumplings; i++) {
            if (i == luckyDumplingIndex) {
                dumplings[i] = luckyWeight;  //lucky dumpling with coin
            } else {
                dumplings[i] = normalWeight;  //normal dumplings
            }
        }

        //weight of all dumplings
        System.out.println("Weights of all dumplings:");
        for (int i = 0; i < numberOfDumplings; i++) {
            System.out.println("Dumpling " + (i + 1) + ": " + dumplings[i] + " grams");
        }

        //search for lucky dumpling
        for (int i = 0; i < numberOfDumplings; i++) {
            if (dumplings[i] == luckyWeight) {
                System.out.println("\nLucky dumpling found! It's dumpling number " + (i + 1));
                break;
            }
        }
    }
}
