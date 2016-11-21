
package MiRevision;
import java.io.*;
/**
 *
 * @author juansergio
 */
public class LeerArchivo {
    public static void main(String[] args){
    String nombreArchivo = "Examen.txt";
    // Declarar FileReader
    FileReader fr = null;
    try{
    fr = new FileReader(nombreArchivo);
    //Leer el primer caracter
    int caracter = fr.read();
    
    //Se recorre el fichero hasta encontrar el caracter -1
    // se marca el final del fichero
    while (caracter != -1){
        System.out.print((char) caracter);
        caracter = fr.read();
    }
  }catch (FileNotFoundException e){
            System.out.println("Error: Fichero no encontrado");
            //Mostrar el error producido por la excepción
            System.out.println(e.getMessage());
            
    }catch (Exception e){
        //Operaciones en caso de error general
        System.out.println("Error de lectura del fichero");
        System.out.println(e.getCause());
    }finally{
        try{
        //Operaciones que se harán en cualquier caso. Si hay error o no
        if (fr != null){
            fr.close();
        }
    }catch (Exception e){
            System.out.println("Error al cerrar el archivo");
            System.out.println(e.getMessage());
        }
    }
  }
}

