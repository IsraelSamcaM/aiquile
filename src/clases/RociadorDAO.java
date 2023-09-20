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

public class RociadorDAO {
    private Connection conexion;
    
    public RociadorDAO() {
        // Inicializa la conexión a la base de datos en el constructor
        conexion = ConexionBD.obtenerConexion();
    }
    
    // Insertar 
    public boolean insertarRociador(Rociador rociador) {
        String sql = "INSERT INTO rociador (id_brigada, nombre_rociador, "
                + "ci_rociador, dir_rociador, telefono_rociador) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, rociador.getBrigada().getId()); //relacion || LAVER FORANEA
            
            statement.setString(2, rociador.getNombre());
            statement.setString(3, rociador.getCi());
            statement.setString(4, rociador.getDireccion());
            statement.setString(5, rociador.getTelefono());

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Actualizar la información 
    public boolean actualizarRociador(Rociador rociador) {
        String sql = "UPDATE rociador SET id_brigada = ?, nombre_rociador = ?, ci_rociador = ?, dir_rociador = ?," 
            + " telefono_rociador = ? WHERE id_rociador = ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, rociador.getBrigada().getId()); // ID Llave Foranea

            statement.setString(2, rociador.getNombre());
            statement.setString(3, rociador.getCi());
            statement.setString(4, rociador.getDireccion());
            statement.setString(5, rociador.getTelefono());

            statement.setInt(6, rociador.getId()); // ID importante

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Eliminar 
    public boolean eliminarRociador(int idRociador) {
        String sql = "DELETE FROM rociador WHERE id_rociador = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, idRociador);

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Recuperar información 
    public List<Rociador> obtenerTodosLosRociadores() {
        List<Rociador> rociadores = new ArrayList<>();
        String sql = "SELECT r.*, b.id_brigada, b.nombre_brigada " +
             "FROM rociador r " +
             "JOIN brigada b ON r.id_brigada = b.id_brigada";


        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Rociador rociador = new Rociador();

                rociador.setId(resultSet.getInt("id_rociador"));

                // Obtener y configurar el jefe de brigada
                Brigada brigada = new Brigada();
                brigada.setId(resultSet.getInt("id_brigada"));
                brigada.setNombre(resultSet.getString("nombre_brigada"));

                rociador.setBrigada(brigada);
                rociador.setNombre(resultSet.getString("nombre_rociador"));
                rociador.setCi(resultSet.getString("ci_rociador"));
                rociador.setDireccion(resultSet.getString("dir_rociador"));
                rociador.setTelefono(resultSet.getString("telefono_rociador"));

                rociadores.add(rociador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rociadores;
    }   
    
    public List<Rociador> buscarRociadoresPorNombre(String nombre) {
        List<Rociador> resultados = new ArrayList<>();

        // Sentencia SQL para buscar rociadors por nombre (ajusta la consulta a tu esquema)
        String sql = "SELECT * FROM rociador WHERE (nombre_rociador) LIKE ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            String nombreBusc = nombre.toLowerCase();
            
            // Usamos % para buscar cualquier coincidencia de caracteres antes y después del nombre
            statement.setString(1, "%" + nombreBusc + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Rociador rociador = new Rociador();
                rociador.setId(resultSet.getInt("id_rociador"));
                rociador.setNombre(resultSet.getString("nombre_rociador"));
                rociador.setCi(resultSet.getString("ci_rociador"));
                rociador.setDireccion(resultSet.getString("dir_rociador"));
                rociador.setTelefono(resultSet.getString("telefono_rociador"));
                resultados.add(rociador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultados;
    }
    
    public List<Rociador> buscarRociadoresCI(String ci) {
        List<Rociador> resultados = new ArrayList<>();

        // Sentencia SQL para buscar rociadors por nombre (ajusta la consulta a tu esquema)
        String sql = "SELECT * FROM rociador WHERE (nombre_rociador) LIKE ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            String nombreBusc = ci.toLowerCase();
            
            // Usamos % para buscar cualquier coincidencia de caracteres antes y después del nombre
            statement.setString(1, "%" + nombreBusc + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Rociador rociador = new Rociador();
                rociador.setId(resultSet.getInt("id_rociador"));
                rociador.setNombre(resultSet.getString("nombre_rociador"));
                rociador.setCi(resultSet.getString("ci_rociador"));
                rociador.setDireccion(resultSet.getString("dir_rociador"));
                rociador.setTelefono(resultSet.getString("telefono_rociador"));
                resultados.add(rociador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultados;
    }
    
     public List<Rociador> buscarRociadoresTipo(String tipo) {
        List<Rociador> resultados = new ArrayList<>();

        // Sentencia SQL para buscar rociadors por nombre (ajusta la consulta a tu esquema)
        String sql = "SELECT * FROM rociador WHERE (nombre_rociador) LIKE ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            String nombreBusc = tipo.toLowerCase();
            
            // Usamos % para buscar cualquier coincidencia de caracteres antes y después del nombre
            statement.setString(1, "%" + nombreBusc + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Rociador rociador = new Rociador();
                rociador.setId(resultSet.getInt("id_rociador"));
                rociador.setNombre(resultSet.getString("nombre_rociador"));
                rociador.setCi(resultSet.getString("ci_rociador"));
                rociador.setDireccion(resultSet.getString("dir_rociador"));
                rociador.setTelefono(resultSet.getString("telefono_rociador"));
                resultados.add(rociador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultados;
    }
}
