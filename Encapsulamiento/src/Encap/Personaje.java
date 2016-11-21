
package Encap;

public class Personaje {
    // se coloca public para que pueda usarse en otro paquete
    private int vida;
    private String nombre;
    private String imagen;
    private int posx;
    private int posy;
    
    public void cambiarNombre(String nombreNuevo){
        this.nombre = nombreNuevo;
    }
    
    public int consultarVida(){
        return this.vida;
    }
    public String consultarNombre(){
        return this.nombre;
    }
    public String consultarImagen(){
        return this.imagen;
    }
    int consultarPosx(){
        return this.posx;
    }
    int consultarPosy(){
        return this.posy;
    }
    
    public Personaje(){
        this.vida = 100;
        this.nombre = "Jugador";
        imagen = "/mati/imágenes/dos.jpg";
        posx = (int) (Math.random ()* 100);
        posy = (int) (Math.random ()* 100);
    } 
    public Personaje (String nombre){
        this.nombre = nombre;
        
    }    
        
        
        
    
    
}
