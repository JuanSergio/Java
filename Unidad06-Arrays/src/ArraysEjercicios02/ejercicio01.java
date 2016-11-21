/*
 1. Escribe un programa que permita introducir los valores de un vector de diez 
elementos numéricos y luego imprimirlos.
 */
package ArraysEjercicios02;

public class ejercicio01 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int) (Math.random() + 25 + 0);
        }
         for(int i = 0; i < numeros.length; i++){
             System.out.println("numero "+ (i+1));
         }
         }
    }
    
