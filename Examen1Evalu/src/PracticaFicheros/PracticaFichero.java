/*Crear un fichero que cuente cuantas palabras tienen la "x" letra*/
package PracticaFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PracticaFichero {
    String path;
   
    public PracticaFichero (String path){
        this.path = path;
    }
    
    public int CuentaLineas(){
        int numeroDeLineas = 0;
        try{
            FileReader file = new FileReader(path);
            BufferedReader buffer = new BufferedReader(file);
            while(buffer.readLine() !=null){
                numeroDeLineas++;
            }
            buffer.close();
        }
        catch (IOException e){
            System.out.println("No se encontro el fichero");
        }
        return numeroDeLineas;
    }
    
    public String Contenido(){
      String cadena;
      try{
      FileReader file = new FileReader(path);
      BufferedReader buffer = new BufferedReader(file);
      while((cadena = buffer.readLine())!=null) {
            System.out.println(cadena);
      }
      buffer.close();
    }
      catch(IOException e){
          System.out.println("No se encontro el archivo");
      }
      return "";
    }
    
   public int CuentaCaracterPorPalabra (char caracter){
        int numeroPalabras = 0;
        String linea;
        
        try{
            FileReader file = new FileReader(path);
            BufferedReader buffer = new BufferedReader(file);
            while( (linea = buffer.readLine())!=null) {
                
                linea = linea.replaceAll(",", "");
                //split genera un array obviando lo que le marques
                String[] palabras = linea.split(" ");
                for(int i=0; i<palabras.length; i++){
                   for(int j=0; j<palabras[i].length(); j++){
                       char c = palabras[i].charAt(j);
                       if (caracter == c){
                         numeroPalabras++;
                         break;
                       }
                   }
                   
                }
               
            }
            buffer.close();
       }catch(IOException e){
           System.out.println("No ha podido leer el fichero: " + e.getMessage());
        
        }
        return numeroPalabras;
    }
}
