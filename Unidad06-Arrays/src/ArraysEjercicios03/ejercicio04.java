/*
 4. Generar en cuadrado Latino de orden N. (Un cuadrado Latino de orden N es 
una matriz cuadrada en la que la primera fila contiene los N primeros números 
naturales, en orden, y cada una de las siguientes filas contiene la rotación 
de la fila anterior un lugar a la derecha. 
1 2 3 4 5 
5 1 2 3 4
4 5 1 2 3
3 4 5 1 2
2 3 4 5 1
 */
package ArraysEjercicios03;

import java.util.*;
public class ejercicio04 {
    public static void main(String[] args) {
       Scanner tlc = new Scanner (System.in);
        System.out.println("Dime el tamaño de la matriz: ");
        int numero = tlc.nextInt();
        
        int[][] matrizLatina = new int[numero][numero];
        for(int fila = 0; fila < matrizLatina.length; fila++){
            for(int columna = 0; columna < matrizLatina.length; columna++){
                if(fila == 0){
                    matrizLatina [fila][columna]= columna +1;
                }else{
                    if(columna ==0){
                    matrizLatina [fila][columna]= fila -1;
                }else{
                        matrizLatina [fila][columna] = matrizLatina [fila -1][columna -1];
                }
            }
                System.out.print(matrizLatina [fila][columna] + "\t");
        }
            System.out.println("");
    }
}
}

    

