
package cuentabancariasergio;

import java.util.Scanner;

public class CuentasBancarias{
    public static void main(String [] args){
        Scanner c=new Scanner(System.in);
        int opcion=-1;
        Cuentas cuenta=new Cuentas();
        do{
            System.out.println("== == == == BANCO EL CLAVO == == == ==");
            System.out.println("\n1. Alta de cuentas");
            System.out.println("2. Consulta de una cuenta");
            System.out.println("3. Modificar cuentas");
            System.out.println("4. Anular cuentas");
            System.out.println("5. Listado de cuentas");
            System.out.println("0. Salir");
            System.out.println("\nSelecciona una opcion: ");
            opcion=c.nextInt();
       
            switch(opcion)
            {
                case 1:
                    cuenta.nuevaCuenta();
                    break;
                case 2:
                    cuenta.consultarCuenta();
                    break;
                case 3:
                    cuenta.modificarCuenta();
                    break;
                case 4:
                    cuenta.anularCuenta();
                    break;
                case 5:
                    cuenta.visualizarCuentas();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestro servicio.");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while (opcion!=0);

    }
}
