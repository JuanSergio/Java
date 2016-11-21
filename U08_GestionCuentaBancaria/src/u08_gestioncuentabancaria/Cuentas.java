
/* miguelrosales */

package u08_gestioncuentabancaria;

import java.util.*;

public class Cuentas {
    private ArrayList<Cuenta> cuentas = new ArrayList();
    Scanner teclado = new Scanner(System.in);
    private int total;
    
    public Cuenta buscarCuenta(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("1. Buscar cuenta por nombre.");
        System.out.println("2. Buscar cuenta por numero de cuenta.");
        System.out.println("0. Salir de la busqueda.");
        
        int opcion = teclado.nextInt();
        Cuenta c;
            if(opcion==1 || opcion==2){
                if(opcion==1){
                    System.out.println("Escriba el nombre de su cuenta:");
                    teclado.nextLine();
                    String nom=teclado.nextLine();
                    c=poscuentanombre(nom);
                    return c;
                 }
                  else{
                    System.out.println("Escriba el número de su cuenta:"); 
                    teclado.nextLine();
                    String cuent=teclado.nextLine();
                    c=poscuenta(cuent);
                    return c;
                    }
             }
            else{     
                System.out.println("La búsqueda ha finalizado.");return null;
        }
    }
    
    //Método PoscuentaNombre
    public Cuenta poscuentanombre(String nombre){
        Cuenta c=new Cuenta();
        for(int i=0;i<cuentas.size();i++){
            c=(Cuenta)cuentas.get(i);
            if(c.nombre.equals(nombre)){
                 return cuentas.get(i);
            }
        }
        return null;
    }
    
    //Método Poscuenta
    public Cuenta poscuenta(String numcta){
        Cuenta c=new Cuenta();
        for(int i=0;i<cuentas.size();i++){
            c=(Cuenta)cuentas.get(i);
            if(c.cuenta.equals(numcta)){
                 return cuentas.get(i);
            }
        }
        return null;
    }
    
    //Nueva Cuenta Bancaria
    int NuevaCuenta(){
        Scanner teclado = new Scanner(System.in);
        boolean control;
        Cuenta nueva = new Cuenta();
        
        //Nueva Cuenta
        //Nombre
        do{
            try{
                control=true;
                System.out.println("Introduce el nombre: ");
                nueva.setNombre(teclado.nextLine());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                control=false;
            }
        }
        while(!control);
        //Cuenta
        do{
            try{
                control=true;
                System.out.println("Escriba la cuenta: ");
                nueva.setCuenta(teclado.nextLine());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                control=false;
            }
        }
        while(!control);
        
        //Saldo
        do{
            try{
                control=true;
                System.out.println("Escriba el saldo inicial: ");
                nueva.setSaldo(teclado.nextDouble());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                control=false;
            }
        }
        while(!control);
        
        //Interes
        do{
            try{
                control=true;
                System.out.println("Escriba el interés: ");
                nueva.setTipoDeInteres(teclado.nextDouble());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                control=false;
            }
        }
        while(!control);
        
        cuentas.add(nueva);
        int c=cuentas.indexOf(nueva);
        System.out.println(c);
        return c;
        
    }
    
    //Modificar cuenta
    void ModificarCuenta(){
        boolean ctrl=true;
        int opcion=-1;
        int i=-1;
        System.out.println("Que cuenta quieres modificar: ");
        Cuenta nueva= new Cuenta();
        nueva=this.buscarCuenta();
        
        System.out.println("Cuenta encontrada...");
        System.out.println(nueva.toString());
        
        do{
            System.out.println("== == == == MODIFICAR CUENTA == == == == ==");
            System.out.println("\n1. Saldo");
            System.out.println("2. Tipo de interes");
            System.out.println("0. Salir\n");
            System.out.println("Elige una opcion: ");
            opcion = teclado.nextInt();
            
            switch(opcion){
           case 1:
               do{
                   try{
                       ctrl=true;
                       System.out.println("Introduce el saldo: ");
                       nueva.setSaldo(teclado.nextDouble());
                   }
                   catch(Exception e){
                            System.out.println(e.getMessage());
                            ctrl=false;
                        }
                    }
                    while(!ctrl);
                    i=cuentas.indexOf(nueva);
                    cuentas.set(i, nueva);
                    break;
               case 2:
                    //TIPO DE INTERES
                    do{
                        try{
                            ctrl=true;
                            System.out.println("Introduce el Tipo de Interes: ");
                            nueva.setTipoDeInteres(teclado.nextDouble());
                        }
                        catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                            ctrl=false;
                        }
                    }
                    while(!ctrl);
                    i=cuentas.indexOf(nueva);
                    cuentas.set(i, nueva);
                    break;
                case 0:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
        while(opcion!=0);
    }
    
    void AnularCuenta(){
       Cuenta a = new Cuenta();
       a = this.buscarCuenta();
       cuentas.remove(a);
       System.out.println("Su saldo actual es: "+a.getSaldo());
    }
    void ConsultarCuenta(){
       Cuenta a = new Cuenta(); 
       a = this.buscarCuenta();
       verCuenta(a);
    }
    void verCuenta(Cuenta a){
        System.out.println("Nombre: "+a.getNombre()+"\nNúmero de cuenta: "+a.getCuenta()+
               "\nSaldo: "+a.getSaldo()+"\nInterés: "+a.getTipoDeInteres());
    }
    void VisualizarCuentas(){
        for(Cuenta a:cuentas){
            System.out.println("*************************");
            verCuenta(a);
            System.out.println("*************************");
        }
    }
}
