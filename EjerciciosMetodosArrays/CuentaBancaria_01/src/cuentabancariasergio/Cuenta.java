
package cuentabancariasergio;

public class Cuenta 
{
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;
    
    //CONSTRUCTOR VACIO
    
    public Cuenta(){}
    
    //CONSTRUCTOR CON PARAMETROS
    
    public Cuenta (String nombre, String cuenta, double saldo, double tipoDeInteres) throws Exception{
//        if(nombre.equals("")) throw new Exception("Nombre vacio");
//        else this.nombre=nombre;
//        if(cuenta.equals("")) throw new Exception("Cuenta vacia");
//        else this.cuenta=cuenta;  
//        if(saldo<0) throw new Exception("Saldo Negativo");
//        else this.saldo=saldo;
//        if(tipoDeInteres<0) throw new Exception("Tipo de Interes negativo");
//        else this.tipoDeInteres=tipoDeInteres;
    }
    
    //GETS Y SETS
    
    public void setNombre(String nombre) throws Exception{
        if(nombre.equals("")) 
            throw new Exception("Nombre vacio");
        else this.nombre=nombre;              
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setCuenta(String cuenta) throws Exception{
        if(cuenta.equals(""))
            throw new Exception("Cuenta vacia");
        else this.cuenta=cuenta;              
    }
    
    public String getCuenta(){
        return cuenta;
    }
    
    public void setSaldo(double saldo) throws Exception{
        if(saldo<0) 
            throw new Exception("Saldo Negativo");
        else this.saldo=saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setTipoDeInteres(double tipoDeInteres) throws Exception{
        if(tipoDeInteres<0)
            throw new Exception("Tipo de Interes negativo");
        else this.tipoDeInteres=tipoDeInteres;
    }
    
    public double getTipoDeInteres(){
        return tipoDeInteres;
    }
    
    //INGRESO
    
    public void ingreso(double cantidad) throws Exception{
        if(cantidad<0) throw new Exception("Ingreso negativo");
        else saldo=saldo+cantidad; 
    }
    
    //REINTEGRO
    
    public void reintegro(double cantidad) throws Exception{
        if(cantidad>saldo) throw new Exception("Cantidad mayor que saldo");
        else saldo=saldo-cantidad;
    }
    
    public String toString(){
        return "\n********************\nNombre: "+nombre+"\nCuenta: "+cuenta+"\nSaldo: "+saldo+"\nTipo de Interes: "+tipoDeInteres+"\n********************\n";
    }
            
}
