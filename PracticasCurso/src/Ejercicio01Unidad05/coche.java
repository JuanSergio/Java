/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01Unidad05;

import java.util.*;
public class coche {
    private Scanner teclado;
    private String modelo, color;
    private int matrícula, año;
    private boolean metalizada;
    private enum tipo{mini, utilitario, deportivo, familiar};
    private enum tipo2{terceros, todoriesgo};
    
    public void inicializar () {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese modelo");
        modelo=teclado.next();
        System.out.print("Ingrese color");
        color=teclado.next();
    }    
        public void imprimir(){
            System.out.print("modelo:"+modelo);
            System.out.print("color:"+color);
            
        }  
        }
      

