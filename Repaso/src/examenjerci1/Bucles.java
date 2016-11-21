
package examenjerci1;

public class Bucles {
    public static void main(String[] args) {
        
    float valorMagico;
       
       valorMagico = 5;
       for(int i = 0; i < 100; i++){
       valorMagico = valorMagico * 2;   
       System.out.println("hola mundo" + valorMagico);
       }
       valorMagico = 5;
       int i = 0;
       
       while(i < 100 ){
           i++;
           if ((i+1) % 2 == 0){
                System.out.println("soy un numero par" + (i+1));   
           }
           
        
       }
       i = 2;
       while(i < 101){
                System.out.println("soy un numero par" + (i));  
                i = i+2;
       }
       int intentos = 0;
       int numero = 0;
       while(true) {
           numero = (int) (Math.random()*500);
           intentos = intentos+1;
           if (numero == 220){
               break;
           }
       }
        System.out.println(numero + "el numero de intentos: " + intentos);
      
    }
}
