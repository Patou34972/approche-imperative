package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] tableau = {0, 1, 2, 3};

        System.out.println("Tableau original :");
        afficherTableau(tableau);

        rotationDroite(tableau);

        System.out.println("\nTableau après la rotation à droite :");
        afficherTableau(tableau);
    }

    public static void rotationDroite(int[] tableau) {
        if (tableau.length > 0) {
            int dernierElement = tableau[tableau.length - 1];

            for (int i = tableau.length - 1; i > 0; i--) {
                tableau[i] = tableau[i - 1];
            }

            tableau[0] = dernierElement;
        }
    }

    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
}
