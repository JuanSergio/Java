
/* miguelrosales */

package u08_gestioncuentabancaria;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String switchOption;
        Cuentas cuenta = new Cuentas();
        
        do{
            System.out.println("== ==  BANCA ROTA == == == ==");
            System.out.println("\n1. Alta de cuentas");
            System.out.println("2. Consulta de una cuenta");
            System.out.println("3. Modificar cuentas");
            System.out.println("4. Anular cuentas");
            System.out.println("5. Listado de cuentas");
            System.out.println("0. Salir");
            System.out.println("\n-- -- -- -- -- -- -- -- --");
            System.out.println("Selecciona una opcion: ");
            switchOption = teclado.nextLine();
       
            switch(switchOption){
                case "1": cuenta.NuevaCuenta();break;
                case "2": cuenta.ConsultarCuenta();break;
                case "3": cuenta.ModificarCuenta();break;
                case "4": cuenta.AnularCuenta();break;
                case "5": cuenta.VisualizarCuentas();break;
                case "6": System.out.println("\nGracias por usar este programa.");break;  
                default: System.out.println("Ha introducido un número incorrecto."); 
            }
        }while (switchOption=="0");
    }

}
