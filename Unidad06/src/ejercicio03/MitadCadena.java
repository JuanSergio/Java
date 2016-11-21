/*
 3. Escribe un método que, dada una cadena de caracteres, devuelve la mitad 
inicial de la cadena. Escribe un programa que pruebe el método con las cadenas 
“Hola que tal” y “Adiós”.
 */
package ejercicio03;

public class MitadCadena {
    public static void main(String[] args) {
        String hola = new String ("Hola que tal");
        String adios = new String ("Adiós");
        String mitadHola = (hola.substring(0, hola.length() / 2));
        String mitadAdios = (adios.substring(0, adios.length() / 2));
        
        System.out.println(mitadHola + " " + mitadAdios);

    }
    
}

