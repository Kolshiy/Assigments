package org.assigments1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SearchNumberInsideRandomArrayList {
    public static void main(String[] args) {
        Scanner numar = new Scanner(System.in);

        ArrayList<Integer> theList = new ArrayList<Integer>();
        System.out.println("Choose the range of random numbers (e.g. 15 for range of numbers from 0 to 15)"
                + "\nand size of array.");

        theList = generateRandomArrayList(numar.nextInt(), numar.nextInt());
        System.out.println("Random Generated Array: " + theList);

        System.out.println("\nNumber to check if exists inside the Array: ");
        check(theList, numar.nextInt());

    }


    private static void check(ArrayList<Integer> list, int numberToCheck) {
        search:
        for (int i : list) {
            if (i == numberToCheck) {
                System.out.println("The number exists");
                break search;
            } else
                System.out.println("The number does not exists");
            break;
        }
    }


    public static ArrayList<Integer> generateRandomArrayList(int interval, int size) {
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomList.add(new Random().nextInt(interval) + 1);
        }
        return randomList;
    }


}
