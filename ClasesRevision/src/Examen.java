/*
 1.a.- Realiza una clase, de nombre Examen, para guardar información sobre
los exámenes de un centro educativo. La información que se guarda de un
examen es: el nombre de la asignatura, el aula, la fecha y la hora. Para guardar
la fecha y la hora hay que realizar dos clases, Fecha y Hora.

 */

/**
 *
 * @author juansergio
 */
public class Examen {

    private String asignatura, aula;
    private Fecha fecha;
    private Hora hora;
    
    public Examen (String asignatura, String aula, Fecha fecha, Hora hora){
        this.asignatura = asignatura;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getAula() {
        return aula;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Hora getHora() {
        return hora;
    }
}
