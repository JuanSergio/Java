
package Triangulo;
import java.util.*;

public class LogitudHipotenusa {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        double cateto1;
        double cateto2;
        double cateto3;
        System.out.println("Introduce el cateto 1: ");
        cateto1 = tlc.nextDouble();
        System.out.println("Introduce el cateto 2: ");
        cateto2 = tlc.nextDouble();
        cateto3 = (cateto1 * 2) + (cateto2 * 2)/2;
        System.out.println("La longitud del cateto3 será: " + cateto3);
        
        
    }
 
}
