/*
 * Modificar ejercicio08 par que indcando dos numeros n y m nos diga la cantidad
que sumarle para que n sea multiplo de m.
 */
package libro;
import java.util.*;
public class ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n, m, variable;
        System.out.print("Dime n: ");
        n = teclado.nextInt();
        System.out.print("Dime m: ");
        m = teclado.nextInt();
        
        variable= n %m;
        System.out.println("A " + n + " hay que sumerle " + (m - variable)%m + " para ser multimplo de m");
        
         
        
      
        
    }
}
