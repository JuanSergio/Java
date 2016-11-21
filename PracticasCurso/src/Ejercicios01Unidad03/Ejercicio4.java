/*
 Escribe un programa que solicite dos números reales y 
los escriba ordenados de menor a mayor
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int numero1, numero2;
    
        System.out.println("Introduce el primer número: ");
        numero1 = tlc.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2 = tlc.nextInt();
    
        if(numero1>numero2){
            System.out.println(numero2 + " , " + numero1);
        }else{
            System.out.println(numero1 + " , " + numero2);
        }
    }
}
