/*
 2. Introduce una matriz de 7 x 5 y visualízala. A continuación:
 Crea una nueva matriz de 7 x 7 en donde las cinco primeras columnas sean 
las de la matriz origen
 Guarda en la columna sexta la suma de las cinco anteriores
 Guarda en la columna séptima la media de las cinco primeras
 */
package ArraysEjercicios03;
import java.util.*;
public class ejercicio02 {
    public static void main(String[] args) {
        int fila;
        int columna;
        int columna6 = 0;
        int[][] datos1 = new int [7][5];
        int[][] datos2 = new int [7][7];
        Random x = new Random ();
        System.out.println("Las filas y las columnas: ");
        for(fila = 0; fila < datos1.length; fila++){
            for(columna = 0; columna < datos1.length; columna++){
               datos1[fila][columna] = x.nextInt(9);
               datos2[fila][columna] = datos1[fila][columna];
                System.out.println(datos1[fila][columna] + "\t");
            }
            System.out.println();
        }
        for(fila = 0; fila < datos1.length; fila++){
            for(columna = 0; columna < datos1.length; columna++){
                columna6= columna6 + datos1[fila][columna];
            }
            datos2[fila][5]=columna6;
            datos2[fila][6]=columna6/datos1[fila].length;
            columna6=0;
        }
        System.out.println();
        System.out.println("La matriz de 7x7 completa: ");
        for (fila=0; fila < datos2.length; fila++) {
            for (columna=0; columna < datos2[fila].length; columna++) {
                System.out.print(datos2[fila][columna]+"\t");
            }
            System.out.println();
        }
    }
}
