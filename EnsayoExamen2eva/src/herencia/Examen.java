/*
 Realiza una clase, de nombre Examen, para guardar información sobre 
 los exámenes de un centro educativo. La información que se guarda de un 
 examen es: el nombre de la asignatura, el aula, la fecha y la hora. Para guardar 
 la fecha y la hora hay que realizar dos clases, Fecha y Hora.
 La clase Fecha guarda día, mes y año. Todos los valores se reciben en 
 el constructor por parámetro. Además, esta clase debe tener un método que 
 devuelva cada uno de los atributos y un método toString() que devuelva la 
 información de la fecha en forma de String.
 La clase Hora guarda hora y minuto. También recibe los valores para los 
 atributos por parámetro en el constructor, tiene métodos que devuelven cada 
 uno de los atributos y un método toString().
 */
package herencia;

public class Examen {

    String nombre;
    String aula;

    public Examen(String nombre, String aula) {
        this.nombre = nombre;
        this.aula = aula;

    }
    public class Fecha{

        public Fecha(int dia, int mes, int año) {
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        }
        int dia, mes, año;
    }

}
