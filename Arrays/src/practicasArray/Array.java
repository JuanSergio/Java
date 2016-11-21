
package practicasArray;

public class Array {
    public static void main(String[] args) {
        int i;
        int [ ] a = {-1, 6, 5 , 3 , 2, 5, 8, 9, -4, 5 , 2 ,5 ,5 ,5 ,6 ,3 ,3 ,8, 0, 1 };
        int valorMinimo1 = a[0];
        int valorMinimo2 = a[0];
        int valorMaximo = a[0];
        System.out.println(a.length);
        for(i = 1; i < a.length;  i++){
            if(valorMinimo1 > a[i]){
                valorMinimo1 = a[i];
                
            }
           if(valorMinimo1 != a[i] && valorMinimo2 > a[i]){
                valorMinimo2 = a[i];
                
            }
            
            if(valorMaximo < a[i]){
                 valorMaximo = a[i];
             }
        }

         System.out.println(valorMaximo);
        System.out.println(valorMinimo1);
        System.out.println(valorMinimo2);
    }
    
}
