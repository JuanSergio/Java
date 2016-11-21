package servicios;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author juansergio
 */
public class Conexion {

    static String login = "root";
    static String password = "123456";
    static String bd = "videoclub";
    static String url = "jdbc:mysql://localhost:3306/videoclub?zeroDateTimeBehavior=convertToNull" + bd;
    static Connection conn = null;
    static ResultSet set = null;
    static Statement st = null;

    public void desconectar() {
        conn = null;
    }

    public void cerrarconexion() {
        try {
            conn.close();
            conn = null;
        } catch (Exception e) {
            System.out.println("Problema al cerrar la conexion");
        }

    }

    public void conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                System.out.println("Conexión a base de datos " + url + " ... Ok");
                //conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public ResultSet busqueda(String query) {
        try {
            String bus = "select * from " + query;
            st = conn.createStatement();
            set = st.executeQuery(bus);
            System.out.println(set);
        } catch (Exception e) {
            System.out.println("Lanzado excepcion" + e.getMessage());
        }
        return set;
    }

    public boolean actualizar(String update) {
        try {
            st = conn.createStatement();
            st.executeQuery(update);
        } catch (Exception e) {
            System.out.println("Lanzando excepcion" + e.getMessage());
            return false;
        }
        return true;
    }

    public void createTable(String name) {
        try {
            String Query = "CREATE TABLE " + name + ""
                    + "(ID VARCHAR(25),Nombre VARCHAR(50), Apellido VARCHAR(50),"
                    + " Edad VARCHAR(3), Sexo VARCHAR(1))";
            Statement st = conn.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Se ha creado la tabla " + name + " de forma exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Conexion conect = new Conexion();
        Scanner tcl = new Scanner(System.in);

        boolean flag = false;
        while (flag == false) {
            System.out.println("========BASE DE DATOS=======");
            System.out.println("1.conectar a la base de datos");
            System.out.println("2.crear tabla");
            System.out.println("3.buscar tabla");
            System.out.println("4.actualizar tabla");
            System.out.println("5.cerrar conexion");
            System.out.println("6.desconectar");
            System.out.println("0.Salir");
            System.out.println("Selecciona una opcion");

            int opcion = tcl.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1.conectar a la base de datos");

                    conect.conectar();

                    break;
                case 2:
                    System.out.println("2.crear tabla");

                    System.out.println("introduce el nombre de la tabla");
                    String tabla = tcl.next();
                    conect.createTable(tabla);

                    break;

                case 3:
                    System.out.println("3.buscar tabla");

                    System.out.println("Dime el nombre de la tabla");
                    String nombre = tcl.next();
                    conect.busqueda(nombre);

                    break;

                case 4:
                    System.out.println("4.actualizar tabla");

                    System.out.println("dime la tabla a actualizar");
                    String actualizar = tcl.next();
                    conect.actualizar(actualizar);
                    break;
                case 5:
                    System.out.println("5.cerrar conexion");

                    conect.cerrarconexion();
                    System.out.println("se ha cerrado la conexion");
                    break;
                case 6:
                    System.out.println("6.Desconectar");

                    conect.desconectar();
                    System.out.println("se ha desconectado");

                    break;

                case 0:
                    System.out.println("0.Salir");
                    flag = true;
                    break;
            }
        }

    }

}
