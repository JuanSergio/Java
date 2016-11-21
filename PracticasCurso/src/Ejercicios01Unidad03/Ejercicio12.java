/*
 Mostrar los impares de 1 a 99 indicando al final cuantos son. 
Repetir para los pares y para los múltiplos de cinco.
 */
package Ejercicios01Unidad03;


public class Ejercicio12 {
    public static void main(String[] args) {
        int contImp=0, contPar=0, contMult5=0;
        
        for(int i=1;i<=99;i++){
            
           if(i%2==0){
            contPar++;
            System.out.println(i + " es par.");
            }
            if(i%2!=0){
            contImp++;
            System.out.println(i + " es impar.");
            }
            if(i/5==0)
            {
            contMult5++;
            System.out.println(i + " es multiplo de 5.");
                }
            }
                System.out.println(contPar + "  pares");
                System.out.println(contImp + "  impares");
                System.out.println(contMult5 + "  multiplos de 5");
         }
}
