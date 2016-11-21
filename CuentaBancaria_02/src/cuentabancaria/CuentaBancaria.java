
package cuentabancaria;

public class CuentaBancaria {
    String nombre;
    String cuenta;
    private double saldo=0;
    private double tipoDeInteres=0;
    
    CuentaBancaria(){
        
    }
    
    CuentaBancaria(String nom, String cuent, double sald, double interes){
        this.nombre=nom;
        this.cuenta=cuent;
        this.saldo=sald;
        this.tipoDeInteres=interes;   
    }
    void setNombre(String nom){
        if(nom==null || nom==""){
            System.out.println("No ha introducido ningún nombre para su cuenta");
        }else{
        nombre=nom;
        }
    }
    void setCuenta(String cuent){
        if(cuent==null || cuent==""){
            System.out.println("No ha introducido ninguna cuenta.");
        }else{
        cuenta=cuent;
       }
    }
    void setSaldo(double sald){
        if(sald<=0){
            System.out.println("La cantidad elegida no puede ingresarse");
        }else{
        this.saldo=sald;
        }
    }
    void setInteres(double interes){
        if(interes<0){
            System.out.println("El tipo de interés introducido es incorrecto.");
        }else{
            this.tipoDeInteres=interes;
        }
    }
    public String getNombre(){
        return nombre;
    }
    public String getCuenta(){
        return cuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public double getInteres(){
        return tipoDeInteres;
    }
    
    void reintegro(double cantidad){
        
        if(cantidad > saldo){
            System.out.println("Está intentando extraer un cantidad superior a su saldo.");
        }else{
            saldo-=cantidad;
            
        }
    }
    
}