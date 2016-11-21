
package interfaces;

public class libro extends publicacion implements prestable{
    private boolean prestado;
    public libro (String codigo, String titulo, int año){
        super(codigo, titulo, año);
        prestado = false;
    }
    
    public void prestar (){
        prestado = true;
    }
    public boolean prestado (){
        return prestado;
    }
    public void devolber(){
        prestado = false;
    }
    public String toString(){
        return super.toString()+(prestado ? "prestado " : "no prestado"); 
    }

    @Override
    public void devolver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
