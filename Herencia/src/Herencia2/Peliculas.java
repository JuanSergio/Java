/*
- Escribe una clase Película que herede de la clase Multimedia anterior. La 
clase Película tiene, además de los atributos heredados, un actor principal y 
una actriz principal. Se permite que uno de los dos sea nulo, pero no los dos. 
La clase debe tener dos métodos para obtener los dos nuevos atributos y debe 
sobrescribir el método toString() para que devuelva, además de la información 
heredada, la nueva información.

 */
package Herencia2;
//se introduce el extends y el nombre de la clase creada para importarla
public class Peliculas extends Multimedia{
    private String actorPrincipal;
    private String actrizPrincipal;
    
   public Peliculas(String titulo, String autor, int duracion, Formato formato, 
           String actor, String actriz) {
       super(titulo, autor, duracion, formato);
       //Tiene que haber solo un null, no los dos
       if (actor == null && actriz == null)
           throw new IllegalArgumentException("Tiene que haber al menos un protagonista");
   
   actorPrincipal = actor;
   actrizPrincipal = actriz;
   } 

    public String getActor(){
    return actorPrincipal;
}
    
    public String getActriz(){
        return actrizPrincipal;
    }
    
    public String toString(){
        String s = "Protagonizado por ";
        if (actrizPrincipal !=null){
            s+= actrizPrincipal;
            if (actorPrincipal != null){
              s += " y " + actorPrincipal;  
            }
            
            else{
                //assert funciona a modo de seguro dando un resultado null
            }
                assert actorPrincipal !=null;
                s += actorPrincipal;
            }
            return super.toString() +"\n" + s;
    }
}
     
    


