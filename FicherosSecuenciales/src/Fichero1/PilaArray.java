
package Fichero1;
import java.util.*;

public abstract class PilaArray implements ColeccionSimple{
    private Object []array;
    private int contador;
    
    //formula para hacer un contador
    public PilaArray(int tamañoMáximo){
        array = new Object [tamañoMáximo];
        contador = 0;
    }
    public boolean estáVacia(){
        return contador == 0;
        
    }

}

