package ejer;


import java.util.Arrays;


public class proyecto1 {
    /*
    Escribe un método, de nombre mostrarArrayPantalla2, que reciba por
parámetro un array de enteros y muestre sus valores por pantalla
separados por comas.
    */
    
 public static void mostrarArrayPantalla2 (int[] array ){
    //con la función for se hace el recorrido por el array
     for (int i=0; i<array.length;i++){
         if (i==array.length-1){
             System.out.print(array[i]+".");
         }
         else {
         System.out.print(array[i]+", ");
         }
     }
        
    
 }
     

//llamar al array y definir longitud
/*public static void main (String [] args){
    int [] arrays=new int[]{0,1,2,3,4,5,6,7};
    System.out.println("************");
    System.out.println("Ejercicio1");
    System.out.println("************");
    mostrarArrayPantalla2(arrays);
  */  


   /* Escribe un método, de nombre obtenerArrayComoString, que reciba
un array de enteros por parámetro y devuelva una cadena de
caracteres con su contenido.
*/
 public static String obtenerArrayComoString(int[]array){
     String resultado="";
     //la formula siempre igual
     for  (int i=0;i<array.length; i++)
 }
 
 
 
 
 
 
 
 
 
}