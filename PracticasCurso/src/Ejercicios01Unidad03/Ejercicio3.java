/*
 Escriba un programa en el que se solicite un número entero al usuario y el programa 
escribirá un mensaje por pantalla que indique si se trata de un 
número par o de un número impar
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int numero;
        
        System.out.println("Introduce un numero: ");
        numero = tlc.nextInt();
        
        if(numero%2==0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número no es par");
        }
    }
}
