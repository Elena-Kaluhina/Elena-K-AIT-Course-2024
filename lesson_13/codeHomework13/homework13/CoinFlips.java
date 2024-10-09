package homework13;

import homework10.RandomNumbers;

import java.util.Random;

public class CoinFlips {

    public static void main(String[] args) {

        int[] results = new int[2]; // create an array to store results
        Random random = new Random(); // random number generator

        // flip a coin 100 times

        for (int i = 0; i < 100; i++) {
            int toss = random.nextInt(2); // generates 0 - heads, 1 - tails
            if (toss == 0) {
                results[0]++; // increase counter for heads
            } else {
                results[1]++; // increase counter for tails
            }
        } // end of for

        // print results

        System.out.println("Heads fell out: " + results[0] + " times.");
        System.out.println("Tails fell out: " + results[1] + " times.");

        // probability

        double probabilityHeads = (double) results[0] / 100 * 100; // divide by 100 throws and multiply by 100
        double probabilityTails = (double) results[1] / 100 * 100;


        // probability output

        System.out.println("Chances of heads falling out: " + probabilityHeads + " %");
        System.out.println("Chances of heads falling out: " + probabilityTails + " %");


    } // end of main
} // end of class

