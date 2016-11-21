
package terceraEvaluPaisFichero;
import java.io.*;
public class Pais {
    String nombre;
    String idioma;
    int habitantes;
    
    public Pais (String nombre, String idioma, int habitantes){
        this.nombre = nombre;
        this.idioma = idioma;
        this.habitantes = habitantes;
    }
    
    public void GuardarDatos(){
        try{
            FileWriter fw = new FileWriter("C:\\archivo1.txt");
            FileReader fr = new FileReader("C:\\archivo1.txt");
            fw.write(nombre);
            fw.write(idioma);
            fw.write(habitantes);
            
            int valor = fr.read();
            while(valor!= -1){
                System.out.println((char)valor);
                valor=fr.read();
            }
            fw.close();
            fr.close();
            
            }catch(IOException e){
                System.out.println("Error");
                
        }
    }
    
}
