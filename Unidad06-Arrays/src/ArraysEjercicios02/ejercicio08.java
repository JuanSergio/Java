/*
8. Escribe un programa que permita introducir vector de veinte elementos y 
visualizar, indicar luego posición y contenido de todos aquellos que sean 
mayores que diez. Indicando cuantos elementos hay que cumplen esta condición
 */
package ArraysEjercicios02;

public class ejercicio08 {
    public static void main(String[] args) {
         int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) { 
            numeros[i] = (int) (Math.random() * 50 + 0);
        }
        
         for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número[" + i + "]: " + numeros[i]);
        }

        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 10) {
                System.out.println("Número[" + i + "]: " + numeros[i]);
                contador++;
            }
        }

        System.out.println("Número de elementos mayores de 10 son: " + contador);
    }
}

