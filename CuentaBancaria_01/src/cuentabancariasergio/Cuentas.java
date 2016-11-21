
package cuentabancariasergio;

import java.util.*;

public class Cuentas{
    ArrayList <Cuenta> cuentas= new ArrayList();
    Scanner c = new Scanner(System.in);
    private int total=0;
    
    public Cuenta buscarCuenta(){
        System.out.println("Introduce número de cuenta:");
        c.nextLine();
        String cuenta=c.nextLine();
        if(posCuentaNombre(cuenta)!=null)
            return posCuentaNombre(cuenta);
        else if(posCuenta(cuenta)!=null)
            return posCuenta(cuenta);
        else 
            return null;
    }
    
    public Cuenta posCuentaNombre(String nombre)
    {
        for(int i=0;i<cuentas.size();i++)
            if(cuentas.get(i).getNombre().equals(nombre))
                return cuentas.get(i);
        
        return null;           
    }
    
    public Cuenta posCuenta(String numcta)
    {
        for(int i=0;i<cuentas.size();i++)
            if(cuentas.get(i).getCuenta().equals(numcta))
                return cuentas.get(i);
       
        return null;
    }
    
    public void nuevaCuenta(){
        Boolean repetida=false,ctrl=true;
        Cuenta nueva = new Cuenta();
        System.out.println("Creando nueva cuenta...");
        
        //CONTROL NOMBRE
        do{
            try{
                ctrl=true;
                System.out.println("Introduce el nombre: ");
                nueva.setNombre(c.nextLine());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                ctrl=false;
            }
        }
        while(!ctrl);
        //CONTROL CUENTA REPETIDA
        do
        {
            //CONTROL NUMERO DE CUENTA
            do
            {
                try
                {
                    ctrl=true;
                    System.out.println("Introduce el numero de cuenta: ");
                    nueva.setCuenta(c.nextLine());
                }
                catch(Exception e)
                {
                       System.out.println(e.getMessage()); 
                       ctrl=false;
                }
            }
            while(!ctrl);
            
            for(int i=0;i<cuentas.size();i++)
            {
                if(cuentas.get(i).getCuenta().equals(nueva.getCuenta())){
                    System.out.println("Cuenta repetida");
                    repetida=true;
                    i=cuentas.size();
                }
                else repetida=false;
            }
        }
        while(repetida);
        //CONTROL SALDO
        do{
            try{
                ctrl=true;
                System.out.println("Introduce el saldo: ");
                nueva.setSaldo(c.nextDouble());
            }
            catch(Exception e){
                System.out.println(e.getMessage()); 
                ctrl=false;
            }
        }
        while(!ctrl);
        //CONTROL TIPO DE INTERES
        do{
            try{
                ctrl=true;
                System.out.println("Introduce el Tipo de Interes: ");
                nueva.setTipoDeInteres(c.nextDouble());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                ctrl=false;
            }
        }
        while(!ctrl);
                
        cuentas.add(nueva);
        System.out.println("Cuenta añadida");
        total=total+1;
    }
    
    public void modificarCuenta(){
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
            opcion=c.nextInt();
            
            switch(opcion){
                case 1:
                    //SALDO
                    do
                    {
                        try
                        {
                            ctrl=true;
                            System.out.println("Introduce el saldo: ");
                            nueva.setSaldo(c.nextDouble());
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
                case 2:
                    //TIPO DE INTERES
                    do
                    {
                        try
                        {
                            ctrl=true;
                            System.out.println("Introduce el Tipo de Interes: ");
                            nueva.setTipoDeInteres(c.nextDouble());
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
    
    public void anularCuenta()
    {
        Cuenta nueva=new Cuenta();
        int opcion=-1;
        int i=-1;
        nueva=this.buscarCuenta();
        System.out.println(nueva.toString());
        do{
            System.out.println("== == == == CONFIRMACION == == == ==");
            System.out.println("\n1. Borrar");
            System.out.println("0. Salir\n");
            System.out.println("Elige una opcion:");
            opcion=c.nextInt();
            switch(opcion)
            {
                case 1:
                    i=cuentas.indexOf(nueva);
                    cuentas.remove(i);
                    System.out.println("Cuenta borrada");
                    opcion=0;
                    break;
                case 0:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            
        }
        while(opcion!=0);
        total=total-1;
    }
    
    public void consultarCuenta()
    {
        Cuenta nueva=new Cuenta();
        nueva=this.buscarCuenta();
        System.out.println(nueva.toString());
    }
    
    public void verCuenta(Cuenta c)
    {
        Cuenta nueva=new Cuenta();
        int i=cuentas.indexOf(c);
        nueva=cuentas.get(i);
        nueva.toString();
    }
    
    public void visualizarCuentas()
    {
        Cuenta nueva=new Cuenta();
        for (int i=0;i<cuentas.size();i++)
            System.out.println(cuentas.get(i));
        
    }
}