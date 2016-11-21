/*
 13. Escribe un programa que permita, partiendo de un Vector V de cincuenta 
elementos, generar un vector P de cincuenta elementos de forma que:
P(1)=V(1), P(2)=V(1)+V(2), P(3)=V(1)+V(2)+V(3)
…. P(50)= V(1)+V(2)+V(3)+…+ V(50)
 */
package ArraysEjercicios02;

public class ejercicio13 {
 public static void main(String[] args) {
        int[] V = new int[50];
        int[] P = new int[50];
       
        for (int i = 0; i < V.length; i++) { 
            V[i] = (int) (Math.random() * 25 + 0);
        }
        P[0] = V[0];
        for (int i = 1; i < P.length; i++) { 
            P[i] = P[i - 1] + V[i];
        }
        for (int i = 0; i < V.length; i++) { 
            System.out.println("Número[" + i + "]: " + V[i]);
        }
        for (int i = 0; i < P.length; i++) { 
            System.out.println("Número[" + i + "]: " + P[i]);
        }
    }
}

