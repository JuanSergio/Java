
package interfaces;
import java.util.*;
public class publicacion {
    private String codigo;
    private String titulo;
    private int año;
    
    public publicacion (String codio, String titulo, int año){
        this. codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }
    public int getAño(){
    return año;  
}
    public String getCodigo(){
        return codigo;
    }
    
    public String toString(){
        return ("Codigo: "+ codigo+"titulo: "+titulo+"año: "+ año);
    }
}

