
package clases;

import java.sql.*;

public class Conectar {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://127.0.0.1/Videoclub","root","");
        }catch(SQLException e){
            System.out.println("Error de mySQL - " +e.getMessage());
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(Exception e) {
            System.out.print("Se ha encontrado el siguiente error: " +e.getMessage());
        }
        return conectar;
    }
}
