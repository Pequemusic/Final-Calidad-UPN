/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.conexion;
import fecha.Fecha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.asistencia;
import modelo.aspirante;
import modelo.cita;

/**
 *
 * @author VB
 */
public class Controlador_asistencia {
        
    public ArrayList<asistencia> listarTablaAyuda (String dni){
        String dnii = validarEmpleado(dni);
        ArrayList<asistencia> lista = new ArrayList<>();
        try{
            Connection cn = new conexion().getConnection();                    
                String sql="select * from asistencia_ayuda where id_empleado = ?";
                PreparedStatement pst = cn.prepareCall(sql);
                pst.setString(1, dnii);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    int id = rs.getInt(1);
                    int id_empleado = rs.getInt(2);
                    String fecha = rs.getString(3);
                    String descripcion = descripcion(rs.getInt(4));
                    String estado = estado(rs.getInt(5));
                    
                    asistencia a = new asistencia(id, id_empleado, fecha, descripcion, estado);
                    lista.add(a);
                }
        }catch(Exception e) {}
        
        return lista;
    }
    
    public int insertarAsistencia (asistencia a){
        int r = 0;
        try{
                Connection cn = new conexion().getConnection();                    
                String sql="insert into asistencias values(?,?,?,?,?)";
                PreparedStatement pst = cn.prepareCall(sql);
                pst.setString(1, null);
                pst.setInt(2, a.getId_asistencia_ayuda());
                pst.setInt(3, a.getId_empleado());
                pst.setString(4, a.getJustificacion());
                pst.setString(5, a.getCv());
                r = pst.executeUpdate();
        }catch(Exception e) {}
        
        return r;
    }
    
    public String validarEmpleado (String id){
        String trabajador = "";
        boolean existe = false;
        try{
            Connection cn = new conexion().getConnection();                    
                String sql="select id_empleado from empleados where dni =?";
                PreparedStatement pst = cn.prepareCall(sql);
                pst.setString(1, id);
                ResultSet rs = pst.executeQuery();                   
                    while(rs.next()){
                        trabajador = rs.getString(1);
                    }
        }catch(Exception e) {}
        
        return trabajador;
    }
    
    public String descripcion(int a){
        if(a == 0) return "Ok";
        if(a == 1) return "Tardanza";
        else return "Falta";
    }
    
    public String estado(int a){
        if(a == 0) return "--";
        if(a == 1) return "Justificada";
        else return "No Justificada";
    }
    
}
