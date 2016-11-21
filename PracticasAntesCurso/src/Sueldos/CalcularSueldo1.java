
package Sueldos;
import java.util.*;

public class CalcularSueldo1 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        String nombreEmpleado;
        int horasTrabajadas;
        float precioHora;
        float sueldoTotal;
        
        System.out.println("Introduce el nombre del empleado: ");
        nombreEmpleado = tlc.next();
        System.out.println("Introduce las horas trabajadas: ");
        horasTrabajadas = tlc.nextInt();
        System.out.println("Introduce el precio de las horas: ");
        precioHora = tlc.nextFloat();
        sueldoTotal = horasTrabajadas * precioHora;
        System.out.println("El total será: " + sueldoTotal);
       
        
    }
}
