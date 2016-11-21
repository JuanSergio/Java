/*
 6. Escribe un programa que permita introducir vector de diez elementos 
numéricos, visualizarlo y luego indicar cuales elementos son pares y ocupan una 
posición par, indicar contenido y posición.
Repetir para contenido múltiplo de tres y posición impar.
 */
package ArraysEjercicios02;

public class ejercicio06 {
    public static void main(String[] args) {
        int[] numeros = new int [10];
        
        for (int i = 0; i< numeros.length; i++){
            numeros[i] = (int) (Math.random() * 1000 + 0);
        }
         int suma = 0;
        for (int i = 0; i < numeros.length; i++) { 
            if (i % 2 == 0 && numeros[i] % 2 == 0) {
                System.out.println("Posición[" + i + "]: " + numeros[i]);
            }
        }

        for (int i = 0; i < numeros.length; i++) { 
            if (i % 2 != 0 && numeros[i] % 2 != 0) {
                System.out.println("Posición[" + i + "]: " + numeros[i]);
            }
        }

        for (int i = 0; i < numeros.length; i++) { 
            if (i % 3 == 0 && numeros[i] % 3 == 0) {
                System.out.println("Posición[" + i + "]: " + numeros[i]);
            }
        }
    }
}
