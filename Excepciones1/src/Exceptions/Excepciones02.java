
package Exceptions;

import java.util.Scanner;

public class Excepciones02 {
   public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        String asignatura;
        double nota1;
        double nota2;
        double notaFinal;
  

        System.out.println("El nombre de la asignatura?");
        asignatura = tlc.next();
        System.out.println("Cuál fue la primera nota?");
        try{
        nota1 = tlc.nextDouble();
        
        System.out.println("Cuál fue la segunda nota?");
        nota2 = tlc.nextDouble();
        notaFinal = (nota1+nota2)/2;
        System.out.println("La nota final es: " + notaFinal);
        }catch(Exception excep1){
            System.out.println("No has introducido un valor numérico");
        }
    }
    
} 

