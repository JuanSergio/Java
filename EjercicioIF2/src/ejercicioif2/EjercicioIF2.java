
package ejercicioif2;
import java.util.Scanner;
public class EjercicioIF2 {

    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        
        int numero1;
        int numero2;
        int numero3;
        
        System.out.println ("dame el primer numero: ");
        numero1= entrada.nextInt();
        System.out.println ("dame el segundo numero: ");
        numero2= entrada.nextInt();
        System.out.println ("dame el tercer numero: ");
        numero3= entrada.nextInt();
        
        
        if (numero1>numero2 && numero1>numero3){
            System.out.println ("El mayor es: "+" "+numero1);
        }  
        if (numero2>numero1 && numero2>numero3){
            System.out.println ("El mayor es: "+" "+numero2);
        }  
        if (numero3>numero2 && numero3>numero1){
            System.out.println ("El mayor es: "+" "+numero3);
        }      
        
    }
    }
    

