/*
 Crea un programa o método que permita al usuario introducir datos como objetos
de la clase y se guarden en el fichero de datos agendaObject.dat
 */
package agenda;

import java.io.*;
import java.util.*;
public class agenda {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner tlc = new Scanner (System.in);
        boolean salida = false;
        String cadena = "agendaObject.dat";
        
        File file = new File (cadena);
        //file existe o no
        
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch(IOException e){
                System.out.println("No se ha podido crear el fichero");
                System.out.println(e.getMessage());
                salida = true;
            }
        }else{
            System.out.println("El fichero ya esxiste, por lo tanto, debe primero borrarse\n");
            salida = true;
        }
        if(salida == false){
            try{
                //flujo de datos
                FileOutputStream ficha = new FileOutputStream (file);
                BufferedOutputStream b = new BufferedOutputStream (ficha);
                ObjectOutputStream o = new ObjectOutputStream (b);
                
                String nombre, direccion, email, fono;
                
                do{
                    System.out.println("Introduce un nombre: ");
                    System.out.println("Nombre: ");
                    nombre = tlc.nextLine();
                    System.out.println("Introduce una direccion: ");
                    System.out.println("Direccion: ");
                    direccion = tlc.nextLine();
                    
                    //ingresar varios telefonos y almacenarlos
                    ArrayList lista = new ArrayList();
                    do{
                        System.out.println("Telefono: ");
                        fono = tlc.nextLine();
                        //agregar telefonos a la lista
                        lista.add(fono);
                        System.out.println("añadir otro telefono: Si/No");
                        cadena = tlc.nextLine();
                    }while(cadena.equals("si") || cadena.equals("SI"));
                    System.out.println("Email: ");
                    email = tlc.nextLine();
                    
                    //alamcenar los telefonos en agenda
                    o.writeObject(new miAgenda(nombre, direccion, email, lista));
                    
                    System.out.println("\nOtro registro? ");
                    cadena = tlc.nextLine();
                    
                }while(cadena.equals("si") || cadena.equals("SI"));
                o.close();
            }catch(IOException e){
                System.out.println(e);
            }
        }
    }
}
