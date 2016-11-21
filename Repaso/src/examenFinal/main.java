
package examenFinal;

public class main {
    public static void main(String[] args) {
        Elemento persona1 = new Elemento("Juan");
        Elemento persona2 = new Elemento("Pepe");
        System.out.println("El nombre es: "+ persona1.nombre );
        System.out.println("El numero de veces instanciado es: " + Elemento.numeroElementos());
    }
    
}
