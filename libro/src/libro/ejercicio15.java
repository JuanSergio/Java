/*
 *Pedir un número y indicar si es positivo o negativo
 */
package libro;
import java.util.*;
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num1;
        System.out.println("Introduce un numero: ");
        num1 = entrada.nextInt();
        
        if (num1 < 0){
            System.out.println("El numero introducido es positivo");
        }
        
        else {
            System.out.println("El numero introducido es negativo");
        }
        
    }
}
