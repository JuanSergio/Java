/*
    Una cuenta de cliente podría definirse a partir de la clase Ccuenta
 */


public class CCuenta {
    String nombre;
    String cuenta;
    double saldo;
    double tipoDeInteres;
    
    public CCuenta(){
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = 0;
        this.tipoDeInteres = 4.5;
    }
    public CCuenta(String nombre, String cuenta, double saldo, double tipoDeInteres){
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
    }
     public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuenta(String cuenta) {
        if (cuenta == null){
            System.out.println("No existe la cuenta");
        }else{
        this.cuenta = cuenta;
        }
    }

    public void setSaldo(double saldo) throws Exception{
        if (saldo < 0)
            throw new Exception("Saldo Negativo");  
        else
        this.saldo = saldo;
        }
    

    public void setTipoDeInteres(double tipoDeInteres) {
        if(tipoDeInteres >= 0){   
        this.tipoDeInteres = tipoDeInteres; 
        }else{
            System.out.println("tienes un tipo de interés no válido");
        }
    }
    public void reintegro(double cantidad){
        if (this.saldo >= cantidad) {
            this.saldo=saldo - cantidad;
        }else{
            System.out.println("El reintegro es superior al saldo");
        }
    }
}
