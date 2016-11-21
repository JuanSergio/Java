
package MiRevision;

import java.io.*;
public class LeerArchivo2 {
    public static void main(String[] args) {
    String nombreArchivo = "Examen.txt";
    BufferedReader br = null;
    try{
    br = new BufferedReader(new FileReader (nombreArchivo));
    //Leer el primer caracter
    String texto = br.readLine();
    
    while (texto != null){
        System.out.println(texto);
        texto = br.readLine();
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
        if (br != null){
            br.close();
        }
    }catch (Exception e){
            System.out.println("Error al cerrar el archivo");
            System.out.println(e.getMessage());
        }
    }
  }
}

