
package Ficheros;
import java.util.*;
import java.io.*;

//declaramos las variables
public class Alumno implements Serializable {
   private String nombre;
   private String apellido;
   private String dni;
   private double nota1;
   private double nota2;
   private double nota3;
   
   //se crean los objetos
   public void setNombre(String nombre){
       this.nombre = nombre;
   }   
    public void setApellido(String apellido){
       this.apellido = apellido;
   }     
     public void setDni(String dni){
       this.dni = dni;
   }     
      public void setNota1(double nota1){
       this.nota1 = nota1;
   }     
      public void setNota2(double nota2){
       this.nota2 = nota2;
   }    
      public void setNota3(double nota3){
       this.nota3 = nota3;
   }    
    
      //metodo de poner los datos introducidos por teclado
    public static void ponerDatos(Alumno a){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dame un nombre: ");
        a.setNombre(teclado.nextLine());
        
         System.out.println("Dame un apellido: ");
        a.setApellido(teclado.nextLine());
        
         System.out.println("Dame un dni: ");
        a.setDni(teclado.nextLine());
        
         System.out.println("Dame una nota1: ");
        a.setNota1(teclado.nextDouble());
        
         System.out.println("Dame un nota2: ");
        a.setNota2(teclado.nextDouble());
        
         System.out.println("Dame un nota3: ");
        a.setNota3(teclado.nextDouble());
        
    }
    //Se crea el fichero con los datos introudcidos en el paso anterior
    public static void llenarArchivo(String archivo1) throws IOException{
        String nombre, apellido, dni;
        double nota1, nota2, nota3;
      
        ObjectOutputStream f = new ObjectOutputStream 
                                (new FileOutputStream (archivo1));
        
        //Se crea un indice que recorra el array con limite 5
        for (int i = 0; i < 5; i++);
        {
            //??
           Alumno a = new Alumno();
           ponerDatos(a);
           
           f.writeObject(a);
        }
        f.close();
    }
    //pasar los datos a un arraylist
    public static ArrayList pasarLista (String Alumno)throws IOException, 
            ClassNotFoundException
    {
        //??
        ObjectInputStream f = new ObjectInputStream (new FileInputStream (Alumno));
        ArrayList<Alumno> lista = new ArrayList();
        Alumno aux = (Alumno)f.readObject();
        {
            System.out.println(aux);
            lista.add(aux);
            aux=(Alumno)f.readObject();
        }
        return lista;
    }
    public static void pasarFichero14(Alumno)) {
        
    }
    
}


