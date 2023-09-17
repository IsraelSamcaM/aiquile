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

public class JefeBrigadaDAO {
    private Connection conexion;
    
    public JefeBrigadaDAO() {
        // Inicializa la conexión a la base de datos en el constructor
        conexion = ConexionBD.obtenerConexion();
    }
    
    // Insertar 
    public boolean insertarJefeBrigada(JefeBrigada jefeBrigada) {
        String sql = "INSERT INTO jefe_Brigada ( nombre_jefeBrigada, "
                + "ci_jefeBrigada, dir_jefeBrigada, telefono_jefeBrigada) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, jefeBrigada.getNombre());
            statement.setString(2, jefeBrigada.getCi());
            statement.setString(3, jefeBrigada.getDireccion());
            statement.setString(4, jefeBrigada.getTelefono());

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Actualizar la información 
    public boolean actualizarJefeBrigada(JefeBrigada jefeBrigada) {
        String sql = "UPDATE jefe_Brigada SET nombre_jefeBrigada = ?, ci_jefeBrigada = ?, dir_jefeBrigada = ?," 
            + " telefono_jefeBrigada = ? WHERE id_jefeBrigada = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, jefeBrigada.getNombre());
            statement.setString(2, jefeBrigada.getCi());
            statement.setString(3, jefeBrigada.getDireccion());
            statement.setString(4, jefeBrigada.getTelefono());
            statement.setInt(5, jefeBrigada.getId()); // ID importante

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Eliminar 
    public boolean eliminarJefeBrigada(int idJefeBrigada) {
        String sql = "DELETE FROM jefe_Brigada WHERE id_jefeBrigada = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, idJefeBrigada);

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Recuperar información
    public List<JefeBrigada> obtenerTodosLosJefeBrigadas() {
        List<JefeBrigada> jefeBrigadas;
        jefeBrigadas = new ArrayList<>();
        String sql = "SELECT * FROM jefe_Brigada";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                JefeBrigada jefeBrigada = new JefeBrigada();
                jefeBrigada.setId(resultSet.getInt("id_jefeBrigada"));
                jefeBrigada.setNombre(resultSet.getString("nombre_jefeBrigada"));
                jefeBrigada.setCi(resultSet.getString("ci_jefeBrigada")); 
                jefeBrigada.setDireccion(resultSet.getString("dir_jefeBrigada"));
                jefeBrigada.setTelefono(resultSet.getString("telefono_jefeBrigada"));
                jefeBrigadas.add(jefeBrigada);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jefeBrigadas;
    }
    
    // Recuperar información por ID
    public JefeBrigada obtenerJefeBrigadaPorId(int idJefeBrigada) {
        JefeBrigada jefeBrigada = null;
        String sql = "SELECT * FROM jefe_Brigada WHERE id_jefeBrigada = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, idJefeBrigada);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                jefeBrigada = new JefeBrigada();
                jefeBrigada.setId(resultSet.getInt("id_jefeBrigada"));
                jefeBrigada.setNombre(resultSet.getString("nombre_jefeBrigada"));
                jefeBrigada.setCi(resultSet.getString("ci_jefeBrigada")); 
                jefeBrigada.setDireccion(resultSet.getString("dir_jefeBrigada"));
                jefeBrigada.setTelefono(resultSet.getString("telefono_jefeBrigada"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jefeBrigada;
    }
    
    public List<JefeBrigada> buscarJefeBrigadasPorNombre(String nombre) {
        List<JefeBrigada> resultados = new ArrayList<>();

        // Sentencia SQL para buscar jefeBrigadas por nombre (ajusta la consulta a tu esquema)
        String sql = "SELECT * FROM jefe_Brigada WHERE (nombre_jefeBrigada) LIKE ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            String nombreBusc = nombre.toLowerCase();
            
            // Usamos % para buscar cualquier coincidencia de caracteres antes y después del nombre
            statement.setString(1, "%" + nombreBusc + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                JefeBrigada jefeBrigada = new JefeBrigada();
                jefeBrigada.setId(resultSet.getInt("id_jefeBrigada"));
                jefeBrigada.setNombre(resultSet.getString("nombre_jefeBrigada"));
                jefeBrigada.setCi(resultSet.getString("ci_jefeBrigada"));
                jefeBrigada.setDireccion(resultSet.getString("dir_jefeBrigada"));
                jefeBrigada.setTelefono(resultSet.getString("telefono_jefeBrigada"));
                resultados.add(jefeBrigada);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultados;
    }
    
    public List<JefeBrigada> buscarJefeBrigadasCI(String ci) {
        List<JefeBrigada> resultados = new ArrayList<>();

        // Sentencia SQL para buscar jefeBrigadas por nombre (ajusta la consulta a tu esquema)
        String sql = "SELECT * FROM jefe_Brigada WHERE (nombre_jefeBrigada) LIKE ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            String nombreBusc = ci.toLowerCase();
            
            // Usamos % para buscar cualquier coincidencia de caracteres antes y después del nombre
            statement.setString(1, "%" + nombreBusc + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                JefeBrigada jefeBrigada = new JefeBrigada();
                jefeBrigada.setId(resultSet.getInt("id_jefeBrigada"));
                jefeBrigada.setNombre(resultSet.getString("nombre_jefeBrigada"));
                jefeBrigada.setCi(resultSet.getString("ci_jefeBrigada"));
                jefeBrigada.setDireccion(resultSet.getString("dir_jefeBrigada"));
                jefeBrigada.setTelefono(resultSet.getString("telefono_jefeBrigada"));
                resultados.add(jefeBrigada);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultados;
    }
    
    public List<JefeBrigada> buscarJefeBrigadasTipo(String tipo) {
        List<JefeBrigada> resultados = new ArrayList<>();

        // Sentencia SQL para buscar jefeBrigadas por nombre (ajusta la consulta a tu esquema)
        String sql = "SELECT * FROM jefe_Brigada WHERE (nombre_jefeBrigada) LIKE ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            String nombreBusc = tipo.toLowerCase();
            
            // Usamos % para buscar cualquier coincidencia de caracteres antes y después del nombre
            statement.setString(1, "%" + nombreBusc + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                JefeBrigada jefeBrigada = new JefeBrigada();
                jefeBrigada.setId(resultSet.getInt("id_jefeBrigada"));
                jefeBrigada.setNombre(resultSet.getString("nombre_jefeBrigada"));
                jefeBrigada.setCi(resultSet.getString("ci_jefeBrigada"));
                jefeBrigada.setDireccion(resultSet.getString("dir_jefeBrigada"));
                jefeBrigada.setTelefono(resultSet.getString("telefono_jefeBrigada"));
                resultados.add(jefeBrigada);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultados;
    }
}
