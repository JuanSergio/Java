
package Ejercicio2;
import java.util.*;
public class Profesor {
    
    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setCalificacion(Math.random()*10);
        alumno.getAsignatura2().setCalificacion(Math.random()*10);
        alumno.getAsignatura3().setCalificacion(Math.random()*10);

    }

    public double calcularMedia(Alumno alumno){
        return
        (alumno.getAsignatura1().getCalificacion()+alumno.getAsignatura2().getIdentificador()
        +alumno.getAsignatura3().getIdentificador())/3;
    }
}
