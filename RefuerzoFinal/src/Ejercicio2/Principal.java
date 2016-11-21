
package Ejercicio2;
import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Asignatura Lengua = new Asignatura (1, 5);
        Asignatura Matematicas = new Asignatura (2, 7);
        Asignatura Filosofia = new Asignatura (3, 6);
        
        ArrayList <Alumno> ListaAlumnos = new ArrayList <Alumno>();
            for(int i=0; i < 100; i++){
               Alumno unAlumno = new Alumno (Lengua, Matematicas, Filosofia);
               Profesor Luis = new Profesor();
               Luis.ponerNotas(unAlumno);
               System.out.println("la media del alumno es " +Luis.calcularMedia(unAlumno));
        }

    }
}
