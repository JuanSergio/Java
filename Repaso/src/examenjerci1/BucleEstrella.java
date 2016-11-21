
package examenjerci1;


public class BucleEstrella {
    public static void main(String[] args) {
        int columna;
        int totalFila = 5;
        int filas = totalFila;
        
        while(filas > 0){
            filas--;
        
        
        columna = totalFila - filas;
        while(columna > 0){
            System.out.print('*');
            columna--;
        }
        
        System.out.println("");
    } 
  }
}
