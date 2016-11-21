
package examen;

public class Practica5b {
    
    public static void main(String[] args) {
    
    Asignatura programacion = new Asignatura(1);
    Asignatura sistemas = new Asignatura(2);
    Asignatura fol = new Asignatura(3);
    Alumno Carlos = new Alumno(programacion, sistemas, fol);
    
    Profesor Luis = new Profesor();
    Luis.ponerNotas(Carlos);
    System.out.println("la media del alumno es: " +Luis.calcularMedia(Carlos));
}
}