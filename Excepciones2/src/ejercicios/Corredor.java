/*
7. Escribe una clase, de nombre Corredor, teniendo en cuenta las siguientes especificaciones:
 La clase tendrá un atributo entero de nombre energía
 La clase tendrá un método constructor que reciba por parámetro una cantidad 
de energía que asignará al atributo
 La clase tendrá un método, de nombre recargarEnergia, que recibirá por 
parámetro una cantidad de energía que será sumada al atributo energía
 La clase tendrá un método, de nombre correr, que mostrará por pantalla un 
mensaje y decrementará la energía en 10 unidades. Antes de proceder al 
decremento, el método comprobará que la energía del corredor es igual o superior 
a 10 unidades. Si no es así, el método lanzará una excepción de tipo AgotadoException
Para crear la excepción AgotadoException (en el fichero Corredor.java):
 */
package ejercicios;

class AgotadoException extends Exception{
    public AgotadoException (String cadena){
        super (cadena);
    }
}
public class Corredor {
    private int energia = 0;
    
    public Corredor (int cantidad ){
        energia = cantidad;
        
    }
    public void recargarEnergia (int cantidad){
        energia = energia + cantidad;
    }
    public void correr (){
        try {
            if (energia >= 10) {
                System.out.println("Esta corriendo");
                energia = energia-10;
            }else{
                throw new AgotadoException("Agotado energia");
            }
        } catch (AgotadoException e) {
            System.out.println(e.getMessage());
        }
    }

}
