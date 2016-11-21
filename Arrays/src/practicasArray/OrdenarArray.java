
package practicasArray;

public class OrdenarArray {
    public static void main(String[] args) {
        int i, j, aux;
        int [] a = {1, 4, 12, 8, 9};
        
        System.out.println("la longitud del array es:" + a.length);
        
        for(i = 0; i < a.length; i++){
           for(j=i+1; j < a.length; j++){
               if(a[i] > a[j]){
                   aux = a [i];
                   a[i] = a[j];
                   a[j] = aux;
               }
           }
             
        }
        
        for(i = 0; i < a.length; i++){
            System.out.println(a [i]);  
        }
    }
}
