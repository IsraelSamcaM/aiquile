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

public class CentroDAO {
    private Connection conexion;
    
    public CentroDAO() {
        // Inicializa la conexión a la base de datos en el constructor
        conexion = ConexionBD.obtenerConexion();
    }
    
    // Insertar nuevos centros de salud
        public boolean insertarCentroSalud(Centro centroSalud) {
        String sql = "INSERT INTO establecimiento_de_salud (id_establecimiento, red_salud, "
                + "nombre_estableciento, direccion_establecimiento) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, centroSalud.getId());
            statement.setString(2, centroSalud.getRed_salud());
            statement.setString(3, centroSalud.getNombre());
            statement.setString(4, centroSalud.getDireccion());

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Actualizar la información de los centros de salud existentes
    public boolean actualizarCentroSalud(Centro centroSalud) {
        String sql = "UPDATE centros_salud SET nombre = ?, direccion = ? WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, centroSalud.getNombre());
            statement.setString(2, centroSalud.getDireccion());
            statement.setInt(3, centroSalud.getId());

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Eliminar centros de salud por ID
    public boolean eliminarCentroSalud(int idCentroSalud) {
        String sql = "DELETE FROM establecimiento_salud WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, idCentroSalud);

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Recuperar información sobre los centros de salud
    public List<Centro> obtenerTodosLosCentrosSalud() {
        List<Centro> centrosSalud;
        centrosSalud = new ArrayList<>();
        String sql = "SELECT * FROM establecimiento_salud";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Centro centroSalud = new Centro();
                centroSalud.setId(resultSet.getInt("id"));
                centroSalud.setNombre(resultSet.getString("nombre"));
                centroSalud.setDireccion(resultSet.getString("direccion"));
                centrosSalud.add(centroSalud);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return centrosSalud;
    }

    // Recuperar información sobre un centro de salud específico por ID
    public Centro obtenerCentroSaludPorId(int idCentroSalud) {
        Centro centroSalud = null;
        String sql = "SELECT * FROM establecimiento_salud WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, idCentroSalud);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                centroSalud = new Centro();
                centroSalud.setId(resultSet.getInt("id"));
                centroSalud.setNombre(resultSet.getString("nombre"));
                centroSalud.setDireccion(resultSet.getString("direccion"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return centroSalud;
    }
}
