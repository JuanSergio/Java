/*
 1.a.- Realiza una clase, de nombre Examen, para guardar información sobre los 
exámenes de un centro educativo. La información que se guarda de un examen es: 
el nombre de la asignatura, el aula, la fecha y la hora. Para guardar la fecha 
y la hora hay que realizar dos clases, Fecha y Hora.
 */
package MiRevision;

 class MiExamen {
    private String miAsignatura, miAula;
    private Fecha miFecha;
    private Hora miHora;
    
    public MiExamen (String miAsignatura, String miAula, Fecha miFecha, Hora miHora){
        this.miAsignatura = miAsignatura;
        this.miAula = miAula;
        this.miFecha = miFecha;
        this.miHora = miHora;
    }
    public String toString(){
        return "Asignatura: " + miAsignatura + " Aula: " + miAula + " Fecha: " + miFecha + " Hora: " + miHora;
    }
}
/*La clase Fecha guarda día, mes y año. Todos los valores se reciben en el 
constructor por parámetro. Además, esta clase debe tener un método que devuelva 
cada uno de los atributos y un método toString() que devuelva la información de 
la fecha en forma de String.
*/
class Fecha{

    private String dia, mes, anyo;

    public Fecha(String dia, String mes, String anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    } 
     public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }
    public String toString(){
        return dia + "/" + mes + "/" + anyo;
    }
}
/*La clase Hora guarda hora y minuto. También recibe los valores para los 
atributos por parámetro en el constructor, tiene métodos que devuelven cada uno 
de los atributos y un método toString().
*/
class Hora{
        
    private int hora, minuto;
    
    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
    public String toString(){
        return hora + ":" + minuto;
    }
    
}

