/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRACTICA_FICHERO_ALUMNOS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author mati
 */
public class Alumne implements Serializable {

    private String carnet, nombre, apellido;
    private double nota1, nota2, nota3;

    public Alumne() {   

    }
    
    public Alumne(String carnet, String nombre, String apellido, double nota1, double nota2, double nota3) {   

        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public String toString() {
        return "Alumne{" + "carnet=" + carnet + ", nombre=" + nombre + ", apellido=" + apellido + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    
    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setApellido(String cognom) {
        this.apellido = cognom;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void insertar(ArrayList array) {
        
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Dame el carnet del alumno");
        String carnet = tcl.nextLine();
        System.out.println("Dame el nombre");
        String nombre = tcl.nextLine();
        System.out.println("Dame los apellidos");
        String apellido = tcl.nextLine();
        System.out.println("Dame la primera nota ");
        double nota1 = tcl.nextDouble();
        System.out.println("Dame la segona nota ");
        double nota2 = tcl.nextDouble();
        System.out.println("Dame la tercera nota ");
        double nota3 = tcl.nextDouble();
        tcl.nextLine();
        Alumne w = new Alumne(carnet,nombre,apellido,nota1,nota2,nota3);
        array.add(w);
        System.out.println(array.isEmpty());
    }

    public void guardar(ArrayList<Alumne> array) {
        try {
            //output para guardar
            FileOutputStream f = new FileOutputStream("alumnos.dat");
            BufferedOutputStream bos = new BufferedOutputStream(f);
            ObjectOutputStream d = new ObjectOutputStream(bos);
            d.writeObject(array);//li diem que guarde el array
            System.out.println(array.isEmpty());
            d.close();
        } catch (IOException e) {
            System.out.println("Error al guardar contactos");
            System.out.println(e.getMessage());
        }
       
    }

    public void llistar() throws ClassNotFoundException {
            int i=0;
    //Input para leer datos
        try {
            ArrayList<Alumne> array2 = new ArrayList<Alumne>();
            //Array especific per aquest metode
            FileInputStream f = new FileInputStream("alumnos.dat");
            BufferedInputStream bis = new BufferedInputStream(f);

            ObjectInputStream d = new ObjectInputStream(bis);
            array2 = (ArrayList)d.readObject(); 
            
            while (true && i<array2.size()) {      
                //System.out.println(d.readObject());
               
                
                System.out.println(array2.get(i++));
                System.out.println("");

            }
        } catch (IOException e) {
            System.out.println("Fin de fichero.");
            //System.out.println(e.getMessage());
        }
    }

    public void passarFitxer5(ArrayList<Alumne> array) {
        int i = 0;
        
        
                   try{
                        FileOutputStream f = new FileOutputStream("alumno5.dat");
                        DataOutputStream d = new DataOutputStream(f);
                        
                        double nota1, nota2, nota3;

                        while (i<array.size()){
               
                             nota1 = array.get(i).getNota1();
                             nota2 = array.get(i).getNota2();
                             nota3 = array.get(i).getNota3();

                        double media = (nota1 + nota2 + nota3) / 3;
                        if (media >= 5){
                    
                        d.writeUTF(array.get(i).getCarnet());
                        d.writeDouble(media);
                      
                        }
                        i++;
                       }
                       
                        d.close();
                        
                       }catch (IOException e){
                       System.out.println("Error");
                    }
}             

    public void veureFitxer5() throws ClassNotFoundException {
        
        boolean EOF=false;
        try {
            //Array especific per aquest metode
            FileInputStream f = new FileInputStream("alumno5.dat");
            DataInputStream d = new DataInputStream(f);
            
            while(!EOF){
            System.out.println(d.readUTF());
            System.out.println(d.readDouble());
            
            }

            d.close();
            
           } catch (EOFException e) {
            System.out.println("Fin");
            EOF=true;
 
        } catch (IOException e) {
            System.out.println("Fin");
        }
    }
    
    public void buscar (ArrayList<Alumne> array){
        Scanner tcl = new Scanner (System.in);
        System.out.println("Introduce el nombre de busqueda");
        String busqueda=tcl.nextLine();
        for (int i=0; i<array.size(); i++){
            busqueda.equals(array.get(i).getNombre());
            
            System.out.println("-----INFORMACION-----");
            System.out.println("Carnet: "+array.get(i).getCarnet());
            System.out.println("Nombre: "+array.get(i).getNombre());
            System.out.println("Apellidos "+array.get(i).getApellido());
            System.out.println("Nota1: "+array.get(i).getNota1());
            System.out.println("Nota2: "+array.get(i).getNota2());
            System.out.println("Nota3: "+array.get(i).getNota3());
        } 
    }
    public void modificar(ArrayList<Alumne>array){
        Scanner tcl = new Scanner (System.in);
        Alumne modificar= new Alumne();
        
        System.out.println("Introduce nuevo carnet");
        String nuevocarnet=tcl.nextLine();
        modificar.setCarnet(nuevocarnet);
        
        System.out.println("Introduce nuevo nombre");
        String nuevonombre=tcl.nextLine();
        modificar.setNombre(nuevonombre);
       
        System.out.println("Introduce nuevos apellidos");
        String nuevoapellidos=tcl.nextLine();
        modificar.setApellido(nuevoapellidos);
        
        System.out.println("Introduce 1º nueva nota");
        Double nuevanota1=tcl.nextDouble();
        modificar.setNota1(nuevanota1);
        
        System.out.println("Introduce 2º nueva nota");
        Double nuevanota2=tcl.nextDouble();
        modificar.setNota1(nuevanota2);
       
        System.out.println("Introduce 3º nueva nota");
        Double nuevanota3=tcl.nextDouble();
        modificar.setNota1(nuevanota3); 
    }
    
  public void borrar(ArrayList<Alumne>array){
      Scanner tcl=new Scanner (System.in);
      System.out.println("Introduce el nombre a borrar");
      String borrarnombre=tcl.nextLine();
      
      for (int i=0; i<array.size();i++){
          if (borrarnombre==array.get(i).getNombre())
              array.remove(i);  
      }
  }  
  
}


