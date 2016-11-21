package ColeccionSimpleInterfaz;

import java.util.*;

public class PilaArrayList extends ArrayList<Object> implements ColeccionSimple {

    public PilaArrayList() {

    }

    public boolean estaVacia() {
        return isEmpty();
    }

    public boolean añadir(Object o) {
        add(0, o);
        return true;
    }

    public Object primero() {
        return get(0);
    }

    public Object extraer() {
        return remove(0);
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


