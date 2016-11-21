
package ColeccionSimpleInterfaz;

import java.util.*;
public class Cola implements ColeccionSimple{
    private LinkedList<Object> lista;
    
    public Cola(){
        lista = new LinkedList<Object>();
    }
    public boolean añadir(Object o){
        lista.addLast(o);
        return true;
    }
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

    @Override
    public boolean añadir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void añadir(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
