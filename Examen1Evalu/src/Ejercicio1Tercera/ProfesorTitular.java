
package Ejercicio1Tercera;

public class ProfesorTitular extends Profesor{
    
    
    public ProfesorTitular (String nombre, String apellidos, int edad, String id){
        super(nombre, apellidos, edad, id);
    }
    
    public float importeNomina(){
        return 1000;
    }
    
}
