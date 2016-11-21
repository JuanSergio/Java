/*
 1.b.- Realiza una aplicación que cree un objeto de tipo Examen, lo muestre por
pantalla, modifique su fecha y hora y lo vuelva a mostrar por pantalla.

 */

/**
 *
 * @author juansergio
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Examen Evaluacion = new Examen("Programación", "a11", new Fecha(4,5,2015), new Hora(20,15));
        System.out.println("====== EXÁMEN ======");
        System.out.println(Evaluacion.getAsignatura());
        System.out.println(Evaluacion.getAula());
        System.out.println(Evaluacion.getFecha());
        System.out.println(Evaluacion.getHora());
        
        System.out.println("====== CAMBIAR FECHA/HORA ======");
        Evaluacion.getFecha().setDia(5);
        Evaluacion.getFecha().setMes(5);
        Evaluacion.getFecha().setAño(2016);
        Evaluacion.getHora().setHora(10);
        Evaluacion.getHora().setMinuto(20);
        System.out.println("La nueva fecha es: " + Evaluacion.getFecha().toString());
        System.out.println("La nueva hora es: " + Evaluacion.getHora().toString());
    }
}
