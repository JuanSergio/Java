
package ClasesProfesores;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        ProfesoresDepartamento pd1 = new ProfesoresDepartamento ("Carlos", "Suarez", 54, "Clave1", 
                "proyecto1", "proyecto2", "proyecto3");
     JefeDepartamento listaProfesores = new JefeDepartamento();
     listaProfesores.addProfesoresDepartamento(pd1);
     listaProfesores.imprimirLista();
     
        System.out.println("Los profesores en el departamento son: " + listaProfesores);
    }
}
