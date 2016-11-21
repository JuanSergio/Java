
package Ejercicio2;
import java.util.*;
import java.io.*;

public class menu {
    public static void main(String[] args)throws IOException {
        ArrayList <String> listasArrayList = new ArrayList <String>();
        Scanner tlc = new Scanner (System.in);
        int opciones;
        int posicion;
        char caracter;
        do{
            System.out.println("Elije una opción: ");
            System.out.println("a) Añade tres elementos lista: ");
            System.out.println("b) Accede al primer elemento: ");
            System.out.println("c) Eliminar el primero ");
            System.out.println("d) Elimina el último dato ");
            System.out.println("e) Elimina todos ");
            System.out.println("f) Acceder al valor pedido");
            System.out.println("f) Acceder al valor pedido");
            //opciones = tlc.nextInt();
            caracter = tlc.nextLine().charAt(0);
            
            
            switch(caracter){
                case 'a':
                    System.out.println("Eligió a)");
                    for(int i=1; i<=3; i++){
                        listasArrayList.add("Elemento "+ (listasArrayList.size() + 1));
                    }
                    for(int i=0; i<listasArrayList.size(); i++){
                        System.out.print(listasArrayList.get(i) + "/ ");
                    }
                    
                    break;
                        case 'b':
                            System.out.println("Eligio b)");
                            System.out.println("El elemento en la primera posicion es: "
                                    + listasArrayList.get(0));
                            
                            
                            System.out.println("");
                        break;
                            case 'c':
                                System.out.println("Eligio c)");
                                System.out.println("Se va a eliminar el primer elemento "
                                    + listasArrayList.remove(0));
                                
                            break;
                                case 'd':
                                    System.out.println("Eligio d)");
                                    System.out.println("Se va a eliminar el último elemento "
                                    + listasArrayList.remove( listasArrayList.size()-1));
                                    
                                break;
                                    case 'e':
                                        System.out.println("Eligio e)");
                                        System.out.println("Se van a eliminar todos los elementos ");
                                        listasArrayList.clear();
                                    break;
                                        case 'f':
                                            System.out.println("Eligio f)");
                                            System.out.println("Dime una posición entre 1 y " +
                                                    listasArrayList.size() + ": ");
                                            posicion = tlc.nextInt();
                                            System.out.println("El elemento en esa posicion es: "+
                                                    listasArrayList.get(posicion - 1));
                                            
                                        break;    
            }
        }
        while (caracter !='x');
    }
}
