
package Ejercicio1;

public class Empleado {
    
    private String nombre;
    private float[] sueldos = new float[3];
    
    
    public Empleado (String nombre, float sueldo1, float sueldo2,float sueldo3){
        this.nombre = nombre;
        sueldos[0] = sueldo1;
        sueldos[1] = sueldo2;
        sueldos[2] = sueldo3;

    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String toString(){
        return "El empelado: "+ nombre + " con sueldo1 = "+sueldos[0]+ 
                " con sueldo2 = "+sueldos[1]+" con sueldo3 = "+sueldos[2];
    }
    
    public float SumaSueldo(){
        float totalSueldo = 0;
        for(int i=0; i< sueldos.length; i++){
            totalSueldo += sueldos[i];
        }
        return totalSueldo;
    }
}
