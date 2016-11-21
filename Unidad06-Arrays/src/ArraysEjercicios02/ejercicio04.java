/*
 4. Escribe un programa que permita introducir vector numérico de diez 
elementos, visualizarlo y luego visualizar los elementos cuyo contenido sea par, 
indicando su posición.
Repetir para impar.
 */
package ArraysEjercicios02;

import java.util.*;
public class ejercicio04 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner tlc = new Scanner (System.in);
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int) (Math.random() * 10000 + 0);
        }
        for(int i = 0; i< numeros.length; i++){
            System.out.println("numero[" + i + "] = " + numeros[i]);
        }
        //par
        for(int i = 0; i< numeros.length; i++){
            if (numeros[i] % 2 == 0) {
                System.out.println("Posición[" + i + "]: " + numeros[i]);
        }
    }
        //impar
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("Posición[" + i + "]: " + numeros[i]);
            }
        }
    }
}

  
