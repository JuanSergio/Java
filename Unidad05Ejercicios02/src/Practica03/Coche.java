/*
6. Desarrollar una clase llamada Coche que:
 Tenga un atributo prívate de tipo Motor, un atributo de tipo String (marca), 
otro de tipo String (modelo) y otro de tipo double con el precio acumulado con las averías.
 Tenga un constructor con dos parámetros de tipo String que inicialice la marca y el modelo.
 Tenga un getvalor para cada uno de los atributos.
 Un método acumularAveria que incrementará el importe gastado en averías.
 */
package Practica03;

public class Coche {
    private Motor motor1;
    private String marca;
    private String modelo;
    private double precioAverias;
    
    public Coche (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Motor getMotor1(){
        return motor1;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public double getPrecioAverias(){
        return precioAverias;
    }
    public void acumularAveria (double averia){
        System.out.println("Precio reparación: " + averia);
        this.precioAverias = this.precioAverias + averia;
    }
}
