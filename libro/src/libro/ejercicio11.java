/*
 * Un programa que al pedir la base y altura de un triangulo muestre el area.
 * area= (base * altura)/2
 */
package libro;
import java.util.*;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double base, altura, area;
        
        System.out.print("Dame la altura: ");
        altura= teclado.nextDouble();
        System.out.print("Dame la base: ");
        base= teclado.nextDouble();
        
        area= (base*altura)/2;
        System.out.println("El area es: " + area);
        
        
        
    }
    
}
