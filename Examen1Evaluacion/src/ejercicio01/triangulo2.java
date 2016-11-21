/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

public class triangulo2 {
    public static void main(String[] args) {
        int columna;
        int totalFila = 5;
        int filas = totalFila;
        
        while(filas > 0){
            filas--;
        
        
        columna = totalFila - filas;
        if(columna == 1){
            System.out.println("1");
            columna--;
        }else if(columna == 2){
            System.out.println("1 2");
            columna--;
        }else if(columna == 3){
            System.out.println("1 2 3");
            columna--;
        }else if(columna == 4){
            System.out.println("1 2 3 4");
            columna--;
        }else if(columna == 5){
            System.out.println("1 2 3 4 5");
            columna--;
        
        System.out.println("");
    } 
  }
}
}

