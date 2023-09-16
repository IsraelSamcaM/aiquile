/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Ivan
 */
public class Usuario {
    private int id;
    private String nombre;
    private String ci;
    private String telefono;
    private String contraseña;
    private String tipo;

    public Usuario(int id, String nombre, String ci, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.ci = ci;
        this.contraseña = contraseña;
    }
    
    public Usuario(){   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCi() {
        return ci;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
}
