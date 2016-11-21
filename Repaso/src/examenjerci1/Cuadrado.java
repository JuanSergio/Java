
package examenjerci1;

public class Cuadrado {
    public static void main(String[] args) {
   int tamaño = 10;
   
   for(int i= 1; i <=tamaño;i++){
        for(int j= 1; j <=tamaño;j++){
           if( j == 1 || j == tamaño || i == 1 || i == tamaño ){
               System.out.print("* ");  
           }else{
               System.out.print("  ");
           }
        }
       System.out.println();
}
}
}
