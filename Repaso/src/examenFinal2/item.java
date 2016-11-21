
package examenFinal2;

public class item {
    String nombre;
    int id;
    static int contInstancias;
    
    public item(String nombre){
        this.nombre = nombre;
        ++contInstancias;
        id=contInstancias;
    }
    
    
    
}
