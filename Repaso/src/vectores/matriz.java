
package vectores;
import java.util.*;

public class matriz {
   Scanner teclado = new Scanner (System.in); 
    public String[] empleado;
    public int[][] sueldo;
    public int[] sueldoTot;
    
    public void cargar(){
        empleado = new String[4];
        sueldo = new int [4][3];
      
        for(int i = 0; i<empleado.length; i++){
            System.out.println("Ingrese nombre del empleado: ");
            empleado[i]=teclado.next();
        for(int b = 0; b<sueldo[i].length; b++){
            System.out.println("Introduce el sueldo del empleado: ");
            sueldo[i][b]=teclado.nextInt();
        }    
      }
    }
    
    public void calcularSumaSueldos(){
        sueldoTot = new int [4];
        for(int i=0; i<sueldo.length; i++){
        int suma = 0;
        for(int b=0; b<sueldo[i].length; b++){
            suma=suma+sueldo[i][b];
        }
        sueldoTot[i]=suma;
      }
    }
    public void imprimirTotalPagado(){
        System.out.println("El total pagado es: ");
        for(int i = 0; i<sueldoTot.length; i++){
            System.out.println(empleado[i]+ " - " + sueldoTot[i]);
        }
    }
    
    public void EmpleadoMayorSueldo(){
        int may = sueldoTot[0];
        String nom = empleado[0];
        for(int i = 0; i<sueldoTot.length;i++){
            if (sueldoTot[i]>may){
               may=sueldoTot[i];
               nom=empleado[i];
            }
        }
        System.out.println("El empleado con mayor sueldo es: "+nom +
                " con sueldo de: "+ may);
    }
    
    public static void main(String[] args) {
        matriz ma = new matriz();
        ma.cargar();
        ma.calcularSumaSueldos();
        ma.imprimirTotalPagado();
        ma.EmpleadoMayorSueldo();
        
        
    }
   
}
