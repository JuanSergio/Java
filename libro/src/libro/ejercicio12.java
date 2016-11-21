/*
 * un programa que pida los coeficientes a,b y c, asi como el valor de x, y 
 * y calcular el valor correspondiente de y.
 * 
 */
package libro;
import java.util.*;
public class ejercicio12 {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a,b,c;
        double x, y;
        
        System.out.print("Introduce a: ");
        a = teclado.nextDouble();
        System.out.print("Introduce b: ");
        b = teclado.nextDouble();
        System.out.print("Introduce c: ");
        c = teclado.nextDouble();
        //se muestra la ecuacuion con sus coeficientes concretos
        System.out.println("y= "+ a +" (x*x) +"+ b + " x+ " + c);
        x = teclado.nextDouble();
        
        //se calcula el valor de y
        y= a*x*x+b*x+c;
        System.out.println("Para x=" +x+" resulta y="+y);
        
        
        
        
        
    }
}
