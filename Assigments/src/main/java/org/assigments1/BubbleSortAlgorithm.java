package org.assigments1;

import java.util.Scanner;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = input.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the array's numbers: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("The array is: ");
        for (int i = 0; i < size; i++)
            System.out.println(array[i]);

        bubbleSort(array);
    }




    public static void bubbleSort(int array[]) {
        int tempo;
        for (int i = 0; i < array.length - 1; i++)
            for (int k = 0; k < array.length - i - 1; k++)
                if (array[k] > array[k + 1]) {
                    tempo = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = tempo;
                }


        System.out.println("New sorted array is: ");
        for (int i = 0; i < array.length; ++i) {

            System.out.print(array[i] + " ");
            System.out.println();
        }
    }

}


