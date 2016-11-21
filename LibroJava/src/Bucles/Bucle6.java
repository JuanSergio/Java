/*
 Pedir 15 numeros y escribir la suma total
 */
package Bucles;

import java.util.*;

public class Bucle6 {

    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        int num;
        int suma;
        suma = 0;

        for (int i = 0; i <= 15; i++) {
            System.out.println("Introduce 15 numeros: ");
            num = tlc.nextInt();
            suma += num;

        }
        System.out.println("EL resultado de la suma es: " + suma);
        

    }

}
