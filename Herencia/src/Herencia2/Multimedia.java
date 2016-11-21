/*
 Esta clase contiene título, autor, 
formato y duración como atributos. El formato puede ser uno de los siguientes: 
wav, mp3, midi, avi, mov, mpg, cdAudio y dvd. El valor de todos los atributos se 
pasa por parámetro en el momento de crear el objeto. Esta clase tiene, 
además, un método para devolver cada uno de los atributos y un método 
toString() que devuelve la información del objeto. Por último un método equals() 
que recibe un objeto de tipo Multimedia y devuelve true en caso de que el título 
y el autor sean iguales a los del objeto que llama al método y false en caso 
contrario.

 */
package Herencia2;



public class Multimedia {
    //se crea una nuevo formato 
    enum Formato{wav, mp3, midi, avi, mov, mpg, cdAudio, dvd}
    private String titulo, autor;
    private int duracion;
    private Formato formato;
    
    public Multimedia (String titulo, String autor, int duracion, Formato formato){
        this.autor = autor;
        this.titulo = titulo;
        this.duracion = duracion;
        this.formato = formato;
    }
    
    public String getAutor(){
        return autor;
        }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getDuracion(){
        return duracion;
    }
    
    public Formato getFormato(){
        return formato;
    }
    
    public String toString(){
        return "Titulo: " +titulo + "De: " + autor + "/n" +
                "Formato: " + formato + "Duracion: " + duracion;  
    }
    
    public boolean equals(Multimedia m){
        return titulo.equals(m.getTitulo()) && autor.equals(m.getAutor());
    }
}
