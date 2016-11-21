/*
 * Dieñar aplicacion que calcule la longitud y el area de una circunferencia.
 * Se debe de introducir el radio decimal. 
 * longitud = 2pi*radio
 * area = pi*radio al cuadrado.
 */
package libro;
import java.util.*;
public class ejercicio10 {
    public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         double radio, longitud, area;
          System.out.print("Dime el radio: ");
          radio = teclado.nextDouble();
          
          longitud = 2 * Math.PI * radio;
          System.out.println("La longitud es de: " + longitud);
          
          area = Math.PI * (radio*radio);
          System.out.println("El area es de: " + area);
         
    }
    
}
