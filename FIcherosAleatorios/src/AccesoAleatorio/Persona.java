
package AccesoAleatorio;

import java.io.*;
import java.util.logging.Logger;

public class Persona implements Serializable{

    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    
    public Persona(String nom, String dire, String telf, String email){
    
        this.nombre = nom;
        this.direccion = dire;
        this.telefono = telf;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString() {
    
        return "Nombre: "+nombre+"/n"+"Dirección: "+direccion+"/n"+"Teléfono: "+telefono+"/n"+"Email: "+email+"/n";
    
    } 
}

