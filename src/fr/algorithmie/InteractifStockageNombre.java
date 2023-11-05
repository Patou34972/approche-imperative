package fr.algorithmie;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacite = 10;
        int[] tableau = new int[capacite];
        int taille = 0;

        System.out.println("Menu :");
        System.out.println("1. Ajouter un nombre");
        System.out.println("2. Afficher les nombres existants");
        System.out.println("0. Quitter");

        while (true) {
            System.out.print("Veuillez choisir une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    if (taille == capacite) {

                        capacite *= 2;
                        int[] nouveauTableau = new int[capacite];
                        System.arraycopy(tableau, 0, nouveauTableau, 0, taille);
                        tableau = nouveauTableau;
                    }

                    System.out.print("Veuillez entrer un nombre : ");
                    int nombre = scanner.nextInt();
                    tableau[taille] = nombre;
                    taille++;
                    break;
                case 2:
                    System.out.println("Nombres existants :");
                    for (int i = 0; i < taille; i++) {
                        System.out.println(tableau[i]);
                    }
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    System.exit(0);
                default:
                    System.out.println("Option invalide. Veuillez choisir à nouveau.");
            }
        }
    }
}

