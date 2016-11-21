/*
 Modifica el código para que el resultado sea 1, 2, 1, 2…
 Obtén el mismo resultado programando sin excepciones
 */
package ejercicios;

public class Ejercicios02Parte2 {
    public static int devuelveEntero(int num){
            if (num % 2 == 0){
               return 1;
            }else{
            return 2;
            }
        } 
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println(devuelveEntero(i));
        }
    }
}

