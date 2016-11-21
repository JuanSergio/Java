/*
 Escribe un método que devuelva el mayor de tres números
 */
package Ejercicios01Unidad04;

import java.util.Scanner;
public class Ejercicio04 {
public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int numero1, numero2, numero3;
        System.out.println("Introduce el primer número: ");
        numero1 = tlc.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = tlc.nextInt();
        System.out.println("Introduce el tercer número: ");
        numero3 = tlc.nextInt();
        
        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("El mayor es: " + numero1);
            
        }else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("El mayor es: " + numero2);
        }else if (numero3 > numero1 && numero3 > numero2){
            System.out.println("El mayor es: " + numero3);
    }
}
}
