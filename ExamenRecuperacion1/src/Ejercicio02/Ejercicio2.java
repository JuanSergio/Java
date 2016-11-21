
package Ejercicio02;

import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {

        int[] X = new int[50];
        int[] Y = new int[10];
        int[] R = new int[50];
        Random rand = new Random();

        for (int i = 0; i < X.length; i++) {
            X[i] = rand.nextInt(10);

        }
        for (int i = 0; i < Y.length; i++) {
            Y[i] = rand.nextInt(10);
        }

        for (int i = 0; i < Y.length; i++) {
            if (X[i] == Y[i]) {
                R[i] = X[i];
            }

        }
        for (int i = 0; i < R.length; i++) {

            System.out.print(+R[i] + " ");
        }
    }

}
