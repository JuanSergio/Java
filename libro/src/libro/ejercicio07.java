/*
 *Venta de manzanas por kilo en cada trimestre con importe total
 */
package libro;
import java.util.*;
public class ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double precio;//precio de cada kilo de manzanas
        int ventas1t, ventas2t, ventas3t, ventas4t;//ventas totales por trimestre
        int iva;
        double importeTotal,importeIva,importeDefinitivo;
        System.out.print("Escriba el precio total de manzanas: ");
        precio= teclado.nextDouble();
        System.out.print("Escribe el total en kilos primer trimestre: ");
        ventas1t= teclado.nextInt();
        System.out.print("Escribe el total en kilos segundo trimestre: ");
        ventas2t= teclado.nextInt();
        System.out.print("Escribe el total en kilos tercero trimestre: ");
        ventas3t= teclado.nextInt();
        System.out.print("Escribe el total en kilos cuarto trimestre: ");
        ventas4t= teclado.nextInt(); 
        
        importeTotal= (ventas1t+ventas2t+ventas3t+ventas4t)*precio;
        System.out.println("El importe total es: "+ importeTotal+ "euros");
        System.out.print("De cuanto es el iva?: ");
        iva = teclado.nextInt();
        importeIva=importeTotal*iva/100;
        System.out.println("El iva impuesto es de:  " + importeIva +"euros");
        importeDefinitivo = importeTotal + importeIva;
        System.out.println("El precio definitivo con ivs es de: " + importeDefinitivo + " euros");
        
        
        
       
    }
    
}
