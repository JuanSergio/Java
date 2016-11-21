/*
 2. Escribe un programa que permita introducir un vector de diez elementos 
alfanuméricos y luego visualizar los que ocupen la posición par.
Repetir para los de posición impar.
 */
package ArraysEjercicios02;
import java.util.*;
public class ejercicio02 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        String[] elementos = new String [10];
        for(int i = 0; i< elementos.length; i++){
            System.out.println("elemento "+ (1+1) + ": ");
            elementos[i] = tlc.nextLine();
        }
        for (int i = 0; i < elementos.length; i++) { 
            if ((i+1) % 2 == 0) {
                System.out.println("elemento par " + (i+1) + ": " 
                        + elementos[i]);
            }
        }
        for (int i = 0; i < elementos.length; i++) { 
            if ((i+1) % 2 != 0) {
                System.out.println("elemento impar " + (i+1) + ": " 
                        + elementos[i]);
            }
        }
    }
}
