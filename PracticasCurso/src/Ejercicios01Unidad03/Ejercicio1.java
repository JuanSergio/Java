/*
Escribe un programa que solicite la edad de una persona y muestre un mensaje por 
pantalla indicando si es mayor de edad o no
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int edad;
        
        System.out.println("Introduce tu edad: ");
        edad = tlc.nextInt();
        
        if (edad < 18){
            System.out.println("Eres menor de edad.");
        }else{
            System.out.println("Eres mayor de edad.");
        }
        
    }
 
}
