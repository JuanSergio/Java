/*
 1.b.- Realiza una aplicación que cree un objeto de tipo Examen, lo muestre por 
pantalla, modifique su fecha y hora y lo vuelva a mostrar por pantalla.
 */
package MiRevision;


public class MainMiExamen {
    public static void main(String[] args) {
        Fecha Actual = new Fecha("5", "6","2015");
        Hora Local = new Hora (6,25);
        
        MiExamen Evaluacion = new MiExamen ("Programación", "A1", Actual, Local);
        
        System.out.println(Evaluacion);
        
        Local.setHora(7);
        Local.setMinuto(25);
        System.out.println("=====MODIFICO HORA=====");
        System.out.println(Evaluacion);
        Actual.setDia("8");
        Actual.setMes("12");
        Actual.setAnyo("2014");
        System.out.println("=====MODIFICO FECHA=====");
        System.out.println(Evaluacion);
        
    }
}
