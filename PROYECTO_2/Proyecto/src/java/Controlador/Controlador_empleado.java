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
import modelo.area;
import modelo.aspirante;
import modelo.empleado;

/**
 *
 * @author VB
 */
public class Controlador_empleado {
    
    public ArrayList<empleado> listar (){
        ArrayList<empleado> lista = new ArrayList<>();
        try{
            Connection cn = new conexion().getConnection();                    
                String sql="select * from empleados order by id_empleado asc";
                Statement stt = cn.createStatement();
                ResultSet rs = stt.executeQuery(sql);                    
                    while(rs.next()){
                         String id_empleado = rs.getString(1);
                         String id_contrato = rs.getString(2);
                         String dni = rs.getString(3);
                         String nombre = rs.getString(4);
                         String apellido= rs.getString(5);
                         String direccion= rs.getString(6);
                         String distrito= rs.getString(7);
                         String correo= rs.getString(8);
                         String celular= rs.getString(9);
                         String fijo= rs.getString(10);
                         String fecha= rs.getString(11);
                         String sexo= obtener_Sexo(Integer.parseInt(rs.getString(12)));
                         String hijos= rs.getString(13);                         
                         String area= obtenerDescripcion_Area(Integer.parseInt(rs.getString(14)));  
                         empleado a = new empleado(id_empleado, id_contrato, dni, nombre, apellido, direccion, distrito, correo, celular, fijo, fecha, sexo, hijos, area);
                         lista.add(a);
                    }
        }catch(Exception e) {}
        
        return lista;
    }
    
    public int insertar (String dni){
        int r = 0;
        aspirante a = ObtenerDatosAspirante(dni);
        int IdContrato = Integer.parseInt(ObtenerIdContrato());
                try{ 
                    Connection cn = new conexion().getConnection();                    
                    PreparedStatement sta = cn.prepareCall("insert into empleados values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    sta.setString(1, null);
                    sta.setInt(2, IdContrato);
                    sta.setString(3, a.getDni());
                    sta.setString(4, a.getNombres());
                    sta.setString(5, a.getApellidos());
                    sta.setString(6, a.getDireccion());
                    sta.setString(7, a.getDistrito());
                    sta.setString(8, a.getCorreo());
                    sta.setString(9, a.getCelular());
                    sta.setString(10, a.getFijo());
                    sta.setString(11, a.getFecha());
                    sta.setString(12, a.getSexo());
                    sta.setString(13, a.getHijos());
                    sta.setString(14, a.getArea());
                    
                    r = sta.executeUpdate();
                } catch (Exception e) {
                }
        return r;
    }
    
    public String obtener_Sexo(int opcion){
        String sexo = null;
            if(opcion == 0) sexo = "VARON";
            if(opcion == 1) sexo = "MUJER";
            if(opcion == 2) sexo = "NO ESPECIFICA";
        
        return sexo;        
    }
    
    public String obtenerDescripcion_Area(int Id){
        String a = null;
        if(Id != 0){
            try{
            Connection cn = new conexion().getConnection();     
            PreparedStatement pst = cn.prepareCall("select descripcion_area from areas where id_area=?");
            pst.setString(1,String.valueOf(Id));
            ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                        a = rs.getString(1);
                    }
            }catch(Exception e) {}
        
        }
    return a;
    }
    
    public aspirante ObtenerDatosAspirante(String dni){
        aspirante a = null ;
            try{
            Connection cn = new conexion().getConnection();     
            PreparedStatement pst = cn.prepareCall("select * from aspirantes where dni_as=?");
            pst.setString(1,dni);
            ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                       a = new aspirante(rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5), 
                               rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), 
                               rs.getString(10), rs.getString(11), rs.getString(12),rs.getString(13));
                    }
            }catch(Exception e) {}
    return a;    
    }
    
    public String ObtenerIdContrato (){
        String id = null;
        try{
            Connection cn = new conexion().getConnection();                    
                String sql="select id_contrato from contratos order by id_contrato desc limit 1";
                Statement stt = cn.createStatement();
                ResultSet rs = stt.executeQuery(sql);                    
                    while(rs.next()){
                            id = rs.getString(1);
                    }
        }catch(Exception e) {}
        
        return id;
    }
    
    public String validarEmpleado (int id){
        String trabajador = "";
        boolean existe = false;
        try{
            Connection cn = new conexion().getConnection();                    
                String sql="select id_empleado from empleados where dni =?";
                PreparedStatement pst = cn.prepareCall(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery();                   
                    while(rs.next()){
                        trabajador = rs.getString(1);
                    }
        }catch(Exception e) {}
        
        return trabajador;
    }
    
    
}
