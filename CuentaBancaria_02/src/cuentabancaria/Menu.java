
package cuentabancaria;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cuentas cuentas = new Cuentas();
        byte opcionDeCuenta;
        
        do{
        System.out.println("======= BANCO UNIVERSAL ========");
        System.out.println("1. Alta de cuentas");
        System.out.println("2. Consulta de una cuenta");
        System.out.println("3. Modificar cuentas");
        System.out.println("4. Anular cuentas");
        System.out.println("5. Listado de cuentas");
        System.out.println("0. Salir");
        System.out.print("\nSeleccione una opción: ");
        
        opcionDeCuenta = teclado.nextByte();
        switch(opcionDeCuenta){
            case 1: cuentas.NuevaCuenta();break;
            case 2: cuentas.ConsultarCuenta();break;
            case 3: cuentas.ModificarCuenta();break;
            case 4: cuentas.AnularCuenta();break;
            case 5: cuentas.VisualizarCuentas();break;
            case 0: System.out.println("\nGracias por usar este programa.");break;  
            default: System.out.println("Ha introducido un número incorrecto.");    
        }
        }while(opcionDeCuenta!=0);
    }
}
