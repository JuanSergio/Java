
package examen;


public class Main {
    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        Asignatura sistemas = new Asignatura(2);
        Asignatura lenguaje = new Asignatura(3);
        
        Alumno Pedro = new Alumno(programacion, sistemas, lenguaje);
        Profesor Raul = new Profesor();
        Raul.ponerNotas(Pedro);
        System.out.println("La nota1 es: "+ Raul.mostrarNota1(Pedro));
        System.out.println("La nota2 es: "+ Raul.mostrarNota2(Pedro));
        System.out.println("La nota3 es: "+ Raul.mostrarNota3(Pedro));
        System.out.println("La nota media es: " + Raul.calcularMedia(Pedro));
    }
}
