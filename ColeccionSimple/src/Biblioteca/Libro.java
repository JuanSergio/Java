package Biblioteca;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String codigo, String titulo, int año) {
        super(codigo, titulo, año);
        prestado = false;
    }

    public void prestar() {
        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }

    public boolean prestado() {
        return prestado;
    }

    public String toString() {
        return super.toString() + (prestado ? "prestado" : "No prestado") + "/n";
    }

}
