/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysEjercicios03;

import java.util.*;
public class prueba04 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime el tamaño de la matriz cuadrada: ");
        int numero = lector.nextInt();
        
        int[][] cuadradoLatino = new int[numero][numero];
        for (int fila = 0; fila < cuadradoLatino.length; fila++) {
            for (int columna = 0; columna < cuadradoLatino[fila].length; columna++) {
                if (fila == 0) {// Si es la primera fila los pongo en orden ascendente
                    cuadradoLatino[fila][columna] = columna + 1;
                } else {
                    if (columna == 0) {
                        cuadradoLatino[fila][columna] = cuadradoLatino[fila - 1][cuadradoLatino[fila].length - 1];
                    } else {
                        cuadradoLatino[fila][columna] = cuadradoLatino[fila - 1][columna - 1];
                    }

                }
                System.out.print(cuadradoLatino[fila][columna] + "\t");
            }
            System.out.println("");
        }
    }
}


