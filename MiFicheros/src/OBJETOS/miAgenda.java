/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJETOS;
/**
 *
 * @author mati
 */
//crear una clase llamada miAgenda con los siguientes atributos
//String nombre,String direccion,ArrayList<String> fono,String email
import java.io.Serializable;
import java.util.ArrayList;
public class miAgenda implements Serializable{

    private String nombre,direccion,email;
    private ArrayList<String> fono;
    

public miAgenda(String nombre,String dir,String correo, ArrayList<String>telf){
    this.nombre=nombre;
    this.direccion=dir;
    this.email=correo;
    this.fono=telf;
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
    
    public String toString() {
        return "miAgenda{" + "nombre=" + nombre + ", direccion=" + direccion + ", email=" + email + ", fono=" + fono + '}';
    }    
}
