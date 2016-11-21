/*
Escribe un programa que visualice en la pantalla tu nombre completo en una línea y en la
línea siguiente tu fecha de nacimiento. Para ello escribe una sentencia para escribir el nombre,
otra para escribir tu primer apellido y otra para escribir tu segundo apellido.
 */
package Ejercicios1Unidad02;

import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        String nombre;
        String apellido1;
        String apellido2;
        
        System.out.println("Tu nombre es? ");
        nombre = tlc.next();
        System.out.println("Tu primer apellido?");
        apellido1 = tlc.next();
        System.out.println("Tu segundo apellido?");
        apellido2 = tlc.next();
    }
    
}
