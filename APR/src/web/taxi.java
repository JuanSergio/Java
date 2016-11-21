
package web;

public class taxi {
    // se declara de que tipo serán los objetos
        private String matricula;
        private String nombre;
        // ae crea el constructor
    taxi (){
        matricula = "VLC123456";
        nombre = "Taxis Chavez";    
    }
    // se crea el método
    public void setMatricula(String valorMatricula){
        matricula = valorMatricula;    
    }
    public void setNombre(String valorNombre){
        nombre = valorNombre;
    }
    public String getMatricula() {return matricula ;}
    
     public String getNombre() {return nombre ;}
     
     public static void main(String[] args) {
         System.out.println("La matricula es: " + return matricula );
    }
        
    }

    

