
package Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empleado empelado1 = new Empleado ("Pepe", 1200, 800, 600);
        Empleado empelado2 = new Empleado ("Abel", 3005, 6885, 4000);
        Empleado empelado3 = new Empleado ("Juanse", 550, 440, 550);
        Empleado empelado4 = new Empleado ("Carlos", 550, 550, 770);
        Empresa empresa = new Empresa ();

        ArrayList<Empleado> ListaEmpleados = new ArrayList <Empleado>();
        ListaEmpleados.add(empelado1);
        ListaEmpleados.add(empelado2);
        ListaEmpleados.add(empelado3);

        empresa.cargar(ListaEmpleados);
        
        empresa.ImprimeTotalPagado();
        
        empresa.anyadirEmpleado(empelado4);
      
        empresa.ImprimeTotalPagado();
        
        
        System.out.println(empresa.EmpleadoMayorSueldo());
        
        float[] listadoSueldos = empresa.CalculaSumaSueldos();
        for(int i= 0; i < listadoSueldos.length; i++){
            System.out.println(listadoSueldos[i]); 
        }

    }
    
}
