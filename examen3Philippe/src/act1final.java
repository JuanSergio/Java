
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mati
 */
public class act1final {

    public static void main(String[] args) {
        int fila;
        int columna;
        int[][] matriz = new int[5][5];
        Random x = new Random();
        int temp;
        System.out.println("La matriz sera de 5x5");

        for (fila = 0; fila < matriz.length; fila++) {
            for (columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = x.nextInt(10);
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Columnas segunda y cuarta");

        for (fila = 0; fila < matriz.length; fila++) {
            System.out.print(matriz[fila][1] + "\t" + matriz[fila][3]);
            System.out.println();
        }
        System.out.println();
        System.out.println("Filas segunda y cuarta");

        for (columna = 0; columna < matriz.length; columna++) {
            System.out.print(matriz[1][columna] + "\t" + matriz[3][columna]);
            System.out.println();
        }

        System.out.println();
        System.out.println("Filas segunda y cuarta despues de intercambiarse");
        //for para intercambiar fila por columna
        for (fila = 0; fila < matriz.length; fila++) {
           

                temp = matriz[1][fila];
                matriz[1][fila] = matriz[fila][1];
                matriz[fila][1] = temp;
                //System.out.println(matriz[1][fila]+"\t" +matriz[fila][1]);
            }
        //for para ver el resultado intercambiado
        for (fila = 0; fila < matriz.length; fila++) {
            for (columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }

        }
    }


