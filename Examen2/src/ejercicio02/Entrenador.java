package ejercicio02;

import java.io.Serializable;

public class Entrenador extends SeleccionFutbol implements Serializable {

    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("Se dirige el partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Se dirige el entrenamiento");
    }
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

}
