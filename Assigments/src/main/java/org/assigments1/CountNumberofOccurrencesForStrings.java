package org.assigments1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class CountNumberofOccurrencesForStrings {
    public static void main(String[] args) {
        Scanner nume = new Scanner(System.in);

        ArrayList<String> collectieNumePersoana = new ArrayList<>();
        System.out.println("Adauga 7 nume de persoana: ");
        for (int i = collectieNumePersoana.size(); i < 7; i++) {
            collectieNumePersoana.add(nume.nextLine());
        }

//      Aici am incercat o alta metoda
        
//      while(collectieNumePersoana.size() < 7) {
//      collectieNumePersoana.add(nume.nextLine());
//      }


        System.out.println("Lista de numere: " + collectieNumePersoana);
        System.out.println("\n" + "Verificare repetare pentru numele: ");
        System.out.println("Acest Nume se repeta de " + Collections.frequency(collectieNumePersoana, nume.nextLine()) + " ori");
    }
}

