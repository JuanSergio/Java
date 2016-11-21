
package ejercicio02;

/**
 *
 * @author juansergio
 */
import java.util.*;
public class matriz {
    public static void main(String[] args) {
        int fila;
        int columna;
        int [][] datos = new int [5][7];
        Random x = new Random();
        int temp;
        System.out.println("La matriz de 5x7 completa: ");
        for (fila=0; fila < datos.length; fila++) {
            for (columna=0; columna < datos[fila].length; columna++) {
                datos[fila][columna]=x.nextInt(9);
                System.out.print(datos[fila][columna]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Las columnas cuarta y sexta:");
        for (fila=0; fila < datos.length; fila++) {
            System.out.print(datos[fila][3]+"\t"+datos[fila][5]);
            System.out.println();
        }
        System.out.println();
        System.out.println("Las columnas cuarta y sexta despues de cambiarse entre si:");
        for (fila=0; fila < datos.length; fila++) {
            temp=datos[fila][3];
            datos[fila][0]=datos[fila][5];
            datos[fila][3]=temp;
            System.out.print(datos[fila][0]+"\t"+datos[fila][3]);
            System.out.println();
        }      

    }
}
