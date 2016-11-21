
package Herencia;

public class PersonaConocidaConHermanos extends PersonaConocida  {
    public PersonaConocidaConHermanos (float altura, int edad,  String nombre){
        super(edad, altura, nombre);
        this.tieneGafas = false;
        hermanos = true;
    }
    
    public String toString(){
        return super.toString() + " y tengo un hermano";
    }
    
}
