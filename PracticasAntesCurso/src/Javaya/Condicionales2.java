/*
Se ingresan tres notas de un alumno, 
si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".
 */
package Javaya;

import java.util.*;
public class Condicionales2 {
    public static void main(String[] args) {
    Scanner tlc = new Scanner(System.in);
    int nota1, nota2, nota3;
    float promedio;
    nota1 = 0;
    nota2 = 0;
    nota3 = 0;
    
    
    System.out.println("Introduce la nota1: ");
    nota1 = tlc.nextInt();
    System.out.println("Introduce la nota2: ");
    nota2 = tlc.nextInt();
    System.out.println("Introduce la nota3: ");
    nota3 = tlc.nextInt();
    promedio = (nota1 + nota2 + nota3)/ 3;
    
    if(promedio >= 7){
        System.out.println("Promocionado " + promedio);
        }
    else{
        System.out.println("Suspendido " + promedio);
        }
    }
}
