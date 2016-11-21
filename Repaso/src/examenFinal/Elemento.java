
package examenFinal;

public class Elemento {
    String nombre;
    private static int instanciasElemento;
    //public int numeroDeElementos(){
        
    //}
    
    public Elemento (String nombre){
        this.nombre = nombre;
        instanciasElemento++;
    }
    
    public static int numeroElementos(){
        return instanciasElemento;    
    
    }
    
}
