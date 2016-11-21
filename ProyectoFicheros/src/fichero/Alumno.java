/*
 Crear una clase Alumno con los siguientes datos:
 - carnet
 - nombre
 - apellidos
 - nota 1
 - nota 2
 - nota 3
 - Método: ponerDatos(). Que lee los datos del teclado y los pone en un objeto que guardará en un
 ArrayList.
 - Método: llenarArchivo(). Que guarda los objetos que hay en el ArrayList en un fichero
 alumnos.dat
 - Método: pasarALista(). Que pasa los datos del archivo alumnos.dat a un ArrayList.
 - Método: pasarFichero5(). Que guarda el carnet y la nota media de aquellos alumnos que su nota
 media es mayor que 5 en un fichero alumnos5.dat.
 - Método: visualizarFichero5(). Visualiza los datos del fichero alumnos5.dat
 */
package fichero;

import java.io.*;
import java.util.*;

public class Alumno implements Serializable {

    private static ArrayList<Alumno> arrayAl = new ArrayList();
    String carnet;
    String nombre;
    String apellido;
    double nota1, nota2, nota3;

    public Alumno(String carnet, String nombre, String apellido, double nota1, double nota2, double nota3) {

        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Alumno() {
    }

    //Para evitar errores se crea el toString
    @Override
    public String toString() {
        return "Alumno{" + "carnet=" + carnet + ", nombre=" + nombre + ", apellido=" + apellido + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public static void ponerDatos(ArrayList<Alumno> arrayAl) {
        Scanner tlc = new Scanner(System.in);

        System.out.println("Introduce carnet: ");
        String carnet = tlc.nextLine();
        System.out.println("Introduce nombre: ");
        String nombre = tlc.nextLine();
        System.out.println("Introduce apellido: ");
        String apellido = tlc.nextLine();
        System.out.println("Introduce nota1: ");
        double nota1 = tlc.nextDouble();
        System.out.println("Introduce nota2: ");
        double nota2 = tlc.nextDouble();
        System.out.println("Introduce nota3: ");
        double nota3 = tlc.nextDouble();
        tlc.nextLine();
        Alumno alumno1 = new Alumno(carnet, nombre, apellido, nota1, nota2, nota3);
        arrayAl.add(alumno1);
        System.out.println(arrayAl.isEmpty());

    }

    //Se crea el fichero apartir de objeto
    public static void llenarArchivo(ArrayList<Alumno> array) {
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream("alumnos.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);
            oos.writeObject(array);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error en el fichero");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error");

        }
    }

//Crear un arraylist con los datos de llenar datos
    public static void pasarALista(ArrayList <Alumno> array) throws ClassNotFoundException {
        
        try {
            FileInputStream file = new FileInputStream("alumnos.dat");
            ObjectInputStream ois = new ObjectInputStream(file);
            while (ois.readObject() != null) {
                //lista.add(ois.readObject());
                arrayAl.add((Alumno) ois.readObject());

            }
        } catch (IOException e) {
            System.out.println("Error en la creacion del array lista");
        }
    }

    //Guardar los datos de los alumnos con nota superior o igual a 5
    public static void pasarFichero5(ArrayList<Alumno> array) throws FileNotFoundException, IOException {
        int i = 0;
        try {
            FileOutputStream f = new FileOutputStream("alumno5.dat");
            DataOutputStream d = new DataOutputStream(f);
            double nota1, nota2, nota3;

            while (i < array.size()) {

                nota1 = array.get(i).getNota1();
                nota2 = array.get(i).getNota2();
                nota3 = array.get(i).getNota3();

                double media = (nota1 + nota2 + nota3) / 3;
                if (media >= 5) {

                    d.writeUTF(array.get(i).getCarnet());
                    d.writeDouble(media);

                }
                i++;
            }

            d.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void visualizarFichero5() throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("alumnos5.dat");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());

        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void Buscar(String nombre) {
        for (int i = 0; i < arrayAl.size(); i++) {
            if (arrayAl.get(i).getNombre().equals(nombre)) {
                System.out.println(arrayAl.get(i) + "\n");
            }
        }
    }

    public static void Borrar(String carnet) {
        for (int i = 0; i < arrayAl.size(); i++) {
            if (arrayAl.get(i).getCarnet().equals(carnet)) {
                arrayAl.remove(i);
            }
        }
    }

    public static void modificar(ArrayList<Alumno> array) {
        Scanner tcl = new Scanner(System.in);
        Alumno modificar = new Alumno();

        System.out.println("Introduce nuevo carnet");
        String nuevocarnet = tcl.nextLine();
        modificar.setCarnet(nuevocarnet);

        System.out.println("Introduce nuevo nombre");
        String nuevonombre = tcl.nextLine();
        modificar.setNombre(nuevonombre);

        System.out.println("Introduce nuevos apellidos");
        String nuevoapellidos = tcl.nextLine();
        modificar.setApellido(nuevoapellidos);

        System.out.println("Introduce 1º nueva nota");
        Double nuevanota1 = tcl.nextDouble();
        modificar.setNota1(nuevanota1);

        System.out.println("Introduce 2º nueva nota");
        Double nuevanota2 = tcl.nextDouble();
        modificar.setNota1(nuevanota2);

        System.out.println("Introduce 3º nueva nota");
        Double nuevanota3 = tcl.nextDouble();
        modificar.setNota1(nuevanota3);
    }

}

class CompararNota implements Comparator {

    public int compare(Object o1, Object o2) {
        int alumnoNota1 = (int) ((Alumno) o1).getNota1();//casting para pasar de double a int
        int alumnoNota2 = (int) ((Alumno) o2).getNota2();
        if (alumnoNota1 > alumnoNota2) {
            return -1;
        } else if (alumnoNota1 < alumnoNota2) {
            return 1;
        } else {
            return 0;
        }

    }

}

class ComparaApellido implements Comparator {

    public int compare(Object o1, Object o2) {
        String apellidoAlum1 = ((Alumno) o1).getApellido();
        String apellidoAlum2 = ((Alumno) o2).getApellido();
        return apellidoAlum1.compareTo(apellidoAlum2);
    }
}
