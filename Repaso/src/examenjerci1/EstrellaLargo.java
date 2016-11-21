
package examenjerci1;

public class EstrellaLargo {
    public static void main(String[] args) {
        int columna;
        int totalFila = 8;
        int filas = totalFila;
        
        while(filas > 0){
            columna = totalFila - filas;
        
        while(columna > 0){
            System.out.print('*');
            columna--;
        }
        
        System.out.println("");
        filas --;
    } 
      filas = 0;
      
        while(filas <= totalFila){
            columna = totalFila - filas;
        
        while(columna > 0){
            System.out.print('*');
            columna--;
        }
        
        System.out.println("");
        filas ++;
  }
}
}