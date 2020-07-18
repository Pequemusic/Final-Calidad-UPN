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
public class aspirante {
    private String dni;
    private int postulacion;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String distrito;
    private String correo;
    private String celular;
    private String fijo;
    private String fecha;
    private String sexo;
    private String hijos;
    private String area;
    private String cv;

    public aspirante(String dni, int postulacion, String nombres, String apellidos, String direccion, String distrito, String correo, String celular, String fijo, String fecha, String sexo, String hijos, String area, String cv) {
        this.dni = dni;
        this.postulacion = postulacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.distrito = distrito;
        this.correo = correo;
        this.celular = celular;
        this.fijo = fijo;
        this.fecha = fecha;
        this.sexo = sexo;
        this.hijos = hijos;
        this.area = area;
        this.cv = cv;
    }

    public aspirante(String dni, String nombres, String apellidos, String direccion, String distrito, String correo, String celular, String fijo, String fecha, String sexo, String hijos , String area) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.distrito = distrito;
        this.correo = correo;
        this.celular = celular;
        this.fijo = fijo;
        this.fecha = fecha;
        this.sexo = sexo;
        this.hijos = hijos;
        this.area = area;
    }
    
        

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPostulacion() {
        return postulacion;
    }

    public void setPostulacion(int postulacion) {
        this.postulacion = postulacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHijos() {
        return hijos;
    }

    public void setHijos(String hijos) {
        this.hijos = hijos;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
    
    
}
