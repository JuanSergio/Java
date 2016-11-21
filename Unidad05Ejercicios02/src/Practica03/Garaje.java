/*
 7. Desarrollar una clase llamada Garaje que:
 Tendrá tres atributos, un coche, un String con la avería asociada 
y el número de coches que ha ido atendiendo.
 El garaje solo podrá atender a un coche en cada momento. Controlar esta premisa.
 Tenga un método aceptarCoche que recibe un parámetro de tipo Coche y la avería asociada. 
El garaje solo podrá atender a un coche en cada momento. 
Si ya está atendiendo uno, que devuelva un false.
 Tenga un método devolverCoche que dejará al garaje en estado de aceptar un nuevo coche.
 */
package Practica03;

public class Garaje{ 
    private Coche coche; 
    private String tipoAveria; 
    private int cochesAtendidos; 
    int litro=0;
 
    
    public Garaje(){
        this.coche = null;
        this.tipoAveria = "";
        this.cochesAtendidos = 0;
    }
     
    public void aceptarCoche(Coche coche, String tipoAveria){ 
        this.coche = coche;
        this.tipoAveria = tipoAveria;
        
        if (cochesAtendidos ==0){
            System.out.println("EL coche será atendido");
            
            cochesAtendidos =1;
        }
        
        if(this.tipoAveria.equals("aceite")){
            int litro=coche.getMotor1().getLitros();
            this.coche.getMotor1().setLitros(litro);
            
            System.out.println("Los litros repostados por es de: "+coche.getMotor1().getLitros());
            
            coche.acumularAveria(100*Math.random());
        }else{
            System.out.println("El garaje esta completo");
        }
    
    }
    public void devolverCoche(){
        System.out.println("El coche sale del garaje");
        cochesAtendidos=0;
    }
}
 