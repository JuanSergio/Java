/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import javax.swing.*;
/**
 *
 * @author mati
 */
public class JOptioPane {
    public static void main(String args[]) throws Exception {
    //Menú de opciones
    int opcion; //La opción que se guardará
    
    //Este string contiene los labels de todos los botones
    String[] menu = {"Opcion1", "Opcion2","Mensaje Simple","Otro Menú","HTML","PideCadena","PideEntero","Salir"};
//Inicia el Menu de botones
do{
        opcion= JOptionPane.showOptionDialog(
                    null,//sin parentesco puede ser Frame f
                    "Selecciona una opción",//texto que sale
                    "Ejemplos con JOptionPane", //titulo de la caja
                    JOptionPane.YES_NO_CANCEL_OPTION,//tipo de caja
                    JOptionPane.QUESTION_MESSAGE, //tipo de mensaje
                    null,//icono de la caja
                    menu,//lista de botones, este es el arreglo
                    menu[0]);//boton por default
switch(opcion) {
    case 0: //Instrucciones aqui Opcion 1
            System.out.println("Seleccionó la Opción 1");
    break;
    
    case 1: //Instrucciones aqui Opcion 2
            System.out.println("Seleccionó la Opción 2");
    break;

    case 2: //Mensaje Simple
            JOptionPane.showMessageDialog(null,"Hola Mundo");
    break;
        
    case 3: //Otro menu dentro de esta opción
                //Menú de opciones
            int opcion2;
                //Este string contiene los labels de todos los botones
            String[] menu2 = {"Opción 1","Opción 2","Salir"};
               //Inicia el Menu de botones
              do{
                  
                    opcion2 = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opción",
                    "JOptionPane.showOptionDialog",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,   
                    null,
                    menu2,
                    menu2[0]);
                    
            switch(opcion2) {
                   case 0: System.out.println("Seleccionó la Opción 1");
                            break;
                       
                   case 1: System.out.println("Seleccionó la Opción 2");
                            break;
                       
                    case 2: //Para que se salga del do-while
                            opcion2 = -1;
                            break;
            }//end switch(opcion2)
             }while(opcion2 != (-1));// fin del do-while
        break;

    case 4: //HTML
/* Puedes usar tags de HTML dentro de la string del
                        * message dialog */
     String htmlTags = ""+  "<HTML><HEAD></HEAD>"+ "<BODY>"+ "<CENTER>Mensaje Centrado<CENTER>"+ 
//Tambien se pueden hacer Tablas
"<TABLE BORDER=1 BGCOLOR=WHITE>"
+ 
"<TR><TH>uno</TH><TH>Dos</TH><TH>Tres</TH></TR>"
 + 
"<TR><TD>celda1</TD><TD>celda2</TD><TD>celda3</TD></TR>"
+ 
"</TABLE></BODY>"
 + 
"</HTML>"
; 
                         JOptionPane.
showMessageDialog
(
null
, htmlTags); 
break
; 
case
 5: 
//PideCadena
                         String input = 
""
; 
//Se entiende por si solo
try
 { 
                                input = JOptionPane.
showInputDialog
(
"Escribe algo"
); 
                         }
catch
 (Exception e) {  
//en caso de algún error muestra mensaje
                                JOptionPane.
showMessageDialog
(
null
, 
"Error"
); 
break
; 
//sale de esta opción
                         }
//end try
                            JOptionPane.
showMessageDialog
(
null
, 
"Cadena: "
 + input); 
break
; 
case
 6: 
//PideEntero
int
 entero = 0; 
//se inicializa
try
 { 
//Hacemos parse para convertir a entero
                               entero = Integer.
parseInt
 ( 
                                        JOptionPane.
showInputDialog
(
"Escribe un entero"
)); 
                         } 
catch
 (Exception e) {  
/* en caso de algun error muestra mensaje por ejemp
lo
                                * si se introduce algo diferente de un ente
ro */
                              JOptionPane.
showMessageDialog
(
null
, 
"Error"
); 
break
; 
                         } 
                         JOptionPane.
showMessageDialog
(
null
, 
"Número: "
 + entero); 
//Se pueden hacer operaciones  como siempre
if
(entero < 5) { 
                               JOptionPane.
showMessageDialog
( 
null
, 
"El Núumero: "
 + entero + 
" es menor a 5"
); 
                         } 
break
; 
case
 7: 
//Salir del programa                 
                         opcion = -1; 
break
; 
         }
// fin del switch
   } 
while
(opcion != (- 1) );
// fin del do-while
  } 
//end main()
}
///:~ 
