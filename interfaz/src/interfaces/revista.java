
package interfaces;

public class revista extends publicacion{
    private int numero;
    
    public revista (String codigo, String titulo, int año, int numero){
        super(codigo,titulo,año);
        this.numero = numero;   
    }
    public String toString(){
        return super.toString()+"numero: "+ numero;
    }
}

