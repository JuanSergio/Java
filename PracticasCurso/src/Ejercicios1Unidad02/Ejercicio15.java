/*
 Escribe un programa que defina un enumerado para los días de la semana. En el
 programa define una variable del enumerado y asígnale el valor del día que corresponda al
 martes. A continuación, escribe por pantalla dicha variable y escribe el valor del enumerado
 correspondiente al domingo.
 */
package Ejercicios1Unidad02;


public class Ejercicio15 {
    
    public enum DiaSemana{LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, 
                            SÁBADO, DOMINGO}
    
    public static void main(String[] args) {
        DiaSemana hoy = DiaSemana.MARTES;
        DiaSemana último = DiaSemana.DOMINGO;
        
        System.out.println( "Hoy es " +hoy +"\n Y el ultimo dia es "+último );
       
    }

    
    
}
