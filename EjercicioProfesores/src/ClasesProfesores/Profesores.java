
package ClasesProfesores;


public class Profesores extends Persona {
    String idProfesor;
    String proyecto1;
    String proyecto2;
    String proyecto3;
    
    public Profesores (String nombre, String apellidos, int edad, String id,
                        String pro1, String pro2, String pro3){
        super(nombre, apellidos, edad);
        idProfesor = id;
        proyecto1 = pro1;
        proyecto2 = pro2;
        proyecto3 = pro3;
    }
    
    public void setIdProfesor(String idProfesor){
        this.idProfesor = idProfesor;
    }
    
    public String getIdProfesor(){
        return idProfesor;
    }
    
    public String getProyecto1(){
        return proyecto1;
    }
    public String getProyecto2(){
        return proyecto2;
    }
    public String getProyecto3(){
        return proyecto3;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre del profesor es: " + getNombre() + " " + 
                "apellidos: " + getApellidos() + " " + "con edad: " + getEdad() 
                + " " + "id: " + getIdProfesor() + " " + "con proyecto 1: " + 
                 getProyecto1() + " " + "con proyecto 2: " + getProyecto2() + " " +
                "con proyecto 3: " + getProyecto3());
    }
}
