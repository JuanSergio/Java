/*
Escribe un programa que visualice en pantalla cuánto le dará su banco después de seis
meses si pone 2000€ en una cuenta a plazo fijo al 2,75% anual. Recuerda que al pagarte los
intereses el banco le retendrá el 18% para hacienda.
 */
package Ejercicios1Unidad02;


public class Ejercicio7 {
    public static void main(String[] args) {
        
        double pago;
        double retencion;
        double pagoFinal;
        
        pago = 2000 * 6;
        pago = (pago * 2.75)/100;
        retencion = (pago * 18)/100;
        pagoFinal = pago - retencion;
        System.out.println("El pago es: " + pago + " €");
        System.out.println("La retención es: " + retencion + " €");
        System.out.println("El pago a recibir es: " + pagoFinal + " €");
    }
    
}
