/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03;

/**
 *
 * @author juansergio
 */
public class Alumno {
    int númeroMatricula;
    String apellido2, nombre;
    int numAsignaturas;
    double[] notasFinales;
    double notaMediaFinal;

    public Alumno(int numMa, String nom, int numAsig) {
        númeroMatricula = numMa;
        nombre = nom;
        numAsignaturas = numAsig;
        notasFinales = new double[numAsignaturas];
    }

    public Alumno(int numMa, String nom, int numAsig, double[] notasF, double nmf) {
        númeroMatricula = numMa;
        nombre = nom;
        numAsignaturas = numAsig;
        notaMediaFinal = nmf;
    }

    public String toString() {
        String resul;
        resul = "Numero matricula: " + númeroMatricula + "\n" + " Nombre: " + nombre
                + " Nota Media Final: " + notaMediaFinal + "\n";
        return resul;
    }

    public double dameMedia() {
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
            System.out.println("error");
        }
    }


    public static void main(String[] args) {
        Alumno Juanse = new Alumno(0, "Juanse", 3);
        Alumno Susana = new Alumno(1, "Susana", 5);
        Alumno Jonathan = new Alumno(2, "Jonathan", 6);

        double[][] notasJuanse = new double[2][Juanse.numAsignaturas];
        for (int fila = 0; fila < notasJuanse.length; fila++) {
            for (int columna = 0; columna < notasJuanse[fila].length; columna++) {
                notasJuanse[fila][columna] = Math.random() * 10 + 0;
            }
        }
        double[][] notasSusana = new double[2][Susana.numAsignaturas];
        for (int fila = 0; fila < notasSusana.length; fila++) {
            for (int columna = 0; columna < notasSusana[fila].length; columna++) {
                notasSusana[fila][columna] = Math.random() * 10 + 0;
            }
        }
        double[][] notasJonathan = new double[2][Jonathan.numAsignaturas];
        for (int fila = 0; fila < notasJonathan.length; fila++) {
            for (int columna = 0; columna < notasJonathan[fila].length; columna++) {
                notasJonathan[fila][columna] = Math.random() * 10 + 0;
            }
        }
        Juanse.asignarNotas(notasJuanse);
        Susana.asignarNotas(notasSusana);
        Jonathan.asignarNotas(notasJonathan);
        System.out.println("La nota media de Juanse: " + Juanse.notaMediaFinal);
        System.out.println(Juanse.toString());
        System.out.println("Las nota media de Susana: " + Susana.notaMediaFinal);
        System.out.println(Susana.toString());
        System.out.println("Las nota media de Jonathan: " + Jonathan.notaMediaFinal);
        System.out.println(Jonathan.toString());

    }
}
 

