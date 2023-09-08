/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Ivan
 */
public class Centro {
    private int id;
    private String red_salud;
    private String nombre;
    private String direccion;
    
    public Centro(int id, String red_salud, String nombre, String direccion) {
        this.id = id;
        this.red_salud = red_salud;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Centro() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRed_salud() {
        return red_salud;
    }

    public void setRed_salud(String red_salud) {
        this.red_salud = red_salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
