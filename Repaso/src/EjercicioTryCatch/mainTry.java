
package EjercicioTryCatch;

import java.util.*;

public class mainTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        boolean hayError = false;
        int pasos = 1;
        int telefono = 0;
        int edad = 0;
        
        do {
            hayError = false;
            try {
                switch(pasos){
                    case 1:
                        System.out.println("Introduce el nonombre: ");
                        nombre = sc.next();
                        pasos++;
                    case 2:
                        System.out.println("Introduce el telefono: ");
                        telefono = sc.nextInt();
                        pasos++;
                    case 3:
                        System.out.println("Introduce la edad: ");
                        edad = sc.nextInt();
                        break;
                    default:  
                        break;
                }
            }catch (Exception e){
                hayError = true;
                System.out.println("Ha ocurrido un error");
                sc.nextLine();
            }
        }  while(hayError);
        
        
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi telefono es " + telefono);
        System.out.println("Mi edad es " + edad);
    }
    
}
