/*
Crea la clase miAgenda con los atributos:
String nombre
String direccion
ArrayList<String> fono
String email
*/
package agenda;

import java.io.Serializable;
import java.util.*;
public class miAgenda implements Serializable{
    String nombre, direccion, email;
    ArrayList<String> fono;
    public miAgenda(String nombre, String direccion, String email, ArrayList<String> fono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.fono = fono;
    }
    miAgenda() {
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFono(ArrayList<String> fono) {
        this.fono = fono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<String> getFono() {
        return fono;
    }
}
