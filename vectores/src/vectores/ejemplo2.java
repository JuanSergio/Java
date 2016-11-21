/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

/**
 *
 * @author mati
 */
public class ejemplo2 {
   public static void Imprimir(String[]nom){
    for(int i=0;i<nom.length;i++)
    System.out.println(nom[i]);
   }
   
    public static byte EntreNotas(float nota1,float nota2,float []not){
    byte Contador = 0;
    for(int i=1;i< not.length;i++){
    if ((not[i]>=nota1)&&(not[i]<=nota2))Contador++;}

    return Contador;}
    public static void main (String[]args) {
          
       float[] Notas = {5.8f,0f,7.1f,5.9f,3.6f,9.9f,1.2f,10.0f,4.6f,5.0f};
        String[] Nombres = new String [10];
        Nombres[0]="Pedro";Nombres[1]="Ana";Nombres[2]="Luis";
        Nombres[3]="Luis";Nombres[4]="Juan";Nombres[5]="Eva";
        Nombres[6]="Mari";Nombres[7]="Fran";Nombres[8]="Luz";
        Nombres[9]="Sol"; 
        Imprimir(Nombres);
        System.out.println("Aprobados");
        System.out.println(EntreNotas(5.0f,10.0f,Notas));
        System.out.println("Suspensos: ");
        System.out.println(EntreNotas(0.0f,4.9f,Notas));
        System.out.println("Matriculas: ");
        System.out.println(EntreNotas(10.0f,10.0f,Notas));
        byte Aprobados = 0;
        String NombresAprobados= new String();
        for (int i=0;i<Nombres.length;i++)
            if(Notas[i]>=5.0){
                Aprobados++;
                NombresAprobados = NombresAprobados +" "+Nombres[i];}
        System.out.println("Aprobados: " + Aprobados);
        System.out.println("Aprobados:" + NombresAprobados);
    }
}