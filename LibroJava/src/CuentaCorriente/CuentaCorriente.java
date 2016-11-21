/*
 CuentaCorriente con 
 Crear cuenta: se necesita dni y saldo inicial es 0.
 Sacar dinero: solo se puede sacar dinero hasta el limite de numeros rojos
 Ingresar dinero: incrementa el saldo
 Mostrar saldo: muestra el saldo
 */
package CuentaCorriente;

import java.util.*;

public class CuentaCorriente {
     String dni, nombre;
    double saldo, numRoj;

    public CuentaCorriente(String nombre, String dni) {
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
        numRoj = -50;
    }

    public boolean SacarDinero(double cantidad){
        boolean dinero = false;
        if ((saldo - cantidad )>= numRoj){//Si se intenta sacar dinero por debajo del limite
            saldo = saldo - cantidad;
            dinero = true;
            
        }else{
            System.out.println("No tienes dinero");
        }
        return (dinero);
    }
    public void IngresarDinero(double cantidad){
        saldo = saldo + cantidad;
    }
    public String toString(){
        String informacion= "Nombre " + nombre;
        informacion = informacion.concat("\nDni: " + dni );
        informacion = informacion.concat("\nSaldo: " + saldo );
        informacion = informacion.concat("\nnumRoj: " + numRoj );
        return (informacion);
        
    }

}
