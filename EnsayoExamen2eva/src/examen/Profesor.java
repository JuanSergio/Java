package examen;

import java.util.*;

public class Profesor {

    public void ponerNotas(Alumno a) {
        a.getAsignatura1().setCalificacion(Math.random() * 10);
        a.getAsignatura2().setCalificacion(Math.random() * 10);
        a.getAsignatura3().setCalificacion(Math.random() * 10);

    }

    public double mostrarNota1(Alumno a) {
        double nota1 = a.getAsignatura1().getCalificacion();
        return nota1;
    }
    public double mostrarNota2(Alumno a){
        double nota2 = a.getAsignatura2().getCalificacion();
        return nota2;
    }
    public double mostrarNota3(Alumno a){
        double nota3 = a.getAsignatura3().getCalificacion();
        return nota3;
    }
    
    
    public double calcularMedia(Alumno a){
     double nota1 = a.getAsignatura1().getCalificacion();
     double nota2 = a.getAsignatura2().getCalificacion();
     double nota3 = a.getAsignatura3().getCalificacion();
     return (nota1 + nota2 + nota3)/3;
     }
     
}
