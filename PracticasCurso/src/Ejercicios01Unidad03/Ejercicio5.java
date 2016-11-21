/*
 Escribe un programa que permita introducir una calificación (entre cero y diez) 
e imprima su equivalente alfabético, según la siguiente tabla.
 */
package Ejercicios01Unidad03;

import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        double calificacion;
        
        System.out.println("Introduce la nota de la calificiación: ");
        calificacion = tlc.nextDouble();
        
        System.out.println("La calificación del alumno es ");
      if(calificacion < 0 || calificacion > 10)
         System.out.println("Nota no válida");
      else if(calificacion == 10)
           System.out.println("Sobresaliente");
      else if (calificacion >= 9)
           System.out.println("Sobresaliente");
      else if (calificacion >= 7)
           System.out.println("Notable");
      else if (calificacion >= 6)
           System.out.println("Bien");
      else if (calificacion >= 5)
           System.out.println("Suficiente");
      else
           System.out.println("Suspenso");
        }
    }
