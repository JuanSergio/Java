/*
 5. Desarrollar una clase llamada Motor que:
 Tenga dos atributos prívate de tipo int (litros de aceite) y de tipo int (CV)
 Tenga un constructor con un parámetro de tipo int para los CV. 
Los litros de aceite por defecto serán 0.
 Tenga un getvalor para cada uno de los atributos.
 Tenga un setvalor para los litros.
 */
package Practica03;

public class Motor {
    private int litros;
    private int cv;
    
    public Motor(int litros, int cv){
        this.litros = litros;
        this.cv = cv;
    }
    public Motor(){
        litros = 0;
    }
    public int getLitros(){
        return litros;
    }
    public int getCv(){
        return cv;
    }
    public void setLitros(int l){
        litros=1;
    }
}
