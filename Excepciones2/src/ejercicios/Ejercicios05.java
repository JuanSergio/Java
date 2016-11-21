/*
5. Escribe un método, de nombre mostrarCadenasArray, que reciba por parámetro 
un array con cadenas de caracteres. El método mostrará
por pantalla el primer carácter de cada una de las cadenas contenidas en el array.
 Se debe evitar que se produzca una excepción NullPointerException si alguna 
de las posiciones del array contiene una referencia no inicializada (valor null)
 */
package ejercicios;

public class Ejercicios05 {
    public static void mostrarCadenasArray (String [] cadena){
        for(int i = 0; i<cadena.length; i++){
            try{
            System.out.println(cadena[i].charAt(0));
            }catch(NullPointerException e){
                System.out.println("El valor null produce un error");
            }
        }
    }
    public static void main(String[] args) {
        String cadena[]= new String []{null,"Hola","Mundo","Adiós"};
        mostrarCadenasArray(cadena);
    }
}
