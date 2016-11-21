
package coleccionSimplePila;

/**
 *
 * @author juansergio
 */
public class Pila extends ColeccionSimple{
    
    public Pila(){
        
    }
    
    public void añadir(Object o){
        getLista().addFirst(o);
    }
}
