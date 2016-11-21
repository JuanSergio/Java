package ejercicio02;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Futbolista extends SeleccionFutbol implements Serializable {


    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);

        this.dorsal = dorsal;
        this.demarcacion = demarcacion;

    }

    public void jugarPartido() {
        System.out.println("Jugando partido");
    }

    public void entrenar() {
        System.out.println("Entrenar");
    }

    public void insertar(ArrayList array) {

        Scanner tcl = new Scanner(System.in);
        System.out.println("Dame el id");
        id = tcl.nextInt();
        System.out.println("Dame el nombre");
        nombre = tcl.nextLine();
        System.out.println("Dame el apellidos");
        apellidos = tcl.nextLine();
        System.out.println("Dame la edad");
        edad = tcl.nextInt();
        System.out.println("Dame la demarcacion");
        demarcacion = tcl.nextLine();
        Futbolista fut = new Futbolista(id, nombre, apellidos, edad, dorsal, demarcacion);
        array.add(fut);
        System.out.println(array.isEmpty());
    }

    public void guardar(ArrayList<Futbolista> array) {
        try {
            
            FileOutputStream f = new FileOutputStream("futbolistas.dat");
            BufferedOutputStream bos = new BufferedOutputStream(f);
            ObjectOutputStream d = new ObjectOutputStream(bos);
            d.writeObject(array);
            System.out.println(array.isEmpty());
            d.close();
        } catch (IOException e) {
            System.out.println("Error al guardar");
            System.out.println(e.getMessage());
        }

    }

    public void listar() throws ClassNotFoundException {
        int i = 0;

        try {
            ArrayList<Futbolista> array2 = new ArrayList<Futbolista>();

            FileInputStream f = new FileInputStream("alumnos.dat");
            BufferedInputStream bis = new BufferedInputStream(f);

            ObjectInputStream d = new ObjectInputStream(bis);
            array2 = (ArrayList) d.readObject();

            while (true && i < array2.size()) {

                System.out.println(array2.get(i++));
                System.out.println("");

            }
        } catch (IOException e) {
            System.out.println("Fin de fichero.");
            //System.out.println(e.getMessage());
        }
    }
    public void listarFichero() throws ClassNotFoundException {
        
        boolean EOF=false;
        try {
            
            FileInputStream f = new FileInputStream("futbolistas.dat");
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

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    void listar(ArrayList<Futbolista> futbolistas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
