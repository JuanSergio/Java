
package ejercicio04;


public class Libro {
   private String titulo;
   private String autor;
   private int ejemplares;
   private int ejemplaresP;
   
   public Libro(String titulo, String autor, int ejemplares, int ejemplaresP){
       this.titulo = titulo;
       this.autor = autor;
       this.ejemplares = ejemplares;
       this.ejemplaresP = ejemplaresP;
   }
   public String getTitulo (){
    return titulo;
   }
   public String getAutor(){
       return autor;
   }
   public int getEjemplares(){
       return ejemplares;
   }
   public int getEjemplaresP(){
       return ejemplaresP; 
   }
   public void setTitulo(String titulo){
       this.titulo = titulo;
   }
   public void setAutor(String autor){
       this.autor = autor;
   }
   public void setEjemplares (int ejemplares){
       this.ejemplares = ejemplares;
   }
   public void setEjemplaresP (int ejemplaresP){
       this.ejemplaresP = ejemplaresP;
   } 
}
