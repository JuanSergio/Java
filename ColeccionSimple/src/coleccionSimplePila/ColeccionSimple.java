/*
 Página 181 libro Shaun McGraw
 */
package coleccionSimplePila;

import java.util.LinkedList;

/**
 *
 * @author juansergio
 */
public abstract class ColeccionSimple {
   private LinkedList<Object> lista;
   
   public ColeccionSimple(){
       lista = new LinkedList<Object>();
   }
   
   public abstract void añadir(Object o);
   
   public Object extraer(){
       return lista.removeFirst();
   }
   public boolean estaVacia(){
       return lista.isEmpty();
   }
   public Object primero(){
       return lista.getFirst();
   }
   public String toString(){
       return lista.toString();
   }
   protected LinkedList<Object> getLista(){
       return lista;
   }
}
