/*
 Escribe un método que devuelva el mayor de dos números
 */
package Ejercicios01Unidad04;

import java.util.*;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int numero1, numero2;
        System.out.println("Introduce el primer número: ");
        numero1 = tlc.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = tlc.nextInt();
        
        if (numero1 > numero2){
            System.out.println("El mayor es: " + numero1);
            
        }else{
            System.out.println("El mayor es: " + numero2);
        }
    }
}
