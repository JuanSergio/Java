/*
 *redondear un numero decimal a un numero entero
 *Se le sumara un 0.5 y truncar eliminando decimales
 */
package libro;

import java.util.*;
public class ejemplo06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n;//aqui se guarda el numero decimal
        double redondeo; // se utilizará esta variable para truncar el redondeo
        
        System.out.print("Introduce el numero decimal: ");
        n = teclado.nextDouble();
        //ahora se redondea n
        redondeo = Math.floor(n + 0.5);
        
        System.out.println (n + "redondeado es: " + (int)redondeo);
        
    }
    
}
