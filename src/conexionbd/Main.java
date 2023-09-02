package conexionbd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection conexion = ConexionBD.obtenerConexion();
        if (conexion != null) {
            try {
                // Ejemplo: Consulta simple
                Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM brigada");
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nombre = resultSet.getString("nombre");
                    System.out.println("ID: " + id + ", Nombre: " + nombre);
                }

                // Cierra los recursos
                resultSet.close();
                statement.close();
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }
    }
}
