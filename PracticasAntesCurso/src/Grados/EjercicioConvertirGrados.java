
package Grados;
import java.util.*;

public class EjercicioConvertirGrados {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        double celsius;
        double fahrenheit;
        System.out.println("Introduce los grados celsius: ");
        celsius = tlc.nextDouble();
        fahrenheit = 32 +(9 * celsius / 5);
        System.out.println("Los celsius pasados a fahrenheit son: " + fahrenheit);
        
        
    }
}
