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
public class agenda{

    public static void main(String args[]) {
        boolean salida = false;
        String  cadena = "agendaObject.dat";

        Scanner flujoEntrada = new Scanner(System.in);

       //Objeto File
        File f = new File(cadena);

        //Existe o no
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                System.out.println("No se pudo crear el fichero");
                salida = true;
            }
        } else 
        {
            System.out.print("El fichero existe. Debe borrarse antes de ejecutar este programa\n");
            salida = true;
        }
        if (salida == false) {
            try {
                //crear el flujo
                FileOutputStream ficha = new FileOutputStream(f);
                BufferedOutputStream b = new BufferedOutputStream(ficha);
                ObjectOutputStream d = new ObjectOutputStream(b);
                
                String n;
                String di;
                String fo;
                String e;

                //ciclo de ingreso de registros
                do {
                    System.out.println("\nIngresar registro : ");
                    System.out.print("Nombre : ");
                    n = flujoEntrada.nextLine();
                    System.out.print("Dirección : ");
                    di = flujoEntrada.nextLine();

                    //Ingreso de lista de teléfonos
                    ArrayList lista = new ArrayList();
                    do {
                        System.out.print("Teléfono : ");
                        fo = flujoEntrada.nextLine();

                        //Agrega a la lista de telefonos el nuevo registro en caso de datos válidos
                        lista.add(fo);
                        System.out.print("Otro Fono (si/no) : ");
                        cadena = flujoEntrada.nextLine();
                    } while (cadena.equals("si") || cadena.equals("SI"));
                    System.out.print("Email : ");
                    e = flujoEntrada.nextLine();

                    //Almacena el registro de telefonos en el fichero agenda
                    d.writeObject(new miAgenda(n, di, lista, e));

                    System.out.print("\n\nOtro registro (si/no) : ");
                    cadena = flujoEntrada.nextLine();
                } while (cadena.equals("si") || cadena.equals("SI"));
                d.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
