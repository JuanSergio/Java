/*
 4. Desarrollar una clase llamada Practica_2 que en su método main:
 Cree e inicialice tres Asignaturas
 Cree un Alumno con las tres Asignaturas.
 Cree un Profesor que le ponga calificaciones al Alumno y muestre por pantalla la media del Alumno.
 */
package Practica02;

public class Main {
    public static void main(String[]args){
        Asignatura programacion = new Asignatura(1);
        Asignatura sistemas = new Asignatura(2);
        Asignatura lenguaje = new Asignatura(3);
        
        Alumno Pedro = new Alumno(programacion, sistemas, lenguaje);
        Alumno Carlos = new Alumno(programacion, sistemas, lenguaje);
        
        Profesor Raul = new Profesor();
        Profesor Luis = new Profesor();
        Raul.ponerNotas(Pedro);
        Luis.ponerNotas(Carlos);
//        System.out.println("La nota de Pedro es:");
        System.out.println(Raul.calcularMedia(Pedro));
        System.out.println(Luis.calcularMedia(Carlos));
    }
}

