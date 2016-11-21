/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionPacientes;

import java.io.*;
import java.util.*;

/**
 *
 * @author Francisco
 */
public class Ficha implements Serializable {

    private String nombre = null;
    private String apellidos = null;
    private int edad = 0;

    public Ficha(String param1, String param2, int param3) {
        nombre = param1;
        apellidos = param2;
        edad = param3;
    }

    public String mostrar() {
        return "Nombre: " + nombre + " Apellidos: " + apellidos + " Edad: " + edad;
    }

}
