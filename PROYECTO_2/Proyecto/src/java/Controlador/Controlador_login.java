/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.conexion;
import Enncriptar.encriptar;
import fecha.Fecha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import modelo.area;
import modelo.aspirante;
import modelo.empleado;
import modelo.login;

/**
 *
 * @author VB
 */
public class Controlador_login {
    
//    public ArrayList<empleado> listar (){
//        ArrayList<empleado> lista = new ArrayList<>();
//        try{
//            Connection cn = new conexion().getConnection();                    
//                String sql="select * from empleados order by id_empleado asc";
//                Statement stt = cn.createStatement();
//                ResultSet rs = stt.executeQuery(sql);                    
//                    while(rs.next()){
//                         String id_empleado = rs.getString(1);
//                         String id_contrato = rs.getString(2);
//                         String dni = rs.getString(3);
//                         String nombre = rs.getString(4);
//                         String apellido= rs.getString(5);
//                         String direccion= rs.getString(6);
//                         String distrito= rs.getString(7);
//                         String correo= rs.getString(8);
//                         String celular= rs.getString(9);
//                         String fijo= rs.getString(10);
//                         String fecha= rs.getString(11);
//                         String sexo= obtener_Sexo(Integer.parseInt(rs.getString(12)));
//                         String hijos= rs.getString(13);                         
//                         String area= obtenerDescripcion_Area(Integer.parseInt(rs.getString(14)));  
//                         empleado a = new empleado(id_empleado, id_contrato, dni, nombre, apellido, direccion, distrito, correo, celular, fijo, fecha, sexo, hijos, area);
//                         lista.add(a);
//                    }
//        }catch(Exception e) {}
//        
//        return lista;
//    }
    
    public int insertar (){
        int r = 0;
            empleado a = ObtenerIdEmpleado();
                try{ 
                    Connection cn = new conexion().getConnection();                    
                    PreparedStatement sta = cn.prepareCall("insert into login_data values (?,?,?,?,?,?)");
                    sta.setString(1, a.getId_empleado());
                    sta.setString(2, ObtenerUsuario(a));
                    sta.setString(3, new encriptar().encriptar(ObtenerUsuario(a)));   
                    sta.setString(4, new Fecha().getDate()); 
                    sta.setInt(5, 0); 
                    sta.setInt(6, obtenerRangoContrato()); 
                    r = sta.executeUpdate();
                } catch (Exception e) {
                }
        return r;
    }  
    
    
    public String ObtenerUsuario(empleado a){
        String usuario = "";
            for(int i=0 ; i < (a.getNombre().length()); i++ ){
                if(!String.valueOf(a.getNombre().charAt(i)).equals(" ")){
                    usuario += String.valueOf(a.getNombre().charAt(i));
                }
                else break;
            }
            for(int i=0 ; i < (a.getApellido().length()); i++ ){
                if(!String.valueOf(a.getApellido().charAt(i)).equals(" ")){
                    usuario += String.valueOf(a.getApellido().charAt(i));
                }
                else break;
            }
        return usuario;
    }
        
    public empleado ObtenerIdEmpleado (){
        empleado a = null;
        try{
            Connection cn = new conexion().getConnection();                    
                String sql="select id_empleado,nombres,apellidos from empleados order by id_empleado desc limit 1";
                Statement stt = cn.createStatement();
                ResultSet rs = stt.executeQuery(sql);                    
                    while(rs.next()){
                            String id = rs.getString(1);
                            String nombre = rs.getString(2);
                            String apellido = rs.getString(3);
                        a = new empleado(id, nombre, apellido);
                    }
        }catch(Exception e) {}
        
        return a;
    }
    
    public int obtenerRangoContrato(){
        int cargo = -1;
       try{
            Connection cn = new conexion().getConnection();                    
                String sql="select cargo_con from contratos order by id_contrato desc limit 1";
                Statement stt = cn.createStatement();
                ResultSet rs = stt.executeQuery(sql);                    
                    while(rs.next()){
                        cargo = rs.getInt(1);
                    }
        }catch(Exception e) {}
       return cargo;
    }
    
