package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer un rang N dans la suite de Fibonacci : ");
        int rang = scanner.nextInt();

        int resultat = fibonacci(rang);

        System.out.println("Le nombre de rang N dans la suite de Fibonacci est : " + resultat);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int a = 0;
            int b = 1;
            int temp;

            for (int i = 2; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }

            return b;
        }
    }
}

