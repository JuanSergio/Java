/*
 Leer numeros hasta que se introduzca un 0. Indicar cada num si es impar o no
 */
package Bucles;

import java.util.Scanner;

public class Bucle3 {

    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un numero: ");
        num = tlc.nextInt();
        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("El numero es par");

            } else {
                System.out.println("El numero es impar");
            }
            System.out.println("Introduce un numero: ");
            num = tlc.nextInt();
        }
    }

}
