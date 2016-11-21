/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.*;
import java.util.*;
/**
 *
 * @author Francisco
 */
public class miAgenda implements Serializable {
    
    private String nombre;
    private String direccion;
    private ArrayList<String> fono;
    private String email;

    miAgenda() {
    }

    miAgenda(String nom, String dir, ArrayList<String> tel, String correo) {
        nombre = nom;
        direccion = dir;
        fono = tel;
        email = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getFono() {
        return fono;
    }

    public void setFono(ArrayList<String> fono) {
        this.fono = fono;
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
}
