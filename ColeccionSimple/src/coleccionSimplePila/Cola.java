package coleccionSimplePila;

/**
 *
 * @author juansergio
 */
public class Cola extends ColeccionSimple {

    public Cola() {

    }

    public void añadir(Object o) {
        getLista().addLast(o);
    }
}
