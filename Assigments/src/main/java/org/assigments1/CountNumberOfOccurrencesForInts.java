package org.assigments1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountNumberOfOccurrencesForInts {
    public static void main(String[] args) {
        Scanner numar = new Scanner(System.in);

        ArrayList<Integer> collectieNumere = new ArrayList<>();
        System.out.println("Adauga 7 numere: ");
        for (int i = 0; i < 7; i++) {
            collectieNumere.add(numar.nextInt());
        }

        System.out.println("Lista de numere: " + collectieNumere);
        System.out.println("\n"+"Verificare repetare pentru numarul: ");
        System.out.println("Acest numar se repeta de " + Collections.frequency(collectieNumere, numar.nextInt()) + " ori");
    }
}
