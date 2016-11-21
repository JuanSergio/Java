package ejercicio01;

public class EjemploExcepciones {

    public static int devuelveEntero(int num) {
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepcion");
            }
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(devuelveEntero(2
        ));
    }

}
