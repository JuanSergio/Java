
/* miguelrosales */

package u08_gestioncuentabancaria;

public class Cuenta {
    String nombre, cuenta;
    double saldo, interes;
    
    //Constructor vacio
    public Cuenta(){}
    
    //Constructor con parámetros
    public Cuenta(String nombre, String cuenta, double saldo, double interes){
        this.nombre=nombre;
        this.cuenta=cuenta;
        this.saldo=saldo;
        this.interes=interes;
    }
    
    public void setNombre(String nombre) throws Exception{
        if(nombre.equals(""))
            throw new Exception("\nEscriba el el nombre");
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
        if(saldo<=0)
            throw new Exception("\nEl saldo no puede se 0");
        if(saldo<0)
            throw new Exception("\nSaldo negativo");
        else this.saldo=saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setTipoDeInteres(double interes) throws Exception{
        if(interes<0)
            throw new Exception("\nEl interés no puede ser menor de 0\nEscriba de nuevo el interés");
        else this.interes=interes;
    }
    
    public double getTipoDeInteres(){
        return interes;
    }
    
    public String toString(){
        return "\n-- -- Ficha de Cliente -- -- -- >>\nNombre: " +nombre+ "\nCuenta: " +cuenta+ "\nSaldo: " +saldo+ "\nInterés" +interes+ "\n";
    }

}
