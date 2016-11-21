package Biblioteca;

public class Main {

    public static int cuentaPrestados(Object[] lista) {
        int contador = 0;
        for (Object o : lista) {
            if (o instanceof Prestable && ((Prestable) o).prestado()) {
                contador++;
            }

        }
        return contador;
    }

    public static int publicacionesAnterioresA(Publicacion[] lista, int año) {
        int contador = 0;
        for (Publicacion p : lista) {
            if (p.getAño() < año) {
                contador++;
            }

        }
        return contador;
    }

    public static void main(String[] args) {
        Publicacion[] biblioteca = {
            new Libro("CCI", "La fundacion", 1951),
            new Revista("CR1", "El jueves", 2002, 1305),
            new Libro("CC2", "El neuromante", 1984),
            new Revista("DR1", "Quo", 2002, 81)};

        Libro l = (Libro) biblioteca[0];
        l.prestar();
        for (Publicacion p : biblioteca) {
            System.out.println(p);
        }
        System.out.println(publicacionesAnterioresA(biblioteca, 1980) + "publicaciones anteriores a 1980");
        System.out.println(cuentaPrestados(biblioteca) + " libros prestados");
    }
}
