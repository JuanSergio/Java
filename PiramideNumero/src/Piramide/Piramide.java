/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piramide;

import java.io.*;

public class Piramide {

    public void figura() throws IOException {
        BufferedReader obj=new BufferedReader (new InputStreamReader (System.in) );
        int a= 0, b=0, c=0, d=0;
        System.out.println("Escribe el numero de filas que quieres que tenga: ");
        d=Integer.parseInt(obj.readLine());
        for(a=0; a<=d; a++){
            for(b=0; b<a; b++){
                c=a+b;
                System.out.print(c);
            }
            System.out.println("");
        }
    }
}
