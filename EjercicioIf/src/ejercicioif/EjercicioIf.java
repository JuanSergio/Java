
package ejercicioif;
import java.util.Scanner;
public class EjercicioIf {

    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        
        double calificacion;
        
        System.out.println ("Calificación del alumno: ");
        calificacion = entrada.nextDouble();
        
        if(calificacion >5){
            System.out.println ("Aprobado");
            }
        else {
            System.out.println("Suspendido");
      
        
            
        }
    
    }
    
}
