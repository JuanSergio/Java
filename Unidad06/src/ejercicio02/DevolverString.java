/*
2. Escribe un método que, dado un String, devuelve otro objeto String en el que 
se cambian todas las vocales minúsculas del original por la letra 'a'. Escribe 
un programa que permita comprobar el funcionamiento
 */
package ejercicio02;

public class DevolverString {
    public static void main(String[] args) {
    String saludo = new String ("Hola");
    String cambioVocal1 = saludo.replace('e', 'a');
    String cambioVocal2 = saludo.replace('i', 'a');
    String cambioVocal3 = saludo.replace('o', 'a');
    String cambioVocal4 = saludo.replace('u', 'a');
    
    if (saludo.contains("e")){
        System.out.println(cambioVocal1);
    }else if(saludo.contains("i")){
        System.out.println(cambioVocal2);
    }else if(saludo.contains("o")){
        System.out.println(cambioVocal3);
    }else if(saludo.contains("u")){
        System.out.println(cambioVocal4);
    }
    }
  }


