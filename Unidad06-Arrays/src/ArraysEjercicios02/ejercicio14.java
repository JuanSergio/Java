/*
 14. Escribe un programa que permita, a partir de un vector V de 50 elementos, 
crear e imprimir un vector P con los elementos de V cuyo contenido sea par. 
Si no lo hubiera visualizar el mensaje adecuado.
 */
package ArraysEjercicios02;

public class ejercicio14 {
 public static void main(String[] args) {
        int[] V = new int[50];
        int contador = 0;

        for (int i = 0; i < V.length; i++) {
            V[i] = (int) (Math.random() * 25 + 0);
            if (V[i] % 2 == 0) {
                contador++;
            }
        }
        for (int i = 0; i < V.length; i++) { 
            System.out.println("Número[" + i + "]: " + V[i]);
        }
        int[] P = new int[contador];
        int posicionV = 0;
        for (int i = 0; i < V.length; i++) { 
            if (V[i] % 2 == 0) { 
                P[posicionV] = V[i];
                posicionV++;
            }
        }
    
        if (contador == 0) { 
            System.out.println("NO HAY NIGÚN NÚMERO PAR EN EL VECTOR");
        } else {
            for (int i = 0; i < P.length; i++) { 
                System.out.println("Número[" + i + "]: " + P[i]);
            }
        }
    }
}
