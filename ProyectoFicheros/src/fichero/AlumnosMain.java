/*
 1.- Introducir datos.
 2.- Buscar (por nombre, visualizar todos los objetos que tengan el mismo nombre).
 3.- Modificar.
 4.- Borrar (Buscar por carnet y borrar).
 5.- Guardar aprobados (en fichero alumnos5.dat)
 6.- Visualizar aprobados.
 7.- Guardar en alumnos.dat.
 8.- Salir.
 */
package fichero;

import java.io.IOException;
import java.util.*;

public class AlumnosMain {

    public static void main(String[] args) throws IOException {
        ArrayList<Alumno> alu = new ArrayList();
        Scanner tlc = new Scanner(System.in);
        String carnet, nombre, apellido;
        double nota1, nota2, nota3;
        boolean opcion = false;

       /* do {
            System.out.println("***************************");
            System.out.println("Elige un numero: ");
            System.out.println("1- Introducir datos: ");
            System.out.println("2- Buscar por nombre: ");
            System.out.println("3- Modificar: ");
            System.out.println("4- Borrar por carnet: ");
            System.out.println("5- Guardar aprobados: ");
            System.out.println("6- Visualizar aprobados: ");
            System.out.println("7- Guardar en alumnos.dat: ");
            System.out.println("8- Salir ");
            System.out.println("***************************");

            int numero = tlc.nextInt();

            switch (numero) {
                case 1:
                    Alumno.ponerDatos(alu);
                    break;

                case 2: {
                    System.out.println("Introduce un nombre: ");
                    nombre = tlc.nextLine();
                    Alumno.Buscar(nombre);
                    break;
                }
                case 3: {
                    Alumno.modificar(alu);
                    break;
                }
                case 4: {
                    System.out.println("Introduce un carnet para borrar alumno: ");
                    carnet = tlc.nextLine();
                    Alumno.Borrar(carnet);
                    break;
                }
                case 5: {
                    Alumno.pasarFichero5(alu);
                    break;
                }
                case 6: {
                    Alumno.visualizarFichero5();
                    break;
                }
                case 7: {
                    Alumno.llenarArchivo(alu);
                    break;

                }
                case 8: {
                    System.out.println("Saliendo..");
                    opcion = true;
                    break;
                }

            }
        } while (opcion != true);
               */
        Alumno ordenar[] = new Alumno[2];
        ordenar[0] = new Alumno();
        ordenar[0].setNota1(4);
        ordenar[0].setApellido("Lothbrok");
        ordenar[1] = new Alumno();
        ordenar[1].setNota2(6);
        ordenar[1].setApellido("Uhtred son of Uhtred");
        System.out.println("Alumnos desordenados");
        for (int i = 0; i < ordenar.length; i++) {
            System.out.println("Alumno " + (i + 1) + " Apellido: " + ordenar[i].getApellido() + " Nota: " + ordenar[i].getNota1());
        }
        Arrays.sort(ordenar, new CompararNota());
        System.out.println("Alumnos ordenados por notas de mayor a menor");
        for(int i= 0; i<ordenar.length;i++){
            System.out.println("Alumno: "+ (i+1) + " Apellido: " + ordenar[i].getApellido() + " Nota: "+ ordenar[i].getNota1());
        }
        Arrays.sort(ordenar, new CompararNota());
        System.out.println("Alumnos ordenados por notas de menor a mayor");
        for(int i= 0; i<ordenar.length;i++){
            System.out.println("Alumno: "+ (i-1) + " Apellido: " + ordenar[i].getApellido() + " Nota: "+ ordenar[i].getNota1());
        }
        Arrays.sort(ordenar, new ComparaApellido());
        System.out.println("Alumnos ordenados por apellido");
        for(int i = 0;i<ordenar.length;i++){
            System.out.println("Alumno "+(i+1)+" Apellido: " + ordenar[i].getApellido() + " Nota: " + +ordenar[i].getNota1());
        }

    }
}
