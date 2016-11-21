/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */

package OBJETOS;  

import java.io.Serializable;

public class Ficha implements Serializable{
private String nombre,apellidos;
    private int edad;

public Ficha(String nombre,String apellidos,int edad){
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.edad=edad;
}
public String toString(){
    return "Nombre" +this.nombre +"Apellidos"+this.apellidos+"Edad"+this.edad;
}
}
