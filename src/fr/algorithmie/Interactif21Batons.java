package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int batons = 21;
        boolean tourJoueur = true;

        System.out.println("Bienvenue au jeu des 21 bâtons !");
        System.out.println("Vous jouez contre l'ordinateur.");

        while (batons > 0) {
            if (tourJoueur) {

                System.out.print("Combien de bâtons voulez-vous retirer (1, 2 ou 3) ? ");
                int choixJoueur = scanner.nextInt();

                if (choixJoueur < 1 || choixJoueur > 3 || choixJoueur > batons) {
                    System.out.println("Choix invalide. Veuillez choisir à nouveau.");
                } else {
                    batons -= choixJoueur;
                    System.out.println("Il reste " + batons + " bâton(s).");
                    tourJoueur = false;
                }
            } else {

                int choixOrdinateur = random.nextInt(3) + 1;
                System.out.println("L'ordinateur retire " + choixOrdinateur + " bâton(s).");
                batons -= choixOrdinateur;
                System.out.println("Il reste " + batons + " bâton(s).");
                tourJoueur = true;
            }
        }

        if (tourJoueur) {
            System.out.println("Bravo, vous avez gagné !");
        } else {
            System.out.println("L'ordinateur a gagné. Vous avez perdu.");
        }
    }
}

