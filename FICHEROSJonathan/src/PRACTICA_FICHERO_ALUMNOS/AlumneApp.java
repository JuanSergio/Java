/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRACTICA_FICHERO_ALUMNOS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mati
 */
public class AlumneApp {

    public static void main(String[] args) throws ClassNotFoundException {

        boolean repetir = false;
        ArrayList<Alumne> array = new ArrayList();

        do {
            System.out.println("= = = = = = Alumnes = = = = = =");
            System.out.println("1. Introducir datos");
            System.out.println("2. Buscar por nombre");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Guardar aprobados");
            System.out.println("6. Listar aprobados");
            System.out.println("7. Guardar en alumnes.dat");
            System.out.println("0. Salir");
            System.out.println("= = = = = = = = = = = = = = = =");
            Scanner tcl = new Scanner(System.in);
            int opcion = tcl.nextInt();
            Alumne alu = new Alumne();
            switch (opcion) {

                case 1:

                    alu.insertar(array);
                    break;
                case 2:
                    alu.buscar(array);
                    break;
                case 3:
                    alu.modificar(array);
                    break;
                case 4:
                    alu.borrar(array);
                    break;
                case 5:
                    alu.passarFitxer5(array);
                    break;
                case 6:
                    alu.veureFitxer5();
                    break;
                case 7:
                    alu.guardar(array);
                    break;
                case 0:
                    repetir = true;
                    System.out.println("");
                    break;
            }
        } while (repetir != true);
    }

}
