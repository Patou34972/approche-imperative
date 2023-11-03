package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array1 = {1, 15, 9, 10, 25, 36 };
        int longueur = array1.length;
        for (int i = 0; i < array1.length; i++);
        if (longueur > 0) {
            if (array1[0] == 6 || array1[longueur - 1] == 6) {
                  System.out.println(true);
              } else {
                  System.out.println(false);
              }

          }



    }
}
