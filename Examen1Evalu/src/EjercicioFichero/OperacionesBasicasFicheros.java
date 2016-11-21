
package EjercicioFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OperacionesBasicasFicheros {
    String path;
    
    public OperacionesBasicasFicheros (String path){
        this.path = path;
    }
    
    public int CuentaLineas (){
       int numeroLineas = 0;
       try{
           FileReader file = new FileReader(path);
            BufferedReader buffer = new BufferedReader(file);
            while(buffer.readLine()!=null) {
                numeroLineas++;
            }
            buffer.close();
       }catch(IOException e){
           System.out.println("No ha podido leer el fichero: " + e.getMessage());
       }
        return numeroLineas;
    } 
    public int CuentaPalabras (String palabra){
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
                    if(palabras[i].toLowerCase().equals(palabra.toLowerCase())) {
                        numeroPalabras++;
                    }
                   
                }
               
            }
            buffer.close();
       }catch(IOException e){
           System.out.println("No ha podido leer el fichero: " + e.getMessage());
        
        }
        return numeroPalabras;
    }
    public int CuentaCaracteres (char letra){
        int numeroCaracteres = 0;
        String linea;
        try{
            FileReader file = new FileReader(path);
            BufferedReader buffer = new BufferedReader(file);
            while( (linea = buffer.readLine())!=null) {

                for(int i =0; i<linea.length();i++){
                    if(letra == linea.charAt(i)){
                       numeroCaracteres++; 
                    }
                }
                
            }
            buffer.close();
       }catch(IOException e){
           System.out.println("No ha podido leer el fichero: " + e.getMessage());
        
        }
        return numeroCaracteres;
    }
    
    public int DiferenciaPalabras(char a, char b){
        int totalA = CuentaCaracteres(a);
        int totalB = CuentaCaracteres(b);
        return Math.abs(totalB - totalA);
    }
     
}
    
