
package ejercicioarea;
import java.util.Scanner;
public class EjercicioArea {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        float base;
        float altura;
        float area;
        
        System.out.println ("Dame la base del triángulo: ");
        base = teclado.nextFloat ();
        System.out.println ("Dame la altura del triángulo: ");
        altura = teclado.nextFloat ();
        
        
        area=(base*altura)/2;
        
        System.out.println ("El área del triangulo es:"+ area);
    }
    
}
