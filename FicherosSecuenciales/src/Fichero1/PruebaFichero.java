
package Fichero1;
import java.io.*;

public class PruebaFichero {
    public static void main(String[] args) {
       
        File file = new File ("Miarchivo.txt");
        if(!file.exists ());
        {
            try{
                file.createNewFile();
                System.out.println(file.getName () + " Ha sido creado");
            }
            
            catch (IOException ex){
               ex.printStackTrace();
            }
                
            
        }
    }
    
    }
