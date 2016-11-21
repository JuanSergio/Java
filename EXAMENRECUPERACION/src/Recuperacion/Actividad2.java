/*
 * Programa con menu
 * a) añadir elementos a una lista. Tres elementos: lista1, lista2, lista3
 * b) Acceder al primer elemento
 * c) Eliminar el primer elemento
 * d) Eliminar el último elemento
 * e) Eliminar todos los datos
 * f) Acceder al dato en una posicion determinada
 */
package Recuperacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad2 {
    
    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        int opcion = 1;
        String lista1 = "Carlos Sobrino";
        String lista2 = "Susana";
        String lista3 = "Jonathan";
        ArrayList<String> listas = new ArrayList<String>(3);
        do {
            System.out.println("*************************************************");
            System.out.println("1) Añadir elementos a una lista");
            System.out.println("2) Acceder al primer elemento");
            System.out.println("3) Eliminar el primer elemento");
            System.out.println("4) Eliminar el último elemento");
            System.out.println("5) Eliminar todos los datos");
            System.out.println("6) Acceder al dato en una posicion determinada");
            System.out.println("Elige una opción: ");
            System.out.println("*************************************************");
            opcion = tlc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Se van a añadir las listas a una sola...");
                    
                    listas.add(lista1);
                    listas.add(lista2);
                    listas.add(lista3);
                    System.out.println(listas);
                    break;
                
                case 2:
                    System.out.println("La primera lista es : " + listas.get(0));
                    break;
                case 3:
                    System.out.println("Borrando el primer elemento... ");
                    listas.remove(0);
                    break;
                case 4:
                    System.out.println("Borrando el último elemento... ");
                    listas.remove(listas.size() - 1);
                    System.out.println(listas);
                    break;
                case 5:
                    System.out.println("Borrando todos los datos... ");
                    listas.removeAll(listas);
                    break;
                case 6:
                    System.out.println("Elige la posicion del dato que quieres acceder: ");
                    int posicion = tlc.nextInt();
                    System.out.println(listas.get(posicion));
            }
        } while (opcion != 0);
        {
            
        }
        
    }
}
