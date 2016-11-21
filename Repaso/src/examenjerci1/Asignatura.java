
package examenjerci1;

public class Asignatura {
  private String nombre;
  private int id;
  
  Asignatura (String nombre,int id){
      this.nombre = nombre;
      this.id = id;
      
  }
  //usar get cuando se usa private
  public String getNombre(){
    return nombre;
  }
  
  public int getId(){
      return id;
  }
  
}
