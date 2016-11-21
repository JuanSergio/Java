/*
 12. Escribe un programa que permita, partiendo de un vector de diez elementos 
numéricos V, generar un vector P con los elementos de V en orden inverso. 
Visualizar los dos vectores al final.
 */
package ArraysEjercicios02;

public class ejercicio12 {
    public static void main(String[] args) {
        int[] V = new int[10];
        int[] P = new int[10];

        for (int i = 0; i < V.length; i++) { 
            V[i] = (int) (Math.random() * 25 + 0);
        }

        for (int i = V.length - 1, j = 0; i >= 0; i--, j++) { 
            P[j] = V[i];
        }

        System.out.println("**************************************");
        System.out.println("*************** VECTOR V *************");
        System.out.println("***************************************");
        for (int i = 0; i < V.length; i++) { 
            System.out.println("Número[" + i + "]: " + V[i]);
        }

        System.out.println("**************************************");
        System.out.println("*************** VECTOR P *************");
        System.out.println("***************************************");
        for (int i = 0; i < P.length; i++) { 
            System.out.println("Número[" + i + "]: " + P[i]);
        }
    }
}


