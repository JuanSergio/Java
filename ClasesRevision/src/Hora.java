

/**
 *
 * @author juansergio
 */
public class Hora {

    private int hora, minuto;
    
    public Hora(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
    }
    public String toString() {
        return "Hora{" + "hora=" + hora + ", minuto=" + minuto + '}';
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
}
