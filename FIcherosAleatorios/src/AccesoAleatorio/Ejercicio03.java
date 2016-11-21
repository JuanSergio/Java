
package AccesoAleatorio;

import java.io.*;
import java.util.*;

public class Ejercicio03 {
    public static void main(String[] args) {
        
        try{
        
            Scanner scan = new Scanner(System.in);
            FileOutputStream f = new FileOutputStream("agenda.dat");
            ObjectOutputStream ost = new ObjectOutputStream(f);
            String newline = "\n";
            int op;
            
            do{
                
                System.out.println("Dime el nombre:");
                String nom = scan.nextLine();
                System.out.println("Dime la direccion:");
                String dir = scan.nextLine();
                System.out.println("Dime el teléfono:");
                String telf = scan.nextLine();
                scan.nextLine();
                System.out.println("Dime el email:");
                String email = scan.nextLine();
                System.out.println("*******************************************");
                System.out.println("¿Quieres seguir escribiendo más contactos?");
                System.out.println("Opción 1: 1 - NO");
                System.out.println("Opción 2: 2 - SI");
                op = scan.nextInt();
                scan.nextLine();
                            
                Persona persona = new Persona(nom,dir,telf,email); 
                miAgenda agenda = new miAgenda(persona);
                ost.writeObject(persona);
                ost.flush();
                ost.close();
                
            }while(op == 2 );
           ost.close();
        }catch(IOException e){
            System.err.println(e);
        }
        
    }
}
