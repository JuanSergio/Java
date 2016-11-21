/*
 *- la edad puede calcularse como la diferencia entre el año actual
    y el de nacimiento. Esto puede contener un error, en caso de que la fecha
    actual aún no se haya cumplido los años del año en curso.
    Suponemos que el cumpleaños del usuario ya ha tenido lugar este año.
 */
package libro;

import java.util.*;
public class ejemplo03 {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int aActual; //año en curao actual
        int aNacimiento;
        int edad;
        
        //Lectura de datos
        System.out.print("Año de nacimiento: ");
        aNacimiento = teclado.nextInt();
        System.out.print("Año actual: ");
        aActual = teclado.nextInt();
        edad= aActual - aNacimiento;//calcular la edad
        System.out.println("Tu edad es: "+ edad + " años");
        
        
    }
}
