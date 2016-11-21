
package Herencia;

public class PersonaConocida extends Persona {
    String nombre;
    
    public PersonaConocida(int edad , float altura, String nom){
        super(edad, altura, true, false);
        nombre = nom;
        
    }
    
    public String toString(){
        return super.toString() +  " y se llama " + nombre;
    }
    
}
