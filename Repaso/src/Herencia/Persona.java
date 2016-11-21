
package Herencia;

public class Persona {
    public int edad;
    public float altura;
    public boolean hermanos;
    public boolean tieneGafas;
    
    public Persona (int edad, float altura, boolean tieneGafas, boolean hermanos){
        this.edad = edad;
        this.altura = altura;
        this.hermanos = hermanos;
        this.tieneGafas = tieneGafas;
        
    }
    
    public String toString(){
        return "Mi edad es: " + edad + " y mi altura es: " + altura;
    }
            
}
