package Biblioteca;

public class Publicacion {

    private String codigo;
    private String titulo;
    private int año;

    public Publicacion(String codigo, String titulo, int año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    public String toString() {
        return "Publicacion{" + "codigo=" + codigo + ", titulo=" + titulo + ", a\u00f1o=" + año + '}';
    }

}
