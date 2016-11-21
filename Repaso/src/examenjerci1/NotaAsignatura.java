
package examenjerci1;

public class NotaAsignatura {
    double nota;
    String nombreAsignatura;
    
    public NotaAsignatura(double nota, Asignatura asignatura){
        this.nota = nota;
        this.nombreAsignatura = asignatura.getNombre();
    }
    
    public double getNota(){
        return nota;
    }
    
    public String getAsignatura(){
        return nombreAsignatura;
    }
}
