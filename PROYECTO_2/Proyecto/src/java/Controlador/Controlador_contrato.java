/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.contrato;

/**
 *
 * @author VB
 */
public class Controlador_contrato {
    
    public ArrayList<contrato> listar (){
        ArrayList<contrato> lista = new ArrayList<>();
        try{
            Connection cn = new conexion().getConnection();                    
                String sql="select * from contratos";
                Statement stt = cn.createStatement();
                ResultSet rs = stt.executeQuery(sql);                    
                    while(rs.next()){
                         String id = rs.getString(1);
                         String dni = rs.getString(2);
                         String fechai= rs.getString(3);
                         String duracion= rs.getString(4);
                         String fechaf= rs.getString(5);
                         String area= rs.getString(6);
                         String cargo= rs.getString(7);
                         String diast= rs.getString(8);
                         String horario= rs.getString(9);
                         String sueldo= rs.getString(10);
                         String asigfamiliar= rs.getString(11);
                         String cuenta= rs.getString(12);                         
                         String seguro= rs.getString(13); 
                         
                         contrato a = new contrato(Integer.parseInt(id), dni, fechai, Integer.parseInt(duracion), 
                                                    fechaf, area, Integer.parseInt(cargo),diast, horario, 
                                                    Double.parseDouble(sueldo),Double.parseDouble(asigfamiliar), cuenta, seguro);
                         lista.add(a);
                    }
        }catch(Exception e) {}
        
        return lista;
    }
    
    public int insertar (contrato a){
        String dni = a.getDni();
        String fechai = a.getFechai();
        int duracion = a.getDuracion();
        String area = a.getArea();
        int cargo = a.getCargo();
        String diast = a.getDiast();
        String horario = a.getHorario();
        double sueldo = a.getSueldo();
        double asigfamiliar = ObtenerAsignacionFamiliar(dni, sueldo);
        String cuenta = a.getCuenta();
        String seguro = a.getSeguro();       
        int r=0;
                
                try{
                    Connection cn = new conexion().getConnection();                    
                    PreparedStatement sta = cn.prepareCall("insert into contratos values (?,?,?,?,?,?,?,?,?,?,?,?,?)");  
                    sta.setString(1, null);
                    sta.setString(2, dni); 
                    sta.setString(3, fechai); 
                    sta.setInt(4, duracion);
                    sta.setString(5, ObtenerMes(fechai, duracion)); 
                    sta.setString(6, area); 
                    sta.setInt(7, cargo);
                    sta.setString(8, diast); 
                    sta.setString(9, horario); 
                    sta.setDouble(10, sueldo); 
                    sta.setDouble(11, asigfamiliar); 
                    sta.setString(12, cuenta); 
                    sta.setString(13, seguro); 
                    
                    r = sta.executeUpdate();
                } catch (Exception e) {}               
                
        return r;
    }    
    
    
    
    public String  ObtenerMes (String fecha , int mes){
        String fechafinal = ""; 
                String mesesito;
                String day = String.valueOf(fecha.charAt(8)) + String.valueOf(fecha.charAt(9));
                String month = String.valueOf(fecha.charAt(5)) + String.valueOf(fecha.charAt(6));
                String  year= String.valueOf(fecha.charAt(0)) + String.valueOf(fecha.charAt(1))+String.valueOf(fecha.charAt(2))+String.valueOf(fecha.charAt(3));
                int mess = Integer.parseInt(month) + mes; 
                
                while(mess > 12){
                   mess = mess - 12;
                   year = String.valueOf(Integer.parseInt(year) + 1);
                }
                if(mess <= 9) {mesesito= "0"+String.valueOf(mess);}
                else { mesesito =String.valueOf(mess);}
                
                fechafinal = year+"-"+mesesito+"-"+day;
        return fechafinal;
    }
    
    public double ObtenerAsignacionFamiliar(String dni, double sueldo){
        double asginacion = 0;
        int r=0;
        try{  
            Connection cn = new conexion().getConnection();     
            PreparedStatement pst = cn.prepareCall("select hijos_as from aspirantes where dni_as=?");
            pst.setString(1,dni);
            ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    asginacion = (Integer.parseInt(rs.getString(1))*0.01)*sueldo;
                }
        }catch(Exception e) {}
        System.out.println(asginacion);
        return asginacion;
    }
    
    
    
}
