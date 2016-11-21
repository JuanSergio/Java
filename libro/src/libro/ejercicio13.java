/*
 * pedir el radio de un circulo pi *r (al cuadrado)
 */
package libro;
import java.util.*;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double radio, area;
        
        System.out.print("Introduce el radio: ");
        radio = teclado.nextDouble();
        area = Math.PI*(radio*radio);
        
        System.out.println("El area es: " + area);
        
    }
    
}
