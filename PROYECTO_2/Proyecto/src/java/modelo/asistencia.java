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
public class asistencia {
    
    private int id_asistencia;
    private int id_asistencia_ayuda;
    private int id_empleado;
    private String justificacion;
    private String cv;
    
    private String fecha;
    private String descripcion;
    private String estado_ayuda;
    
    public asistencia(int id_asistencia, int id_asistencia_ayuda, int id_empleado, String justificacion, String cv) {
        this.id_asistencia = id_asistencia;
        this.id_asistencia_ayuda = id_asistencia_ayuda;
        this.id_empleado = id_empleado;
        this.justificacion = justificacion;
        this.cv = cv;
    }

    public asistencia(int id_asistencia_ayuda, int id_empleado, String fecha, String descripcion, String estado_ayuda) {
        this.id_asistencia_ayuda = id_asistencia_ayuda;
        this.id_empleado = id_empleado;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado_ayuda = estado_ayuda;
    }

    public int getId_asistencia() {
        return id_asistencia;
    }

    public void setId_asistencia(int id_asistencia) {
        this.id_asistencia = id_asistencia;
    }

    public int getId_asistencia_ayuda() {
        return id_asistencia_ayuda;
    }

    public void setId_asistencia_ayuda(int id_asistencia_ayuda) {
        this.id_asistencia_ayuda = id_asistencia_ayuda;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String getCv() {
        return cv;
    }
    
    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado_ayuda() {
        return estado_ayuda;
    }

    public void setEstado_ayuda(String estado_ayuda) {
        this.estado_ayuda = estado_ayuda;
    }
    
    
    

    
    
    
}
