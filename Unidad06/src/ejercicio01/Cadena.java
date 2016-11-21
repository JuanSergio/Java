/*
 Escribe un programa que solicite tres cadenas de caracteres, una llamada nombre, 
otra llamada primerApellido y segundoApellido. 
El programa debe crear una cadena con el nombre completo y después mostrar por pantalla:
o el nombre completo con todos los caracteres en minúsculas y luego en mayúsculas y su longitud
o los dos primeros caracteres de la cadena (solo en el caso de que la longitud de esta sea de dos 
o más caracteres)
o los dos últimos caracteres de la cadena (solo en el caso de que 
la longitud de esta sea de dos o más caracteres)
o el número de ocurrencias en la cadena del último carácter
o la cadena con todas las ocurrencias del primer carácter en mayúsculas
o la cadena con tres asteriscos por delante y por detrás
o la cadena invertida
*/
package ejercicio01;
import java.util.*;

public class Cadena {
    public static void main(String[] args) {
        Scanner tlc = new Scanner (System.in);
        //declaraciones
        String cadenaNombre;
        String cadenaPrimerApellido;
        String cadenaSegundoApellido;
        
        
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        
        //solicitar y imprimir nombre
        System.out.println("Introduce tu nombre: ");
        cadenaNombre = tlc.nextLine();
        System.out.println("Introduce tu primer apellido: ");
        cadenaPrimerApellido = tlc.nextLine();
        System.out.println("Introduce tu segundo apellido: ");
        cadenaSegundoApellido = tlc.nextLine();
        
        //imprimir todo a mayusculas y minusculas
        System.out.println(cadenaNombre + " " + cadenaPrimerApellido + " " + cadenaSegundoApellido);
        System.out.println(cadenaNombre.toLowerCase() + " " + cadenaPrimerApellido.toLowerCase() + " " + cadenaSegundoApellido.toLowerCase());
        System.out.println(cadenaNombre.toUpperCase() + " " + cadenaPrimerApellido.toUpperCase() + " " + cadenaSegundoApellido.toUpperCase());
        System.out.println("El tamaño del nombre es de: ");
        System.out.println(cadenaNombre.length());
        System.out.println("El tamaño del primer apellido es de: ");
        System.out.println(cadenaPrimerApellido.length());
        System.out.println("El tamaño del segundo apellido es de: ");
        System.out.println(cadenaSegundoApellido.length());
        
        //imprimir los dos primeros char
        String nombreSubCadena = cadenaNombre.substring(0,2);
        String primerApellidoSubCadena = cadenaPrimerApellido.substring(0,2);
        String segundoApellidoSubCadena = cadenaSegundoApellido.substring(0,2);
        if (cadenaNombre.length()>=2){
            System.out.println(nombreSubCadena +" son las dos primeras letras del nombre");
        }else{
                System.out.println("El nombre es menor de dos letras");
                }
         if (cadenaPrimerApellido.length()>=2){
            System.out.println(primerApellidoSubCadena +" son las dos primeras letras del primer apellido");
        }else{
                System.out.println("El primer apellido es menor de dos letras");
                }
          if (cadenaSegundoApellido.length()>=2){
            System.out.println(segundoApellidoSubCadena +" son las dos primeras letras del segundo apellido");
        }else{
                System.out.println("El segundo apellido es menor de dos letras");
                }
        
        //imprimir los últimos char 
        String nombreSubCadena2 = cadenaNombre.substring(cadenaNombre.length() -2);
        String primerApellidoSubCadena2 = cadenaPrimerApellido.substring(cadenaPrimerApellido.length()-2);
        String segundoApellidoSubCadena2 = cadenaSegundoApellido.substring(cadenaSegundoApellido.length()-2);
          if (cadenaNombre.length()>=2){
            System.out.println(nombreSubCadena2 +" son las dos últimas letras del nombre");
        }else{
                System.out.println("El nombre es menor de dos letras");
                }
         if (cadenaPrimerApellido.length()>=2){
            System.out.println(primerApellidoSubCadena2 +" son las dos últimas letras del primer apellido");
        }else{
                System.out.println("El primer apellido es menor de dos letras");
                }
          if (cadenaSegundoApellido.length()>=2){
            System.out.println(segundoApellidoSubCadena2 +" son las dos últimas letras del segundo apellido");
        }else{
                System.out.println("El segundo apellido es menor de dos letras");
                }
        //número de ocurrencias
        String textoBuscado1 = cadenaNombre;
        String textoBuscado2 = cadenaPrimerApellido;
        String textoBuscado3 = cadenaSegundoApellido;
        while(cadenaNombre.indexOf(textoBuscado1) > -1){
            cadenaNombre = cadenaNombre.substring(cadenaNombre.indexOf(textoBuscado1)+textoBuscado1.length(),cadenaNombre.length());
            contador1++;
        }
        System.out.println("Las veces que se repite el nombre son: " + contador1);
        
        while(cadenaPrimerApellido.indexOf(textoBuscado2) > -1){
            cadenaPrimerApellido = cadenaPrimerApellido.substring(cadenaPrimerApellido.indexOf(textoBuscado2)+textoBuscado2.length(),cadenaPrimerApellido.length());
            contador2++;
        }
        System.out.println("Las veces que se repite el primer apellido son: " + contador2);
        
        while(cadenaSegundoApellido.indexOf(textoBuscado3) > -1){
            cadenaSegundoApellido = cadenaSegundoApellido.substring(cadenaSegundoApellido.indexOf(textoBuscado3)+textoBuscado3.length(),cadenaSegundoApellido.length());
            contador3++;
        }
        System.out.println("Las veces que se repite el segundo apellido son: " + contador3);
        
        //contador de letras
        char primer, primerMayus;
        String completo = cadenaNombre + " " + cadenaPrimerApellido + " " + cadenaSegundoApellido;
        char ultimo = cadenaNombre.charAt(cadenaNombre.length() - 1);
        int veces = 0;
        int i = 0;
        while (i != -1) {
            i = completo.indexOf(ultimo, i);
            if (i != -1) {
                veces++;
                i++;
        }
    
      }
        System.out.println("El último caracter es " + ultimo + " y se repite " + veces + " veces");
        primer = completo.charAt(0);
        primerMayus = Character.toUpperCase(primer);
        System.out.println("Reemplazo el primer caracter " + primer + " por " + primerMayus + " : " + completo.replace(primer, primerMayus)); 
        System.out.println("Con tres asteriscos por delante y por detrás  : " + "***" + completo + "***");
        System.out.print("El nombre invertido : ");
        for (i = completo.length() - 1; i >= 0; i--) {
            System.out.print(completo.charAt(i));
        }
    }
}
