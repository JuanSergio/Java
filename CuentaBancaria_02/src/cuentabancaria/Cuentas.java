package cuentabancaria;

import java.util.*;

public class Cuentas {
    private ArrayList<CuentaBancaria> cuentas = new ArrayList();
    private int total;
    
    public CuentaBancaria buscarCuenta(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("1. Buscar cuenta por nombre.");
        System.out.println("2. Buscar cuenta por numero de cuenta.");
        System.out.println("0. Salir de la busqueda.");
        
        int opcion = teclado.nextInt();
        CuentaBancaria c;
            if(opcion==1 || opcion==2)
            {
                if(opcion==1){
                    System.out.println("Escriba el nombre de su cuenta:");
                    teclado.nextLine();
                    String nom=teclado.nextLine();
                    c=poscuentanombre(nom);
                    return c;
                 }
                  else
                    {
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
    public CuentaBancaria poscuentanombre(String nombre){
        CuentaBancaria c=new CuentaBancaria();
        for(int i=0;i<cuentas.size();i++){
            c=(CuentaBancaria)cuentas.get(i);
            if(c.nombre.equals(nombre)){
                 return cuentas.get(i);
            }
                
        }
        return null;
    }
    
    //Método Poscuenta
    public CuentaBancaria poscuenta(String numcta){
        CuentaBancaria c=new CuentaBancaria();
        for(int i=0;i<cuentas.size();i++){
            c=(CuentaBancaria)cuentas.get(i);
            if(c.cuenta.equals(numcta)){
                 return cuentas.get(i);
            }
                
        }
        return null;
    }
    
    //Nueva Cuenta Bancaria
    int NuevaCuenta(){
        Scanner tec=new Scanner(System.in);
        CuentaBancaria a = new CuentaBancaria();
        
        System.out.println("Introduzca su nombre:");
        String nom=tec.nextLine();
        a.setNombre(nom);
        
        System.out.println("Introduzca su número de cuenta:");
        String cuent=tec.nextLine();
        a.setCuenta(cuent);
        
        System.out.println("Introduzca su saldo:");
        double saldo=tec.nextDouble();
        a.setSaldo(saldo);
        
        System.out.println("Introduzca su interés:");
        double inte=tec.nextDouble();
        a.setInteres(inte);
        
        cuentas.add(a);
        int c=cuentas.indexOf(a);
        System.out.println(c);
        return c;
        
    }
    
    //Modificar cuenta
    void ModificarCuenta(){
       Scanner teclado = new Scanner(System.in);
       CuentaBancaria a = new CuentaBancaria();
       
       System.out.println("Introduzca el número de su cuenta:");
       String cuent=teclado.nextLine();
       a=poscuenta(cuent);
       verCuenta(a);
       
       System.out.println("1. Modificar nombre.");
       System.out.println("2. Modificar saldo");
       System.out.println("3. Modificar interés");
       System.out.println("¿Qué quiere modificar?");
       
       int opcion=teclado.nextInt();
       switch(opcion){
           case 1:  System.out.println("Introduzca su nuevo nombre:");
                    teclado.nextLine();    
                    String nom=teclado.nextLine();
                    a.setNombre(nom);
                    break;
           case 2:  System.out.println("Introduzca su nuevo saldo:");
                    double saldo=teclado.nextDouble();
                    a.setSaldo(saldo);
                    break;
           case 3:  System.out.println("Introduzca su nuevo interés:"); 
                    double inte=teclado.nextDouble();
                    a.setInteres(inte);
                    break;
       } 
    }
    
    void AnularCuenta(){
       CuentaBancaria a = new CuentaBancaria();
       a = this.buscarCuenta();
       cuentas.remove(a);
       System.out.println("Su saldo actual es: "+a.getSaldo());
    }
    void ConsultarCuenta(){
       CuentaBancaria a = new CuentaBancaria(); 
       a = this.buscarCuenta();
       verCuenta(a);
    }
    void verCuenta(CuentaBancaria a){
        System.out.println("Nombre: "+a.getNombre()+"\nNúmero de cuenta: "+a.getCuenta()+
               "\nSaldo: "+a.getSaldo()+"\nInterés: "+a.getInteres());
    }
    void VisualizarCuentas(){
        for(CuentaBancaria a:cuentas){
            System.out.println("*************************");
            verCuenta(a);
            System.out.println("*************************");
        }
    }
}


