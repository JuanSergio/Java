/*
 1.
Escribe un programa que solicite tres cadenas de caracteres, una llamada
nombre, otra llamadaprimerApellido y segundoApellido. El programa debe
crear una cadena con el nombre completo y después mostrar
por pantalla:o el nombre completocon todos los caracteres en minúscul
as y luego en
mayúsculas y su longitud
o
los dos primeros caracteres de la cadena (solo en el caso de que la
l
ongitud de esta sea de dos o más caracteres)
o
los dos últimos caracteres de la cadena (solo en el caso de que la
longitud de esta sea de dos o más caracteres)
o
el número de ocurrencias en la cadena del último carácter
o
la cadena con todas las ocurrencias del
primer carácter en mayúsculas
o
la cadena con tres asteriscos por delante y por detrás
o
la cadena invertida
 */
package strings;

/**
 *
 * @author mati
 */
public class Strings1 {
    public static void Imprimir(String[]nom){
        String cadena= "Esto es una prueba";
        int longitud = cadena.length();
        char letra= cadena.charAt(5);
        System.out.println("La cadena tiene"+longitud+"letras");
        
        
        
    }
    
}
