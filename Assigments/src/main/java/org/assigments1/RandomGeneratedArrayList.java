package org.assigments1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomGeneratedArrayList {
    public static void main(String[] args) {
        Scanner numar = new Scanner(System.in);
        System.out.println("Choose the range of random numbers (e.g. 15 for range of numbers from 0 to 15)"
                +"\nand size of array.");
        ArrayList<Integer> theList = new ArrayList<>();
        theList = generateRandomArrayList(numar.nextInt(), numar.nextInt());

        System.out.println("Random Generated Array: " + theList);
    }

    public static ArrayList<Integer> generateRandomArrayList(int interval, int size) {
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomList.add(new Random().nextInt(interval) + 1);
        }
        return randomList;
    }
}