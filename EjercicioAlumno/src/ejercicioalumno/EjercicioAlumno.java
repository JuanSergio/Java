
package ejercicioalumno;
import java.util.Scanner;
public class EjercicioAlumno {

  
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        double nota1;
        double promedio;
        double nota2;
        double nota3;
        double nota4;
        double nota5;
        
        System.out.println ("Dame la primera nota: ");
        nota1=entrada.nextDouble ();
        System.out.println ("Dame la segunda nota: ");
        nota2=entrada.nextDouble ();
        System.out.println ("Dame la tercera nota: ");
        nota3=entrada.nextDouble ();
        System.out.println ("Dame la cuarta nota: ");
        nota4=entrada.nextDouble ();
        System.out.println ("Dame la quinta nota: ");
        nota5=entrada.nextDouble ();
        
        promedio = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
               System.out.println("El promedio del alumno es:"+" "+promedio);
    }
    
}
