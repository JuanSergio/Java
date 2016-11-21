/*
 3. Escribe un programa que permita introducir un vector de 20 elementos 
numéricos y visualizarlos de cuatro en cuatro.
 */
package ArraysEjercicios02;
import java.util.*;
public class ejercicio03 {
    public static void main(String[] args) {
        int[] numeros = new int [20];
        Scanner tlc = new Scanner (System.in);
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int) (Math.random() * 25 + 0);
        }
        for(int i = 0; i < numeros.length; i++){
            System.out.printf(" %4d " , numeros[i]);
            if ((i+1)%4==0)
                System.out.println();    

        }
    }
}
