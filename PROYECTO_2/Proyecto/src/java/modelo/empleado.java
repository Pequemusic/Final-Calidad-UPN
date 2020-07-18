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
public class empleado {
    private String id_empleado;
    private String id_contrato;
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String distrito;
    private String correo;
    private String celular;
    private String fijo;
    private String fecha;
    private String sexo;
    private String hijos;
    private String area;

    public empleado(String id_empleado, String id_contrato, String dni, String nombre, String apellido, String direccion, String distrito, String correo, String celular, String fijo, String fecha, String sexo, String hijos, String area) {
        this.id_empleado = id_empleado;
        this.id_contrato = id_contrato;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public empleado(String id_empleado, String nombre, String apellido) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(String id_contrato) {
        this.id_contrato = id_contrato;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    
    
    
    
}
