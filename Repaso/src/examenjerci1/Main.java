
package examenjerci1;
import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        
        String nombreMatematicas = "Matematicas";
        int idMatematicas = 0;
        Asignatura matematicas = new Asignatura(nombreMatematicas, idMatematicas);
        System.out.println("La asignatura es: " + matematicas.getNombre());
        
        String nombreLengua = "Lengua";
        int idLengua = 1;
        Asignatura lengua = new Asignatura(nombreLengua, idLengua);
        System.out.println("La asignatura es: " + lengua.getNombre());
        
        String nombreIngles = "Ingles";
        int idIngles = 2;
        Asignatura ingles = new Asignatura(nombreIngles, idIngles);
        System.out.println("La asignatura es: " + ingles.getNombre());
        
        
        ArrayList<Asignatura>  asignaturas = new ArrayList<Asignatura>();
        asignaturas.add(matematicas);
        asignaturas.add(lengua);
        asignaturas.add(ingles);
        
        System.out.println("Las asignaturas que tengo son: " );
        for (int i = 0; i < asignaturas.size(); i++){
            Asignatura asignatura = asignaturas.get(i);
            System.out.println(asignatura.getNombre());
        
        }
       
        
        for(int i = 0; i < 100; i++){
            Alumno cualquiera = new Alumno (matematicas, lengua, ingles);
            cualquiera.AsignaNota1(Math.random()*10);
            cualquiera.AsignaNota2(Math.random()*10);
            cualquiera.AsignaNota3(Math.random()*10);
        
            alumnos.add(cualquiera);
            
        }
        
        for(int i = 0; i < alumnos.size(); i++){
            System.out.println("alumno " + i +": " +alumnos.get(i).getNotaMedia());    
        }
        //System.out.println("Que alumno quieres eliminar?: ");
        Scanner in = new Scanner(System.in);
        int num = 0;// = in.nextInt();
        //System.out.println("El numero es: "+num);
        
        /*boolean hola = false;
        while(hola){
            System.out.println("Hola mundo while");  
        }
        
        do{
            System.out.println("Hola mundo dowhile");
        }while(hola);
    
        */
        
        while(num != 101){
             System.out.println("Que alumno quieres eliminar?: ");
             // in hace funcion buffer
             num = in.nextInt();
             System.out.println("alumno " + num +": " +alumnos.get(num).getNotaMedia()); 
             boolean isNotError;
             int value;
             do{
                 System.out.println("Desea eliminar? si=1/no=0" );
                 value = in.nextInt();
                 isNotError = value == 1 || value == 0;
             }while(!isNotError);
             
             if(value == 1){
               alumnos.remove(num);
                 System.out.println("el alumno se ha eliminado");
             }
             
        }
        
    }
        
}
