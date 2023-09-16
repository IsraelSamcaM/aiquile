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

public class UsuarioDAO {
    private Connection conexion;
    
    public UsuarioDAO() {
        // Inicializa la conexión a la base de datos en el constructor
        conexion = ConexionBD.obtenerConexion();
    }
    
    // Insertar 
    public boolean insertarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario ( nombre_usr, "
                + "ci_usr, telefono_usr, contrasenia_usr, tipo_usr) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getCi());
            statement.setString(3, usuario.getTelefono());
            statement.setString(4, usuario.getContraseña());
            statement.setString(5, usuario.getTipo());

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Actualizar la información 
    public boolean actualizarUsuario(Usuario usuario) {
        String sql = "UPDATE usuario SET nombre_usr = ?, ci_usr = ?, telefono_usr = ?, "
                + "contrasenia_usr = ?, tipo_usr = ? WHERE id_usuario = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getCi());
            statement.setString(3, usuario.getTelefono());
            statement.setString(4, usuario.getContraseña());
            statement.setString(5, usuario.getTipo());
            statement.setInt(6, usuario.getId());

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Eliminar 
    public boolean eliminarUsuario(int idUsuario) {
        String sql = "DELETE FROM usuario WHERE id_usuario = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, idUsuario);

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Recuperar información
    public List<Usuario> obtenerTodosLosUsuarios() {
        List<Usuario> usuarios;
        usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultSet.getInt("id_usuario"));
                usuario.setNombre(resultSet.getString("nombre_usr"));
                usuario.setCi(resultSet.getString("ci_usr")); 
                usuario.setTelefono(resultSet.getString("telefono_usr"));
                usuario.setContraseña(resultSet.getString("contrasenia_usr"));
                usuario.setTipo(resultSet.getString("tipo_usr"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    // Recuperar información por ID
    public Usuario obtenerUsuarioSaludPorId(int idUsuario) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuario WHERE id_usuario = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, idUsuario);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                usuario = new Usuario();
                usuario.setId(resultSet.getInt("id_usuario"));
                usuario.setNombre(resultSet.getString("nombre_usr"));
                usuario.setCi(resultSet.getString("ci_usr"));
                usuario.setTelefono(resultSet.getString("telefono_usr"));
                usuario.setContraseña(resultSet.getString("contrasenia_usr"));
                usuario.setTipo(resultSet.getString("tipo_usr"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }
    
    public List<Usuario> buscarUsuariosPorNombre(String nombre) {
        List<Usuario> resultados = new ArrayList<>();

        // Sentencia SQL para buscar usuarios por nombre (ajusta la consulta a tu esquema)
        String sql = "SELECT * FROM usuario WHERE (nombre_usr) LIKE ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            String nombreBusc = nombre.toLowerCase();
            
            // Usamos % para buscar cualquier coincidencia de caracteres antes y después del nombre
            statement.setString(1, "%" + nombreBusc + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultSet.getInt("id_usuario"));
                usuario.setNombre(resultSet.getString("nombre_usr"));
                usuario.setCi(resultSet.getString("ci_usr"));
                usuario.setTelefono(resultSet.getString("telefono_usr"));
                usuario.setContraseña(resultSet.getString("contrasenia_usr"));
                usuario.setTipo(resultSet.getString("tipo_usr"));
                resultados.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultados;
    }
    
    public List<Usuario> buscarUsuariosCI(String ci) {
        List<Usuario> resultados = new ArrayList<>();

        // Sentencia SQL para buscar usuarios por nombre (ajusta la consulta a tu esquema)
        String sql = "SELECT * FROM usuario WHERE (nombre_usr) LIKE ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            String nombreBusc = ci.toLowerCase();
            
            // Usamos % para buscar cualquier coincidencia de caracteres antes y después del nombre
            statement.setString(1, "%" + nombreBusc + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultSet.getInt("id_usuario"));
                usuario.setNombre(resultSet.getString("nombre_usr"));
                usuario.setCi(resultSet.getString("ci_usr"));
                usuario.setTelefono(resultSet.getString("telefono_usr"));
                usuario.setContraseña(resultSet.getString("contrasenia_usr"));
                usuario.setTipo(resultSet.getString("tipo_usr"));
                resultados.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultados;
    }
    
    public List<Usuario> buscarUsuariosTipo(String tipo) {
        List<Usuario> resultados = new ArrayList<>();

        // Sentencia SQL para buscar usuarios por nombre (ajusta la consulta a tu esquema)
        String sql = "SELECT * FROM usuario WHERE (nombre_usr) LIKE ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            String nombreBusc = tipo.toLowerCase();
            
            // Usamos % para buscar cualquier coincidencia de caracteres antes y después del nombre
            statement.setString(1, "%" + nombreBusc + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultSet.getInt("id_usuario"));
                usuario.setNombre(resultSet.getString("nombre_usr"));
                usuario.setCi(resultSet.getString("ci_usr"));
                usuario.setTelefono(resultSet.getString("telefono_usr"));
                usuario.setContraseña(resultSet.getString("contrasenia_usr"));
                usuario.setTipo(resultSet.getString("tipo_usr"));
                resultados.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultados;
    }
}
