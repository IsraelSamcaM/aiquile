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
        String sql = "INSERT INTO establecimiento_de_salud ( nombre_establecimiento, "
                + "red_salud, direccion_establecimiento) VALUES (?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, centroSalud.getNombre());
            statement.setString(2, centroSalud.getRed_salud());
            statement.setString(3, centroSalud.getDireccion());

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Actualizar la información de los centros de salud existentes
    public boolean actualizarCentroSalud(Centro centroSalud) {
        String sql = "UPDATE establecimiento_de_salud SET nombre_establecimiento = ?, red_salud = ?, direccion_establecimiento = ? WHERE id_establecimiento = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, centroSalud.getNombre());
            statement.setString(2, centroSalud.getRed_salud());
            statement.setString(3, centroSalud.getDireccion());
            statement.setInt(4, centroSalud.getId());

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Eliminar centros de salud por ID
    public boolean eliminarCentroSalud(int idCentroSalud) {
        String sql = "DELETE FROM establecimiento_de_salud WHERE id_establecimiento = ?";
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
        String sql = "SELECT * FROM establecimiento_de_salud";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Centro centroSalud = new Centro();
                centroSalud.setId(resultSet.getInt("id_establecimiento"));
                centroSalud.setNombre(resultSet.getString("nombre_establecimiento"));
                centroSalud.setRed_salud(resultSet.getString("red_salud"));
                centroSalud.setDireccion(resultSet.getString("direccion_establecimiento"));
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
        String sql = "SELECT * FROM establecimiento_de_salud WHERE id_establecimiento = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, idCentroSalud);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                centroSalud = new Centro();
                centroSalud.setId(resultSet.getInt("id_establecimiento"));
                centroSalud.setNombre(resultSet.getString("nombre_establecimiento"));
                centroSalud.setRed_salud(resultSet.getString("red_salud"));
                centroSalud.setDireccion(resultSet.getString("direccion_establecimiento"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return centroSalud;
    }
    
    public List<Centro> buscarCentrosPorNombre(String nombre) {
        List<Centro> resultados = new ArrayList<>();

        // Sentencia SQL para buscar centros por nombre (ajusta la consulta a tu esquema)
        String sql = "SELECT * FROM establecimiento_de_salud WHERE (nombre_establecimiento) LIKE ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            String nombreBusc = nombre.toLowerCase();
            
            // Usamos % para buscar cualquier coincidencia de caracteres antes y después del nombre
            statement.setString(1, "%" + nombreBusc + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Centro centro = new Centro();
                centro.setId(resultSet.getInt("id_establecimiento"));
                centro.setNombre(resultSet.getString("nombre_establecimiento"));
                centro.setRed_salud(resultSet.getString("red_salud"));
                centro.setDireccion(resultSet.getString("direccion_establecimiento"));
                resultados.add(centro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultados;
    }
    
    public List<Centro> buscarCentrosPorRedSadud(String red_salud) {
        List<Centro> resultados = new ArrayList<>();

        // Sentencia SQL para buscar centros por nombre (ajusta la consulta a tu esquema)
        String sql = "SELECT * FROM establecimiento_de_salud WHERE LOWER(red_salud) LIKE ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            String red_saludBusc = red_salud.toLowerCase();
            // Usamos % para buscar cualquier coincidencia de caracteres antes y después del nombre
            statement.setString(1, "%" + red_saludBusc + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Centro centro = new Centro();
                centro.setId(resultSet.getInt("id_establecimiento"));
                centro.setNombre(resultSet.getString("nombre_establecimiento"));
                centro.setRed_salud(resultSet.getString("red_salud"));
                centro.setDireccion(resultSet.getString("direccion_establecimiento"));
                resultados.add(centro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultados;
    }
    
    public List<Centro> buscarCentrosPorDireccion(String direccion) {
        List<Centro> resultados = new ArrayList<>();

        // Sentencia SQL para buscar centros por nombre (ajusta la consulta a tu esquema)
        String sql = "SELECT * FROM establecimiento_de_salud WHERE LOWER(direccion_establecimiento) LIKE ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            // Convertimos el nombre a minúsculas antes de buscar
            String direcBusc = direccion.toLowerCase();
            
            // Usamos % para buscar cualquier coincidencia de caracteres antes y después del nombre
            statement.setString(1, "%" + direcBusc + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Centro centro = new Centro();
                centro.setId(resultSet.getInt("id_establecimiento"));
                centro.setNombre(resultSet.getString("nombre_establecimiento"));
                centro.setRed_salud(resultSet.getString("red_salud"));
                centro.setDireccion(resultSet.getString("direccion_establecimiento"));
                resultados.add(centro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultados;
    }
}
