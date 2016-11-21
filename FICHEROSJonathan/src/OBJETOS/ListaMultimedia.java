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
public class ListaMultimedia {
//clase debe tener un atributo que sea un array de objetos Multimedia y un entero
//para contar cuántos objetos hay almacenados
    ArrayList<Multimedia> Lista =new ArrayList<Multimedia>();
    private int contador;
    
//a) el constructor recibe por parámetro un entero indicando el número máximo de objetos que va a almacenar    
    public ListaMultimedia(int contadorobjetos){
        Lista = new ArrayList(contadorobjetos);       
    }
//b) int size(): devuelve el número de objetos que hay en la lista.    
    public int nºobjetos(){
        return Lista.size();
    }
//c) boolean add(Multimedia m): añade el objeto al final de la lista y 
//devuelve true, en caso de que la lista esté llena devolverá false.    
    public boolean añadirobjeto(Multimedia m){
        return Lista.add(m);
    }
//d) Multimedia get(int posición): devuelve el objeto situado en la posición especificada.   
    public Multimedia objetoposicion (int posicion){
       return Lista.get(posicion);
    }
//e) int indexOf(Multimedia m): devuelve la posición del objeto que se introduce
//por parámetro, si no se encuentra, devolverá -1.    
    public int posicionobjeto (Multimedia m){
        return Lista.indexOf(m);
    }
//f) String toString() devuelve la información de los objetos que están en la lista.    
     public String toString() {
        return "ListaMultimedia{" + "Lista=" + Lista + '}';
    }
    public ArrayList<Multimedia> getLista() {
        return Lista;
    }

    public int getContador() {
        return contador;
    }

}
