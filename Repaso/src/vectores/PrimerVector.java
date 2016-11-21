/*Declara un array tipo int (entero) denominado numerodecoches 
que contenga 24 variables. Declara una variable tipo int (entero) que se llame r. 
Establece el valor de r en 2 y el valor de numerodecoches para un localizador de valor r en 23. 
Procede a mostrar en pantalla un mensaje que indique cuál es la hora r y el número de coches para la hora r. 
Finalmente, modifica únicamente la asignación de valor a r de modo que 
en vez de 2 sea 21 y ejecuta de nuevo el programa.*/
package vectores;

public class PrimerVector {
    public static void main(String[] args) {
        
        int numeroDeCoches [] = new int [24];
        int r = 2;
        
        numeroDeCoches [r] = 23;
        
        System.out.println("El numero de coches a la hora es: "+ r +" "
                            +numeroDeCoches[r]);
        
        
    }
}
