
package Ejercicio1Tercera;

abstract class Profesor extends Persona{
    String idProfesor;
    
    public Profesor (String nombre, String apellidos, int edad, String id){
        super(nombre, apellidos, edad);
        idProfesor = id;
    }
     public void setidProfesor (String idProfesor){
         this.idProfesor = idProfesor;
    }
     public String getIdProfesor(){
         return idProfesor;
    }
     public void mostrarDatos(){
         System.out.println("Los datos del profesor son: " + getNombre() + 
                 " " + getApellidos() + " " + getEdad() + " " + getIdProfesor());
     }
     abstract public float importeNomina();
}
