
package Ejercicio1Tercera;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        ProfesorInterino pi1 = new ProfesorInterino ("Carlos", "Díaz", 33, "hhjfhsfhakf");
        ProfesorInterino pi2 = new ProfesorInterino ("Raúl", "Lopez", 43, "fjhdkajfhasdf");
        ProfesorInterino pi3 = new ProfesorInterino ("Marta", "Abia", 25, "hfdshjkfsdaf");
        ProfesorTitular pt1 = new ProfesorTitular ("Maria", "Garcia", 36, "hfshajkfhasklhf");
        ProfesorTitular pt2 = new ProfesorTitular ("Lucia", "Heredia", 50, "jhfhfhsdlfjf");
        ProfesorTitular pt3 = new ProfesorTitular ("Marcos", "Canales", 52, "jfasjhfjhsdfdsf");
        
        ListinProfesores listaProfesor = new ListinProfesores ();
        listaProfesor.addProfesores(pi1);
        listaProfesor.addProfesores(pi2);
        listaProfesor.addProfesores(pi3);
        listaProfesor.addProfesores(pt1);
        listaProfesor.addProfesores(pt2);
        listaProfesor.addProfesores(pt3);
        listaProfesor.imprimirListin();
        
        //System.out.println("El importe total de los profesores es: "+ listaProfesor.totalNominaProfesorado());
        System.out.println("El importe total de los profesores es: "+ listaProfesor.totalNominaProfesoradoSeparadas());
        
        
    }
}
