/*
1. Escribe un programa que lance y capture una excepción de la clase
Exception

 */
package ejercicios;

import java.util.Scanner;


public class Ejercicios01 {
       public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int edad;
        
        System.out.println("Introduce tu edad: ");
        
        try{
        edad = tlc.nextInt();
            
        if (edad < 18){
            System.out.println("Eres menor de edad.");
        }else{
            System.out.println("Eres mayor de edad.");
        }
        }catch(Exception e){
            System.out.println("No has introducido un número");
        }
        
    }
}
 





