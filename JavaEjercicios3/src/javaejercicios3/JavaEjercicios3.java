/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios3;

/**
 *
 * @author mati
 */
public class JavaEjercicios3 {

    public static void main(String[] args) {
 
{

{
int num1,num2;
java.util.Scanner lector = new java.util.Scanner(System.in);
System.out.print("Introduce un numero: ");
num1 = lector.nextInt();
lector.nextLine();
System.out.print("Introduce un numero: ");
num2 = lector.nextInt();
lector.nextLine();
if(num1==num2)
System.out.println(num1 + " = " + num2);
else if(num1>num2)
System.out.println(num1 + " > " + num2);
else
System.out.println(num1 + " < " + num2);
    }
} 
    }  

}