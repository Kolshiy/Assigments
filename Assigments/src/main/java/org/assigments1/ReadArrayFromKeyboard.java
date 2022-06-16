package org.assigments1;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadArrayFromKeyboard {
    public static void main(String[] args) {
        Scanner numar = new Scanner(System.in);
        ArrayList<Integer> collectieNumere = new ArrayList<>();

        System.out.println("Add 7 numbers: ");

        for (int i = collectieNumere.size(); i < 7; i++) {
            collectieNumere.add(numar.nextInt());
        }


        System.out.println("Type Read to see the list: ");
        System.out.println(numar.next("Read"));
        System.out.println("List: " + collectieNumere);

    }
}
