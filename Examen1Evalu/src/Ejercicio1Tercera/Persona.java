
package Ejercicio1Tercera;

public class Persona {
    String nombre;
    String apellidos;
    int edad;
    
    public Persona (String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        
    }
    
    public String getNombre(){
        return nombre;
        }
    public String getApellidos(){
        return apellidos;
        }
    public int getEdad(){
        return edad;
        }
    
}
