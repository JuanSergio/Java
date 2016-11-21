
package ClasesObj;
import java.util.*;

public class Personas {
    String nombre;
    byte edad;
    byte numeroPiernas;
    byte numeroBrazos;
    String colorOjos;
    byte vida;
    
    public Personas (){
        this.nombre = "Pepe";
        this.numeroPiernas = 2;
        this.numeroBrazos = 2;
        this.colorOjos = "marron";
        this.vida = 100;
    }
    
    //Se crea un polimorfismos por sobrecarga
    public Personas (String nombre, byte edad, byte numeroPiernas,
    byte numeroBrazos, String colorOjos){
        this.nombre = nombre;
        this.numeroPiernas = numeroPiernas;
        this.numeroBrazos = numeroBrazos;
        this.colorOjos = colorOjos;
        this.vida = 100;
    }
    
    public String Saludar (){
        return  ("Hola soy " + this.nombre);
        
    }
    
    public void cambiarNombre (String nombre){
        this.nombre = nombre;
        
    }
    public void enfermar (int puntosVida){
        this.vida -= puntosVida;
    }
    public void comida (int puntosVida){
        this.vida += puntosVida;
        
    }
}
