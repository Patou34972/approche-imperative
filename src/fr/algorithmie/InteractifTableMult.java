package fr.algorithmie;


//import java.util.Scanner;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;

            System.out.print("Veuillez écrire le nombre entre 1 à 10 : ");
            nombre = scanner.nextInt();
            if (nombre < 1 || nombre > 10) {
                System.out.println("Le nombre n'est pas compris entre 1 et 10. Réessayez.");
            } else {
                for (int i = 1; i <= 10; i++){
                    int resultat = nombre * i;
                    System.out.println( nombre + " x " + i + " = " + resultat);
                }
            }

    }
}


