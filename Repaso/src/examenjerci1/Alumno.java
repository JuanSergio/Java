package examenjerci1;

public class Alumno {

    private Asignatura asignatura1, asignatura2, asignatura3;
    private NotaAsignatura notaAsignatura1, notaAsignatura2, notaAsignatura3;

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public void AsignaNota1(double nota) {
        notaAsignatura1 = new NotaAsignatura(nota, asignatura1);
    }

    public void AsignaNota2(double nota) {
        notaAsignatura2 = new NotaAsignatura(nota, asignatura2);
    }

    public void AsignaNota3(double nota) {
        notaAsignatura3 = new NotaAsignatura(nota, asignatura3);
    }

    public double getNotaMedia() {
        return (notaAsignatura1.getNota() + notaAsignatura2.getNota() + notaAsignatura3.getNota()) / 3;
    }
}
