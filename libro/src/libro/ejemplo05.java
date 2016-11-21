/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;
import java.util.*;
public class ejemplo05 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int nota, nota2, nota3;//variables int para las notas
        double media; //la media es double porque contiene decimales
        
        //introduce las notas
        System.out.print("Introduce la primera nota: ");
        nota = teclado.nextInt();
        System.out.print("Introduce la segunda nota: ");
        nota2 = teclado.nextInt();
        System.out.print("Introduce la tercera nota: ");
        nota3 = teclado.nextInt();
        media = (nota + nota2 + nota3) /3.0;
        System.out.println("Tu nota media es: " + media);
        
        
    }
    
}
