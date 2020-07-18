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
public class login {
    private int id_empleado;
    private String usuario;
    private String password;
    private String fecha;

    public login(int id_empleado, String usuario, String password, String fecha) {
        this.id_empleado = id_empleado;
        this.usuario = usuario;
        this.password = password;
        this.fecha = fecha;
    }

    public login(String usuario, String password, String fecha) {
        this.usuario = usuario;
        this.password = password;
        this.fecha = fecha;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    
}
