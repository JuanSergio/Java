
package PiezasInternas;

public class Motor {
    
    private int velocidadDeRotacionDeMotor = 0;
    
    public Motor (int gasolina){
        velocidadDeRotacionDeMotor = piston(gasolina, 3);
    }
    
    private int piston (int gasolina, int oxigeno){
        int fuerza = 0;
        
        
        if(gasolina < 30){
            fuerza = (gasolina * oxigeno);
        }else{
            System.out.println("El motor va a explotar");
        }
        return fuerza;
    }
    
    public int get_velocidadDeRotacionDeMotor(){
        return velocidadDeRotacionDeMotor;
    }
    
}
