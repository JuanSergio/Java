/*
 Escribe un programa que solicite la edad de una persona y muestre un mensaje 
por pantalla que indique si es mayor o menor que 25
 */
package Ejercicios01Unidad03;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int edad;
        
        System.out.println("Introduce tu edad: ");
        edad = tlc.nextInt();
        
        if (edad < 25){
            System.out.println("Eres menor de 25 años.");
        }else{
            System.out.println("Eres mayor de 25 años.");
        }
        
    }
 
}
