/*
 Escribe un programa que solicite un número entero e indique si se trata 
 de un número primo o no.
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int numero;
        boolean primo = true;
        
        System.out.println("Introduce un número: ");
        numero = tlc.nextInt();
        
        for(int i=2; i<numero && !primo ;i++){
           if(numero%i==0){
              primo=false; 
           }     
        }
        if(primo==true){
            System.out.println("El númeroe s primo");
        }else{
            System.out.println("El número no es primo");
        }
        for(int i=2;i<numero;i++){
        if(numero%i==0){
        primo=false;
        break;
        }
    }
  }
}
