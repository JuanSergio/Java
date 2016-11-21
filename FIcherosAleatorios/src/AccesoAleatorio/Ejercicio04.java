
package AccesoAleatorio;
import java.io.*;
import java.util.ArrayList;

public class Ejercicio04 {
    public static void main(String[] args) {
        
        try{
            
            ArrayList<Persona> agenda = new ArrayList();
            FileInputStream f = new FileInputStream("agenda.dat");
            ObjectInputStream ost = new ObjectInputStream(f);
            
            
            agenda = (miAgenda) ost.readObject();
            
            System.out.println("Contacto:");
            System.out.println("\nNombre: ");
            
            ost.close();
            
        }catch(IOException e){
            System.err.println(e);
        }catch(ClassNotFoundException e){
            System.err.println(e);
        }
    }
}
