

import java.util.*;
public class Cuentas {
    private ArrayList<CCuenta> arrayListCuenta = new ArrayList();
    private int total;
    
    public CCuenta buscarCuenta(){
        Scanner tlc = new Scanner (System.in);
        System.out.println("Introduce número de cuenta:");
        String cuenta=tlc.nextLine();
        if(posCuentaNombre(cuenta)!=null)
            return posCuentaNombre(cuenta);
        else if(posCuenta(cuenta)!=null)
            return posCuenta(cuenta);
        else 
            return null;
    }
       
    public CCuenta posCuentaNombre(String nombre){
        for(int i=0;i<arrayListCuenta.size();i++)
            if(arrayListCuenta.get(i).getNombre().equals(nombre))
                return arrayListCuenta.get(i);
        
        return null;  
    }
    
    public CCuenta posCuenta(String numcta){
        for(int i=0;i<arrayListCuenta.size();i++)
            if(arrayListCuenta.get(i).getCuenta().equals(numcta))
                return arrayListCuenta.get(i);
       
        return null;
    }
    
    public void nuevaCuenta(){
        Boolean repetida=false,ctrl=true;
        Scanner tlc = new Scanner(System.in);
        CCuenta nueva = new CCuenta();
        System.out.println("Creando nueva cuenta...");
        
        //CONTROL NOMBRE
        do{
            try{
                ctrl=true;
                System.out.println("Introduce el nombre: ");
                nueva.setNombre(tlc.nextLine());
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
                    nueva.setCuenta(tlc.nextLine());
                }
                catch(Exception e)
                {
                       System.out.println(e.getMessage()); 
                       ctrl=false;
                }
            }
            while(!ctrl);
            
            for(int i=0;i<arrayListCuenta.size();i++)
            {
                if(arrayListCuenta.get(i).getCuenta().equals(nueva.getCuenta())){
                    System.out.println("Cuenta repetida");
                    repetida=true;
                    i=arrayListCuenta.size();
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
                nueva.setSaldo(tlc.nextDouble());
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
                nueva.setTipoDeInteres(tlc.nextDouble());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                ctrl=false;
            }
        }
        while(!ctrl);
                
        arrayListCuenta.add(nueva);
        System.out.println("Cuenta añadida");
        total=total+1;
    }
    public void modificarCuenta(){
        Scanner tlc = new Scanner (System.in);
        boolean ctrl=true;
        int opcion=-1;
        int i=-1;
        System.out.println("Que cuenta quieres modificar: ");
        CCuenta nueva= new CCuenta();
        nueva=this.buscarCuenta();
        System.out.println("Cuenta encontrada...");
        System.out.println(nueva.toString());
        
        do{
            System.out.println("== == == == MODIFICAR CUENTA == == == == ==");
            System.out.println("\n1. Saldo");
            System.out.println("2. Tipo de interes");
            System.out.println("0. Salir\n");
            System.out.println("Elige una opcion: ");
            opcion=tlc.nextInt();
            
            switch(opcion){
                case 1:
                    //SALDO
                    do
                    {
                        try
                        {
                            ctrl=true;
                            System.out.println("Introduce el saldo: ");
                            nueva.setSaldo(tlc.nextDouble());
                        }
                        catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                            ctrl=false;
                        }
                    }
                    while(!ctrl);
                    i=arrayListCuenta.indexOf(nueva);
                    arrayListCuenta.set(i, nueva);
                    break;
                case 2:
                    //TIPO DE INTERES
                    do
                    {
                        try
                        {
                            ctrl=true;
                            System.out.println("Introduce el Tipo de Interes: ");
                            nueva.setTipoDeInteres(tlc.nextDouble());
                        }
                        catch(Exception e)
                        {
                            System.out.println(e.getMessage());
                            ctrl=false;
                        }
                    }
                    while(!ctrl);
                    i=arrayListCuenta.indexOf(nueva);
                    arrayListCuenta.set(i, nueva);
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
        Scanner tlc = new Scanner (System.in);
        CCuenta nueva=new CCuenta();
        int opcion=-1;
        int i=-1;
        nueva=this.buscarCuenta();
        System.out.println(nueva.toString());
        do{
            System.out.println("== == == == CONFIRMACION == == == ==");
            System.out.println("\n1. Borrar");
            System.out.println("0. Salir\n");
            System.out.println("Elige una opcion:");
            opcion=tlc.nextInt();
            switch(opcion)
            {
                case 1:
                    i=arrayListCuenta.indexOf(nueva);
                    arrayListCuenta.remove(i);
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
        CCuenta nueva=new CCuenta();
        nueva=this.buscarCuenta();
        System.out.println(nueva.toString());
    }
    
    public void verCuenta(CCuenta c)
    {
        CCuenta nueva=new CCuenta();
        int i=arrayListCuenta.indexOf(c);
        nueva=arrayListCuenta.get(i);
        nueva.toString();
    }
    
    public void visualizarCuentas()
    {
        CCuenta nueva=new CCuenta();
        for (int i=0;i<arrayListCuenta.size();i++)
            System.out.println(arrayListCuenta.get(i));
        
    }
}
