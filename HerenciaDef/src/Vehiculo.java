
public class Vehiculo {
    protected int ruedas;
    protected String conductor;
    protected int posX;
    protected String color;
    protected int velocidad;
    private String patata;
    public Vehiculo (int ruedas, String conductor, int posX, String color,
            int velocidad){
        this.ruedas = ruedas;
        this.conductor = conductor;
        this.color = color;
        this.posX = posX;
        this.velocidad = velocidad;
    }
    private int movimientoRelativo(int tiempo){
        return tiempo * velocidad;
    }
    public void mover (int tiempo){
        posX = posX+movimientoRelativo(tiempo);
    }
    @Override
    public String toString(){
    return "El vehiculo tiene "+ruedas+" ruedas un color "+color+
            " y es conducido por "+conductor;
}
}
