
package ejerciciosueldo;
import java.util.Scanner;
public class EjercicioSueldo {
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       int horas;
       int precio;
       int sueldo;
       
       System.out.println ("Cuantas horas trabajastes durante el mes?: ");
       horas= entrada.nextInt();
       System.out.println ("A cuanto las cobras?: ");
       precio= entrada.nextInt();
       
       sueldo = horas * precio;
       System.out.println ("Te correcponde: "+" "+sueldo);
       
    }
    
}
