/*
 11. Escribe un programa que permita introducir un vector P de diez elementos 
numéricos, visualizar su contenido, crear un vector V con los elementos de P 
que sean mayores de diez. Visualizar luego el contenido de V.
 */
package ArraysEjercicios02;


public class ejercicio11 {
    public static void main(String[] args) {
        int[] P = new int[10];
        int contador = 0;

        for (int i = 0; i < P.length; i++) { 
            P[i] = (int) (Math.random() * 25 + 0);
            if (P[i] > 10) { 
                contador++;
            }
        }
        System.out.println("**************************************");
        System.out.println("*************** VECTOR P *************");
        System.out.println("***************************************");
        for (int i = 0; i < P.length; i++) { 
            System.out.println("Número[" + i + "]: " + P[i]);
        }
        int[] V = new int[contador];
        int posicionV = 0;
        for (int i = 0; i < P.length; i++) { 
            if (P[i] > 10) { 
                V[posicionV] = P[i];
                posicionV++;
            }
        }
        System.out.println("**************************************");
        System.out.println("*************** VECTOR V *************");
        System.out.println("***************************************");
        for (int i = 0; i < V.length; i++) { 
            System.out.println("Número[" + i + "]: " + V[i]);
        }
    }
}

