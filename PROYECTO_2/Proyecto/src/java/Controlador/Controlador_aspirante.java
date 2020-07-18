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
import java.util.List;
import modelo.area;
import modelo.aspirante;

/**
 *
 * @author VB
 */
public class Controlador_aspirante {
    
    public ArrayList<aspirante> listar (){
        ArrayList<aspirante> lista = new ArrayList<>();
        try{
            Connection cn = new conexion().getConnection();                    
                String sql="select * from aspirantes order by id_postulacion asc";
                Statement stt = cn.createStatement();
                ResultSet rs = stt.executeQuery(sql);                    
                    while(rs.next()){
                         String dni = rs.getString(1);
                         String postulacion = rs.getString(2);
                         String nombres= rs.getString(3);
                         String apellidos= rs.getString(4);
                         String direccion= rs.getString(5);
                         String distrito= rs.getString(6);
                         String correo= rs.getString(7);
                         String celular= rs.getString(8);
                         String fijo= rs.getString(9);
                         String fecha= rs.getString(10);
                         String sexo= obtener_Sexo(Integer.parseInt(rs.getString(11)));
                         String hijos= rs.getString(12);                         
                         String area= obtenerDescripcion_Area(Integer.parseInt(rs.getString(13)));                                 
                         String cv= rs.getString(14);                         
                         aspirante a = new aspirante(dni, Integer.parseInt(postulacion), nombres, apellidos, direccion, distrito, correo, celular, fijo, fecha, sexo, hijos, area, cv);
                         lista.add(a);
                    }
        }catch(Exception e) {}
        
        return lista;
    }
    
    public int insertar (aspirante a){
        String dni = a.getDni();
        String nombres = a.getNombres();
        String apellidos = a.getApellidos();
        String direccion = a.getDireccion();
        String distrito = a.getDistrito();
        String correo = a.getCorreo();
        int celular = Integer.parseInt(a.getCelular());
        int fijo = Integer.parseInt(a.getFijo());
        String fecha = a.getFecha();
        String sexo = a.getSexo();
        int hijos = Integer.parseInt(a.getHijos());
        String area = a.getArea();
        String cv = a.getCv();        
        int r=0;
        Fecha f= new Fecha();
        int id=0; 
                
                try{
                    Connection cn = new conexion().getConnection();                    
                    PreparedStatement sta = cn.prepareCall("insert into postulaciones values (?,?,?)");  
                    sta.setString(1, null);
                    sta.setString(2, f.getDate());
                    sta.setString(3, dni);  
                    
                    r = sta.executeUpdate();
                } catch (Exception e) {
                }
                
                try{               
                    Connection cn = new conexion().getConnection();   
                    Statement stt = cn.createStatement();
                    ResultSet rs = stt.executeQuery("select id_postulacion from postulaciones order by id_postulacion desc limit 1");
                    while(rs.next()){
                        id = Integer.parseInt(rs.getString(1));
                    }
                    
                } catch (Exception e) {
                }
                
                try{ 
                    Connection cn = new conexion().getConnection();                    
                    PreparedStatement sta = cn.prepareCall("insert into aspirantes values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    sta.setString(1, dni);
                    sta.setInt(2, id);
                    sta.setString(3, nombres);
                    sta.setString(4, apellidos);
                    sta.setString(5, direccion);
                    sta.setString(6, distrito);
                    sta.setString(7, correo);
                    sta.setInt(8, celular);
                    sta.setInt(9, fijo);
                    sta.setString(10, f.getDate());
                    sta.setString(11, sexo);
                    sta.setInt(12, hijos);
                    sta.setString(13, area);
                    sta.setString(14, cv);
                    
                    r = sta.executeUpdate();
                } catch (Exception e) {
                }
        return id;
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
    
    public String ObtenerArea(String dni){
        String a = null;
            try{
            Connection cn = new conexion().getConnection();     
            PreparedStatement pst = cn.prepareCall("select id_area from aspirantes where dni_as=?");
            pst.setString(1,String.valueOf(dni));
            ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                        a = obtenerDescripcion_Area(Integer.parseInt(rs.getString(1)));
                    }
            }catch(Exception e) {}
    return a;    
    }
    
    public void IngresarCv(String dni){
        String a = null;
            try{
            Connection cn = new conexion().getConnection();     
            PreparedStatement pst = cn.prepareCall("select id_area from aspirantes where dni_as=?");
            pst.setString(1,String.valueOf(dni));
            ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                        a = obtenerDescripcion_Area(Integer.parseInt(rs.getString(1)));
                    }
            }catch(Exception e) {} 
    }
    
    public List<String> llenarDistritos(){
        List<String> distritos = new ArrayList<>();
            distritos.add("Ancón");
            distritos.add("Ate Vitarte");
            distritos.add("Barranco");
            distritos.add("Breña");
            distritos.add("Callao");
            distritos.add("Carabayllo");
            distritos.add("Chaclacayo");
            distritos.add("Chorrillos");
            distritos.add("Cieneguilla");
            distritos.add("Comas");
            distritos.add("El Agustino");
            distritos.add("Independencia");
            distritos.add("Jesús María");
            distritos.add("La Molina");
            distritos.add("La Victoria");
            distritos.add("Lima");
            distritos.add("Lince");
            distritos.add("Los Olivos");
            distritos.add("Lurigancho");
            distritos.add("Lurín");
            distritos.add("Magdalena del Mar");
            distritos.add("Miraflores");
            distritos.add("Pachacamac");
            distritos.add("Pucusana");
            distritos.add("Pueblo Libre");
            distritos.add("Puente Piedra");
            distritos.add("Punta Hermosa");
            distritos.add("Punta Negra");
            distritos.add("Rímac");
            distritos.add("San Bartolo");
            distritos.add("San Borja");
            distritos.add("San Isidro");
            distritos.add("San Juan de Lurigancho");
            distritos.add("San Juan de Miraflores");
            distritos.add("San Luis");
            distritos.add("San Martín de Porres");
            distritos.add("San Miguel");
            distritos.add("Santa Anita");
            distritos.add("Santa María del Mar");
            distritos.add("Santa Rosa");
            distritos.add("Santiago de Surco");
            distritos.add("Surquillo");
            distritos.add("Villa El Salvador");
            distritos.add("Villa María del Triunfo");  
        return distritos;
    }
}
