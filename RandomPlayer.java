import processing.core.PApplet;

import java.util.*;
import java.util.Random;
public class RandomPlayer implements Player{

    public int takeTurn() {
        Random rand = new Random(); //instance of random class
        int upperbound = 8;
        //generate random values from 1-7
        int int_random = rand.nextInt(upperbound);
        while (int_random == 0)
            int_random = rand.nextInt(upperbound);
        return int_random;
        }

    public static void main(String args[]) {

    }
}

