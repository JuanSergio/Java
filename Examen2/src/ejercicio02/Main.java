
package ejercicio02;


import java.util.*;
public class Main{
    public static void main(String[] args) {
        boolean repetir = false;
        ArrayList<Futbolista> futbolistas = new ArrayList();
        ArrayList<Entrenador> entrenadores = new ArrayList();
        ArrayList<Masajista> masajistas = new ArrayList();

        do {
            System.out.println("= = = = = = Seleccion de futbol = = = = = =");
            System.out.println("1. Listar futbolistas");
            System.out.println("2. Guardar futbolistas");
            System.out.println("3. Visualizar futbolistas");
            System.out.println("4. Guardar en futbolistas.dat");
            System.out.println("0. Salir");
            System.out.println("= = = = = = = = = = = = = = = = = = = = = =");
            Scanner tcl = new Scanner(System.in);
            int opcion = tcl.nextInt();
            Futbolista fut = new Futbolista();
            switch (opcion) {
                case 1:
                    fut.listar(futbolistas);
                    break;
                    case2:
                    
               
        } while (repetir != true);
    }

}
    

