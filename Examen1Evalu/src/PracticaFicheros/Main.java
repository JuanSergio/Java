
package PracticaFicheros;

public class Main {
    public static void main(String[] args) {
        PracticaFichero practicasFichero;
        practicasFichero = new PracticaFichero("C:/Vendetta.txt");
        System.out.println(practicasFichero.CuentaLineas());
        System.out.println(practicasFichero.Contenido());
        System.out.println(practicasFichero.CuentaCaracterPorPalabra('v'));
    }
    
}
