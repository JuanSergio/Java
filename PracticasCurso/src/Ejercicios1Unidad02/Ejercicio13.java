/*
 Escribe un programa que visualice en pantalla cuánto le dará su banco después de seis
 meses si pone 2000€ en una cuenta a plazo fijo al 2,75% anual. Recuerda que al pagarte los
 intereses el banco le retendrá el 18% para hacienda. Utiliza variables para manejar las
 cantidades y realizar los cálculos. Escribe los mensajes apropiados para entender todos los
 cálculos.
 */
package Ejercicios1Unidad02;

public class Ejercicio13 {
    public static void main(String[] args) {
        
        double pago;
        int dinero;
        int meses;
        double retencion;
        double pagoFinal;
        double plazo;
        
        
        plazo = 2.75;
        meses = 6;
        dinero = 2000;
        pago = dinero * meses;
        pago = (pago * plazo)/100;
        retencion = (pago * 18)/100;
        pagoFinal = pago - retencion;
        System.out.println("El pago es: " + pago + " €");
        System.out.println("La retención es: " + retencion + " €");
        System.out.println("El pago a recibir es: " + pagoFinal + " €");
    }
    
}

