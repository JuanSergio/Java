
package Ejercicio1Tercera;

public class ProfesorInterino extends Profesor {
   
    public ProfesorInterino (String nombre, String apellidos, int edad, String id){
        super(nombre, apellidos, edad, id);
    }
    
    public float importeNomina(){
        return (1500);
    }
}
