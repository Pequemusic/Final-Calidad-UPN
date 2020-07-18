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
import modelo.cita;

/**
 *
 * @author VB
 */
public class Controlador_area {
    
    public ArrayList<area> listar (){
        ArrayList<area> lista = new ArrayList<>();
        try{
            Connection cn = new conexion().getConnection();                    
                String sql="select * from areas";
                Statement stt = cn.createStatement();
                ResultSet rs = stt.executeQuery(sql);                    
                    while(rs.next()){
                        String id = rs.getString(1);
                        String descripcion = rs.getString(2);
                                                 
                        area a = new area(Integer.parseInt(id), descripcion);
                        lista.add(a);
                    }
        }catch(Exception e) {}
        
        return lista;
    }
    
//    public int listar (){
//        ArrayList<area> lista = new ArrayList<>();
//        try{
//            Connection cn = new conexion().getConnection();                    
//                String sql="select * from areas";
//                Statement stt = cn.createStatement();
//                ResultSet rs = stt.executeQuery(sql);                    
//                    while(rs.next()){
//                        String id = rs.getString(1);
//                        String descripcion = rs.getString(2);
//                                                 
//                        area a = new area(Integer.parseInt(id), descripcion);
//                        lista.add(a);
//                    }
//        }catch(Exception e) {}
//        
//        return lista.size();
//    }
    
    public int insertar (area a){
        String descripcion = a.getNombre();
        
        int r=0;
                
                try{
                    Connection cn = new conexion().getConnection();                    
                    PreparedStatement sta = cn.prepareCall("insert into areas values (?,?)");  
                    sta.setString(1, null);
                    sta.setString(2, descripcion);
                    
                    r = sta.executeUpdate();
                } catch (Exception e) {
                }
                
                
        return r;
    }
}
