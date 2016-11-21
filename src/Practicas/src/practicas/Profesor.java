
package practicas;

public class Profesor {
    
    public void ponerNotas (Alumno calificacion) {
    calificacion.getAsignatura1().setCalificacion(Math.random()*10);
    calificacion.getAsignatura2().setCalificacion(Math.random()*10);
    calificacion.getAsignatura3().setCalificacion(Math.random()*10);
}
    public double calcularMedia (Alumno calificacion){
        double nota1 = calificacion.getAsignatura1().getCalificacion();
        double nota2 = calificacion.getAsignatura1().getCalificacion();
        double nota3 = calificacion.getAsignatura1().getCalificacion();
        return (nota1 + nota2 + nota3)/3;
    }
}