    public String obtenerDatosDeIngreso (int id){
        String trabajador = "";
        try{
            Connection cn = new conexion().getConnection();                    
                String sql="select nombres,apellidos from empleados where id_empleado =?";
                PreparedStatement pst = cn.prepareCall(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery();                   
                    while(rs.next()){
                        trabajador += rs.getString(1)+" " +rs.getString(2);
                    }
        }catch(Exception e) {}
        
        return trabajador;
    }
    
    public String validarIngreso(login a){
        String mensaje="";
        boolean ingreso = false;
        int id = 0;
        String fecha = "";
        int estado = -1;
        int cargo = -1;
            try{
            Connection cn = new conexion().getConnection();                    
                String sql="select id_empleado, fecha_log ,estado_log, rango_log from login_data where usuario_log=? and clave_log=?";
                PreparedStatement pst = cn.prepareCall(sql);
                pst.setString(1, a.getUsuario());
                pst.setString(2, new encriptar().encriptar(a.getPassword()));
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {                    
                    ingreso = true;
                    id = rs.getInt(1);
                    fecha = rs.getString(2);
                    estado = rs.getInt(3);
                    cargo = rs.getInt(4);
                }
            }catch(Exception e) {}
            
            if(ingreso){
                mensaje += ""+obtenerDatosDeIngreso(id)+"@"+fecha+"*"+estado+"/"+cargo;
            }
            
        return mensaje;
    }
    
    public String ValidarFecha(String fecha, int estado){ 
        String bandera = "";
        boolean menor = false;
    
        String fechaActual = new Fecha().getDate();
        System.out.println(fechaActual);
        String day = String.valueOf(fecha.charAt(8)) + String.valueOf(fecha.charAt(9));
        String month = String.valueOf(fecha.charAt(5)) + String.valueOf(fecha.charAt(6));
        String year= String.valueOf(fecha.charAt(0)) + String.valueOf(fecha.charAt(1))+String.valueOf(fecha.charAt(2))+String.valueOf(fecha.charAt(3));
        
        String dayy = String.valueOf(fechaActual.charAt(8)) + String.valueOf(fechaActual.charAt(9));
        String monthh = String.valueOf(fechaActual.charAt(5)) + String.valueOf(fechaActual.charAt(6));
        String yearr= String.valueOf(fechaActual.charAt(0)) + String.valueOf(fechaActual.charAt(1))+String.valueOf(fechaActual.charAt(2))+String.valueOf(fechaActual.charAt(3));
        System.out.println(dayy);System.out.println(day);
        
            int fechafinal = Integer.parseInt(dayy) - Integer.parseInt(day);
                if(fechafinal<0){
                    fechafinal += 30;
                }
            if(fechafinal == 1 && estado ==0) bandera += "cuenta con un dia para cambiar su contraseña";
            if(fechafinal == 0 && estado ==0) bandera += "cuenta con dos dias para cambiar su contraseña";
            if(fechafinal == 2 && estado ==0) bandera += "tiene hasta hoy para cambiar su contraseña";
            if(fechafinal < 0 || fechafinal > 2 && estado ==0) bandera += "el plazo para cambiar contraseña vencio";
            System.out.println(fechafinal);
        return bandera;
    }
    
    public List<String> separarMensaje(String mensaje){
        List<String> lista = new ArrayList<>();
            boolean arroba = false;
            boolean por = false;
            boolean entre = false;
            String fecha="";
            String usuario="";
            String estado="";
            String cargo="";
                for(int i=0 ; i<mensaje.length(); i++){
                    if(String.valueOf(mensaje.charAt(i)).equals("*")) break;
                    if(arroba) fecha += String.valueOf(mensaje.charAt(i));
                    if(String.valueOf(mensaje.charAt(i)).equals("@")) arroba = true;                    
                    if(!arroba) usuario += String.valueOf(mensaje.charAt(i));
                    
                }
                for(int i=0 ; i<mensaje.length(); i++){
                    if(String.valueOf(mensaje.charAt(i)).equals("/")) break;
                    if(por) estado += String.valueOf(mensaje.charAt(i));
                    if(String.valueOf(mensaje.charAt(i)).equals("*")) por = true;                    
                    
                    
                }
                for(int i=0 ; i<mensaje.length(); i++){
                    if(entre) cargo += String.valueOf(mensaje.charAt(i));
                    if(String.valueOf(mensaje.charAt(i)).equals("/")) entre = true;                    
                    
                }
                lista.add(usuario);
                lista.add(fecha);
                lista.add(estado);
                lista.add(cargo);
                
        return lista;
    }
    
    public int validarRecuperarContraseña(String password,String usuario){
        int r = 0;
        String fecha = "";
            try{
                Connection cn = new conexion().getConnection();                    
                String sql="update login_data set clave_log = ? ,estado_log = 1  where usuario_log = ?";
                PreparedStatement pst = cn.prepareCall(sql);
                pst.setString(1, new encriptar().encriptar(password));
                pst.setString(2, usuario);
                r = pst.executeUpdate();
            }catch(Exception e) {}
            
        return r;
    }
   
    
    
    
    
}
