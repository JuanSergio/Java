/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALEATORIOS;
/**
 *
 * @author Jon
 */
import java.io.Serializable;
public class persona implements Serializable{

    private String nombre,direccion,email;
    private long telefono;
    
public persona(String nombre,String direccion,String correo,long telf){
    this.nombre=nombre;
    this.direccion=direccion;
    this.email=correo;
    this.telefono=telf;   
}
public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono + '}';
    }

}
