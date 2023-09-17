/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import conexionbd.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BrigadaDAO {
    private Connection conexion;

    public BrigadaDAO() {
        // Inicializa la conexión a la base de datos en el constructor
        conexion = ConexionBD.obtenerConexion();
    }
    
    // Insertar 
    public boolean insertarBrigada(Brigada brigada) {
        
        String sql = "INSERT INTO brigada (id_jefeBrigada, nombre_brigada, zona_cobertura) VALUES (?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, brigada.getJefeBrigada().getId()); //relacion || LAVER FORANEA
            statement.setString(2, brigada.getNombre());
            statement.setString(3, brigada.getZona_cobertura());

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Actualizar la información 
    public boolean actualizarBrigada(Brigada brigada) {
        String sql = "UPDATE brigada SET id_jefebrigada = ?, nombre_brigada = ?, zona_cobertura = ? WHERE id_brigada = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, brigada.getJefeBrigada().getId()); // ID Llave Foranea
            statement.setString(2, brigada.getNombre());
            statement.setString(3, brigada.getZona_cobertura());
            statement.setInt(4, brigada.getId()); // ID importante

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Eliminar 
    public boolean eliminarBrigada(int idBrigada) {
        String sql = "DELETE FROM brigada WHERE id_brigada = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, idBrigada);

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Recuperar información
    public List<Brigada> obtenerTodosLasBrigadas() {
        List<Brigada> brigadas = new ArrayList<>();
        String sql = "SELECT b.*, j.id_jefebrigada, j.nombre_jefebrigada " +
                     "FROM brigada b " +
                     "JOIN jefe_brigada j ON b.id_jefebrigada = j.id_jefebrigada";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Brigada brigada = new Brigada();

                brigada.setId(resultSet.getInt("id_brigada"));

                // Obtener y configurar el jefe de brigada
                JefeBrigada jefeBrigada = new JefeBrigada();
                jefeBrigada.setId(resultSet.getInt("id_jefebrigada"));
                jefeBrigada.setNombre(resultSet.getString("nombre_jefebrigada"));

                brigada.setJefeBrigada(jefeBrigada);
                brigada.setNombre(resultSet.getString("nombre_brigada"));
                brigada.setZona_cobertura(resultSet.getString("zona_cobertura"));

                brigadas.add(brigada);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return brigadas;
    }   

}
