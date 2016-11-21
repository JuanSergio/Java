/*
 A partir de dos ficheros de texto se creará un tercer fichero cuyo contenido 
 se obtendrá uniendo la información de estos ficheros. Cada línea del fichero 
 creado estará formado por la unión de la misma línea de los dos ficheros leídos.
 Se solicitará al usuario el nombre de los ficheros y la tira de separación 
 entre ambas líneas.
 */
package Ficheros;
import java.io.*;

public class Fichero01 {
    public static void main(String[] args) throws IOException {
        String nombreArchivo1 = "texto1.txt";
        String nombreArchivo2 = "texto2.txt";
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        
        try{
            br1 = new BufferedReader(new FileReader (nombreArchivo1));
            br2 = new BufferedReader(new FileReader (nombreArchivo2));
            
        while (texto1 != null){
            System.out.println(texto1);
            texto1 = br1.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getCause());
    }finally{
        try{
        
        if (br1 != null){
            br1.close();
        }
    }catch (Exception e){
            System.out.println("Error al cerrar el archivo");
            System.out.println(e.getMessage());
        }
    }
  }
}
