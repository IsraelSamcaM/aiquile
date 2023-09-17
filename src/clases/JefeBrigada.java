/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Ivan
 */
public class JefeBrigada {
    private int id;
    private String nombre;
    private String ci;
    private String direccion;
    private String telefono;

    public JefeBrigada() {
    }

    public JefeBrigada(int id, String nombre, String ci, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.ci = ci;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre;  // Aquí decides cómo deseas representar el objeto
    }

    public String getNombre() {
        return nombre;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCi() {
        return ci;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}
