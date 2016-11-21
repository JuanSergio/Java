package modelos;

/**
 *
 * @author juansergio
 */
public class Tarea {

    private Integer id, nivel_de_prioridad;
    private String descripcion;
    private String titulo;

    public Tarea() {
        this.id = null;
        this.nivel_de_prioridad = null;
        this.descripcion = null;
        this.titulo = null;

    }

    public Tarea(int id, String titulo, String descripcion, int prioridad) {
        this.id = id;
        this.nivel_de_prioridad = prioridad;
        this.descripcion = descripcion;
        this.titulo = titulo;

    }

    public Integer getId() {
        return id;
    }

    public Integer getNivel_de_prioridad() {
        return nivel_de_prioridad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setnivel_de_prioridad(Integer nivel_de_priorida) {
        this.nivel_de_prioridad = nivel_de_prioridad;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", nivel_de_prioridad=" + nivel_de_prioridad + ", titulo=" + titulo + ", descripcion=" + descripcion + '}';
    }

}
