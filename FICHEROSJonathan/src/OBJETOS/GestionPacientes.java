/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
package OBJETOS;
import java.io.*;
public class GestionPacientes {
    public static void main(String[] args) {
        try{
            
        //creamos las variables para escibir y guardar los datos al fichero.    
        FileOutputStream fos= new FileOutputStream("pacientes.dat");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
               
        //creamos un archivador, dos o tres fichas que se 
        //guardarán en el archivador
        archivador informacion1 =new archivador ();
        Ficha paciente =new Ficha ("jonathan", "ortiz", 22);
        Ficha paciente1= new Ficha ("susana","jimenez", 21);
        Ficha paciente2=new Ficha ("Wanaldino", "antimonio", 22);
        informacion1.guardar(paciente);
        informacion1.guardar(paciente1);
        informacion1.guardar(paciente2);
        
        //listamos 
        informacion1.listar();
        //eliminar ficha
        informacion1.eliminar(paciente1);
        //volvemos a listar
        informacion1.listar();
        
       oos.writeObject(informacion1.getPacientes());
       oos.close();
        
        }catch(IOException e){
            System.out.println("error de lectura o escritura");
        }
    }
}
