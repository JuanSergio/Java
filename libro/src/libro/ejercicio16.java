/*
 * ordenar tres numeros de mayor a menos
 */
package libro;
import java.util.*;
public class ejercicio16 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      int num1, num2, num3;
      
        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextInt();
         System.out.println("Introduce el segundo numero: ");
        num2 = entrada.nextInt();
         System.out.println("Introduce el tercer numero: ");
        num3 = entrada.nextInt();
        
        if (num1 > num2 && num2 > num3) {
            System.out.println(num1 + ", " + num2 + ", " + num3);
        } else {
            if (num1 > num3 && num3 > num2) {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }else {
                if (num2 > num1 && num1 > num3);{
                    System.out.println(num2 + ", " + num1 + ", " + num3);
                }else {
                    if (num2 > num3 && num3 > num1){
                    System.out.println(num2 + ", " + num3 + ", " + num1);
                        } else {
                            if (num3 > num1 && num1 > num2){
                                System.out.println(num3 + ", " + num1 + ", " + num2);
                                }else {
                                     if (num3 > num2 && num2 > num1) {
                                     System.out.println(num3 + ", " + num2 + ", " + num1);
                                     }
                            }
                    }
                        }
            }
        }
    }
}

                    
                    
                    
               
            
            
            
        
    

