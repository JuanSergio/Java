package Ejercicio01;

import java.util.Random;

/**
 *
 * @author juansergio
 */
public class ejercicio1 {

    public static void main(String[] args) {

        int[][] enteros = new int[10][10];
        int[][] A = new int[10][10];
        int[][] B = new int[10][10];
        Random rand = new Random();

        System.out.println("Diagonal Principal");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (i == j) {
                    System.out.print(enteros[i][j] + " ");
                }

            }
        }
    }
}
