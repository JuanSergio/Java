/*
 * pedir dos notas enteras y calcular su media.Media contiene decimales.
 */
package libro;
import java.util.*;
public class ejemplo04 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int nota, nota2;//variables int para las notas
        double media; //la media es double porque contiene decimales
        
        //introduce las notas
        System.out.print("Introduce nota1: ");
        nota = teclado.nextInt();
        System.out.print("Introduce la segunda nota: ");
        nota2 = teclado.nextInt();
        media = (nota + nota2) /2.0;
        System.out.println("Tu nota media es: " + media);
        
        
    }
    
}
