
package Ejercicio1;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    
    
    public Empresa(){
        
    }
    
    public void anyadirEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public void cargar(ArrayList<Empleado> cargaEmpleados){
        for(int i=0; i < cargaEmpleados.size(); i++ ){
            empleados.add(cargaEmpleados.get(i));
        }
    }
    
    public float[] CalculaSumaSueldos (){
        float[] empleadosTotales = new float[empleados.size()];
        for(int i = 0; i < empleadosTotales.length; i++){
            empleadosTotales[i] = empleados.get(i).SumaSueldo();
        }
        return empleadosTotales;
    }
    
    public void ImprimeTotalPagado(){
        for(int i= 0; i < empleados.size(); i++){
            System.out.println(empleados.get(i).toString());
        }
    }
    
    public String EmpleadoMayorSueldo(){
        String nombreMaximo = "";
        float sueldoMaximo = -1;
        for(int i= 0; i < empleados.size(); i++){
            float sueldoEmpleado = empleados.get(i).SumaSueldo();
            if(sueldoEmpleado > sueldoMaximo){
                sueldoMaximo = sueldoEmpleado;
                nombreMaximo = empleados.get(i).getNombre();
            }
        }
            
        return nombreMaximo;
 
    }
    
   
    
}
