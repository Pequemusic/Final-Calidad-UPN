/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author VB
 */
public class cita {
    private int id;
    private String dni;
    private String tipo;
    private String fecha;
    private String hora;
    private String estado;

    public cita(int id, String dni, String tipo, String fecha, String hora, String estado) {
        this.id = id;
        this.dni = dni;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public cita(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
}
