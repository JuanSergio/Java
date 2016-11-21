/*
 * Ecribir un programa que tome como entrada un numero entero y nos indique
  que indique que cantidad hay que sumarle para el resultado sea multiplo de 7.
 */
package libro;
import java.util.*;

public class ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n, variable;
        
        System.out.print("Introduce un numero: ");
        n = teclado.nextInt();
        variable = n %7;
        System.out.println("A " + n + " hay que sumale " + (7 - variable)%7 + " para ser multiplo de 7");
        
        
        
        
    }
}
