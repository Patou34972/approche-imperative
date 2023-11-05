package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plusGrand = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Veuillez saisir le nombre " + i + ": ");
            int nombre = scanner.nextInt();

            if (nombre > plusGrand) {
                plusGrand = nombre;
            }
        }

        System.out.println("Le plus grand nombre parmi les 10 nombres est : " + plusGrand);
    }
}

