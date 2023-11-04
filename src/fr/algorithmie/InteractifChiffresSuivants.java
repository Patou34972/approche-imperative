package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre : ");
        int nombre = scanner.nextInt();

        System.out.println("Les 10 nombres suivants sont :");

        for (int i = nombre + 1; i <= nombre + 10; i++) {
            System.out.println(i);
        }
    }
}
