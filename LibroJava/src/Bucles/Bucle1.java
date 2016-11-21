/*
Leer un numero y mostrar su cuadrado. Repetir hasta que se introduzca un numero 
negativo.
 */
package Bucles;

import java.util.*;
public class Bucle1 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        int numero, cuadrado;
        System.out.println("Introduce un numero: ");
        numero = tlc.nextInt();
        
        while(numero >= 0){
            cuadrado = numero * numero;
            System.out.println("El cuadrado del numero es: " + cuadrado);
            System.out.println("Introduce un nuevo numero: ");
            numero = tlc.nextInt();
        }
    }
    
}
