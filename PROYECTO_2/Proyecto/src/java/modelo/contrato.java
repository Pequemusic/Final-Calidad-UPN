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
public class contrato {
    private int Id;
    private String dni;
    private String fechai;
    private int duracion;
    private String fechaf;
    private String area;
    private int cargo;
    private String diast;
    private String horario;
    private double sueldo;
    private double asignacion;
    private String cuenta;
    private String seguro;

    public contrato(int Id, String dni, String fechai, int duracion, String fechaf, String area, int cargo, String diast, String horario, double sueldo, double asignacion, String cuenta, String seguro) {
        this.Id = Id;
        this.dni = dni;
        this.fechai = fechai;
        this.duracion = duracion;
        this.fechaf = fechaf;
        this.area = area;
        this.cargo = cargo;
        this.diast = diast;
        this.horario = horario;
        this.sueldo = sueldo;
        this.asignacion = asignacion;
        this.cuenta = cuenta;
        this.seguro = seguro;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechai() {
        return fechai;
    }

    public void setFechai(String fechai) {
        this.fechai = fechai;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getFechaf() {
        return fechaf;
    }

    public void setFechaf(String fechaf) {
        this.fechaf = fechaf;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getDiast() {
        return diast;
    }

    public void setDiast(String diast) {
        this.diast = diast;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(double asignacion) {
        this.asignacion = asignacion;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    
}
