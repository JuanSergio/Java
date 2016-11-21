
package Ejercicio1Tercera;
import java.util.*;

public class ListinProfesores {
    ArrayList <Profesor> listaProfesores = new ArrayList <Profesor> ();
    
    public void addProfesores (Profesor profesor){
        listaProfesores.add (profesor);
    }
    
    public void imprimirListin(){
        for(int i=0; i<listaProfesores.size(); i++){
            Profesor unProfesor = listaProfesores.get(i);
            String nombre = unProfesor.nombre;
            String apellidos = unProfesor.apellidos;
            System.out.println("El profesor es: "+ nombre + " " + apellidos);
        }
    }
    
    public float totalNominaProfesorado(){
        float totalNominas = 0;
        for(int i=0; i<listaProfesores.size(); i++){
            System.out.println("La nómina es: "+ listaProfesores.get(i).importeNomina());
            float importeNomina = listaProfesores.get(i).importeNomina();
            totalNominas = importeNomina + totalNominas;
        }
        System.out.println("El total es: " + totalNominas);
        return totalNominas;
    }
    
    public float totalNominaProfesoradoSeparadas(){
        float totalTitulados = 0;
        float totalInterinos = 0;
        
        for(int i=0; i<listaProfesores.size(); i++){
            Profesor unProfesor = listaProfesores.get(i);
            float importeNomina = unProfesor.importeNomina();
           
            if(unProfesor instanceof ProfesorTitular){
                totalTitulados += importeNomina;
            }else{
                totalInterinos += importeNomina;
            }

            System.out.println("La nómina es: "+ importeNomina);
        }
        
        System.out.println("El total Interino es: " + totalInterinos);
        System.out.println("El total Titulado es: " + totalTitulados);
        //System.out.println("El total de los totales es: " + totalNominas);
        //return totalNominas;
        return totalTitulados + totalInterinos;

    }
}

