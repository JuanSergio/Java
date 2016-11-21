
package Fichero;
import java.util.*;
import java.io.*;
public class Disco implements Serializable{
        private String nombre;
        private String grupo;
        private int pistas;
        
        public  void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setGrupo (String grupo){
            this.grupo = grupo;
        }
        public void setPistas (int pistas){
            this.pistas = pistas;
        }
    
    //introducir datos
    public static void escribirDatos (Disco a){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dame un nombre: ");
        a.setNombre(teclado.nextLine());
        
        System.out.println("Dame un nombre del grupo: ");
        a.setGrupo(teclado.nextLine());
        
        System.out.println("Dame el numero de pistas: ");
        a.setPistas(teclado.nextInt());
        
    }
    
    /*Se crea el fichero con los datos introducidos*/
   
    public static void llenarObjetos (String datos) throws IOException{
        String nombre, grupo;
        int pistas;
       
            ObjectOutputStream oos = 
                    new ObjectOutputStream (new FileOutputStream(datos));
            
            for (int i; i <100;i++){
                
                Disco a = new Disco();
                escribirDatos(a);
                
                oos.writeObject(oos);
            }
            oos.close();   
        }
    
    //Se guarda en un arrya los datos del fichero
    public static ArrayList 
    
    }

