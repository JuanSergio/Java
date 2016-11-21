/* - Entrada  de datos:pedimos edad
 *-Procesando: en este caso incrementar la edad en 1
 *-Salida de datos: mostrar los resultados
 */
package libro;

import java.util.*;

public class ejemplo02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;//aqui se guarda la edad del usuario

        System.out.print("Escriba su edad: ");
        edad = teclado.nextInt();

        edad = edad + 1; // el año que viene tendrá un año mas
        // la línea anterior puede sustituirse por edad ++
        // ahora s epmostrara el valor de la variable edad
        System.out.println("El próximo año la edad será: " + edad + " años");

    }

}
