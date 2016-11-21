/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJETOS;
/**
 *
 * @author mati
 */

import java.util.ArrayList;
import java.util.Iterator;

public class archivador{
    
    private ArrayList pacientes=new ArrayList();
    
public void guardar(Ficha datos){
    pacientes.add(datos);
}
public void eliminar(Ficha datos){
    pacientes.remove(datos);
}
public void listar(){
    System.out.println("Numeros de ficha " +pacientes.size());
    Iterator it=pacientes.iterator();
    while(it.hasNext())
        System.out.println((Ficha)it.next());   
   }
public ArrayList getPacientes() {
        return pacientes;
    }

}
