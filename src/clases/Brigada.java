/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.List;

/**
 *
 * @author Ivan
 */
public class Brigada {
    private int id;
    private String nombre;
    private String zona_cobertura;
    private JefeBrigada JefeBrigada;
    private List<Rociador> rociador;
    
    public Brigada() {
    }

    public Brigada(int id, String nombre, String zona_alcance, JefeBrigada JefeBrigada, List<Rociador> rociador) {
        this.id = id;
        this.nombre = nombre;
        this.zona_cobertura = zona_alcance;
        this.JefeBrigada = JefeBrigada;
        this.rociador = rociador;
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

    public String getNombre() {
        return nombre;
    }

    public void setZona_cobertura(String zona_cobertura) {
        this.zona_cobertura = zona_cobertura;
    }

    public String getZona_cobertura() {
        return zona_cobertura;
    }

    public void setJefeBrigada(JefeBrigada JefeBrigada) {
        this.JefeBrigada = JefeBrigada;
    }

    public JefeBrigada getJefeBrigada() {
        return JefeBrigada;
    }

    public void setRociador(List<Rociador> rociador) {
        this.rociador = rociador;
    }

    public List<Rociador> getRociador() {
        return rociador;
    }
}
