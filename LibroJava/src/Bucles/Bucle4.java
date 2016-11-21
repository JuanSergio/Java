/*
 Pedir num hasta teclear uno negativo, y mostrar cuantos numeros se han introducido

 */
package Bucles;

import java.util.*;

public class Bucle4 {

    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        int num;
        int contador = 0;

        System.out.println("Introduce numero: ");
        num = tlc.nextInt();

        while (num >= 0) {
            contador = contador + 1;
            System.out.println("Introduce numero: ");
            num = tlc.nextInt();

        }
        System.out.println("Las veces que se han introducido numeros son: " + contador);
    }

}
