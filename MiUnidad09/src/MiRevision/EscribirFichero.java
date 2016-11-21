
package MiRevision;
import java.io.*;

public class EscribirFichero {
    public static void main(String[] args) {
        String nombreFichero = "nuevoFichero.txt";
        String texto = "Texto prueba";
        BufferedWriter bw = null;
    try{
        bw = new BufferedWriter(new FileWriter (nombreFichero));
        bw.write(texto);
        bw.newLine();
    }catch (Exception e){
        System.out.println("Error en escritura del fichero");
        System.out.println(e.getMessage());
    }finally{
        try{
            if(bw != null){
                bw.close();
            }
        }catch(Exception e){
            System.out.println("Error al cerrar el fichero");
            System.out.println(e.getMessage());
        }
    }
  }
}
