package fr.algorithmie;
import java.util.Scanner;
import java.util.Random;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nombreAleatoire = random.nextInt(100) + 1;
        int tentative;
        int coups = 0;

        System.out.println("Bienvenue dans le jeu Plus ou Moins !");
        System.out.println("Essayez de deviner un nombre entre 1 et 100.");

        do {
            System.out.print("Entrez votre proposition : ");
            tentative = scanner.nextInt();
            coups++;

            if (tentative < nombreAleatoire) {
                System.out.println("Le nombre recherché est plus grand.");
            } else if (tentative > nombreAleatoire) {
                System.out.println("Le nombre recherché est plus petit.");
            } else {
                System.out.println("Bravo, vous avez trouvé en " + coups + " coups !");
            }
        } while (tentative != nombreAleatoire);

        System.out.println("Fin du jeu.");
    }
}


