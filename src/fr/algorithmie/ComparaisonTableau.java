package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        int longueurMax = Math.max(array1.length, array2.length);
        int[] sommeArray = new int[longueurMax];
        for (int i = 0; i < longueurMax; i++) {
            System.out.println(sommeArray[i]);
        }
    }
}
