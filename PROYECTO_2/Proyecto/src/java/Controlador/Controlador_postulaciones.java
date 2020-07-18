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
import modelo.aspirante;
import modelo.postulaciones;

/**
 *
 * @author VB
 */
public class Controlador_postulaciones {
    
    public ArrayList<postulaciones> listar (){
        ArrayList<postulaciones> lista = new ArrayList<>();
        try{
            Connection cn = new conexion().getConnection();                    
                String sql="select * from postulaciones";
                Statement stt = cn.createStatement();
                ResultSet rs = stt.executeQuery(sql);                    
                    while(rs.next()){
                         int  postulacion = Integer.parseInt(rs.getString(1));
                         String fecha = rs.getString(2);
                         String dni= rs.getString(3);
                         
                         postulaciones a = new postulaciones(postulacion, fecha, dni);
                                        
                         lista.add(a);
                    }
        }catch(Exception e) {}
        
        return lista;
    }
    
    
}
