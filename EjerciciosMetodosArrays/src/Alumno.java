
import java.util.*;

public class Alumno {

    int númeroPersonal;
    String apellido1, apellido2, nombre;
    int numAsignaturas;
    double[] notasFinales;
    double notaMediaFinal;

    public Alumno(int numPer, String ap1, String ap2, String nom, int numAsig) {
        númeroPersonal = numPer;
        apellido1 = ap1;
        apellido2 = ap2;
        nombre = nom;
        numAsignaturas = numAsig;
        notasFinales = new double[numAsignaturas];
    }

    public Alumno(int numPer, String ap1, String ap2, String nom, int numAsig, double[] notasF, double nmf) {
        númeroPersonal = numPer;
        apellido1 = ap1;
        apellido2 = ap2;
        nombre = nom;
        numAsignaturas = numAsig;
        notasFinales = notasF;
        notaMediaFinal = nmf;
    }

    public String toString() {
        String resul;
        resul = "NP: " + númeroPersonal + "\n" + " Nombre: " + nombre
                + " Apellido1: " + apellido1
                + " Apellido2: " + apellido2 + "\n"
                + " Nota Media Final: " + notaMediaFinal + "\n";
        return resul;
    }

    public double obtenerNotaMediaFinal() {
        return notaMediaFinal;
    }

    public void asignarNotas(double[][] x) {
        if (x.length <= 2) {
            for (int columna = 0; columna < x[0].length; columna++) {
                this.notasFinales[columna] = (x[0][columna] * 0.6) + (x[1][columna] * 0.4);
            }
            for (int i = 0; i < this.notasFinales.length; i++) {
                this.notaMediaFinal += this.notasFinales[i];
            }
            this.notaMediaFinal /= this.numAsignaturas;

        } else {
            System.out.println("La matriz debe de tener 2 evaluaciones!!");
        }
    }

    public boolean pasaDeCurso() {
        boolean aprobado = false;
        int suspensas = 0;
        for (int i = 0; i < this.notasFinales.length; i++) {
            if (this.notasFinales[i] < 5) {
                suspensas++;
            }
        }
        if (this.obtenerNotaMediaFinal() > 5 && suspensas < 3) {
            aprobado = true;
        }
        return aprobado;
    }

    public static void main(String[] args) {
        Alumno Mario = new Alumno(0, "Perez", "Ferrer", "Mario", 3);
        Alumno Carlos = new Alumno(1, "Hernandez", "Lloguer", "Carlos", 5);

        double[][] notasPepe = new double[2][Mario.numAsignaturas];
        for (int fila = 0; fila < notasPepe.length; fila++) {
            for (int columna = 0; columna < notasPepe[fila].length; columna++) {
                notasPepe[fila][columna] = Math.random() * 10 + 0;
            }
        }
        double[][] notasMaria = new double[2][Carlos.numAsignaturas];
        for (int fila = 0; fila < notasMaria.length; fila++) {
            for (int columna = 0; columna < notasMaria[fila].length; columna++) {
                notasMaria[fila][columna] = Math.random() * 10 + 0;
            }
        }
        Mario.asignarNotas(notasPepe);
        Carlos.asignarNotas(notasMaria);
        System.out.println("Mario pasa de curso: " + Mario.pasaDeCurso());
        System.out.println(Mario.toString());
        System.out.println("Carlos pasa de curso: " + Carlos.pasaDeCurso());
        System.out.println(Carlos.toString());

    }
}
