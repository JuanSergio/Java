/*
 Diseña un método que devuelva el mayor de cuatro números que se le
pasan como argumentos.
 */
package Ejercicios01Unidad04;

import java.util.*;
public class Ejercicio05 {
    public static void main(String[] args) {
     Scanner tlc = new Scanner (System.in);
        int numero1, numero2, numero3, numero4;
        System.out.println("Introduce el primer número: ");
        numero1 = tlc.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = tlc.nextInt();
        System.out.println("Introduce el tercer número: ");
        numero3 = tlc.nextInt();
        System.out.println("Introduce el cuarto número: ");
        numero4 = tlc.nextInt();
        
        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
            System.out.println("El mayor es: " + numero1);
            
        }else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4){
            System.out.println("El mayor es: " + numero2);
        }else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4){
            System.out.println("El mayor es: " + numero3);
        }else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3){
            System.out.println("El mayor es: " + numero4);
}
}
}