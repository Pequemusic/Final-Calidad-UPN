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
import modelo.cita;

/**
 *
 * @author VB
 */
public class Controlador_cita {
        
    public ArrayList<cita> listar (){
        ArrayList<cita> lista = new ArrayList<>();
        try{
            Connection cn = new conexion().getConnection();                    
                String sql="select * from citas";
                Statement stt = cn.createStatement();
                ResultSet rs = stt.executeQuery(sql);                    
                    while(rs.next()){
                        String id = rs.getString(1);
                        String dni = rs.getString(2);
                        String tipo = rs.getString(3);
                        String fecha= rs.getString(4);
                        String hora= hora(rs.getString(5));
                        String estado= obtener_Estado(Integer.parseInt(rs.getString(6)));
                                                 
                        cita a = new cita(Integer.parseInt(id), dni, tipo, fecha, hora,estado);
                        lista.add(a);
                    }
        }catch(Exception e) {}
        
        return lista;
    }
    
    public int insertar (cita a){
        String dni = a.getDni();
        String tipo = a.getTipo();
        String fecha = a.getFecha();
        String horario = a.getHora();
        String estado = a.getEstado();
        
        int r=0;
                
                try{
                    Connection cn = new conexion().getConnection();                    
                    PreparedStatement sta = cn.prepareCall("insert into citas values (?,?,?,?,?,?)");  
                    sta.setString(1, null);
                    sta.setString(2, dni);
                    sta.setString(3, tipo); 
                    sta.setString(4, fecha);
                    sta.setString(5, horario);
                    sta.setString(6, estado);
                    
                    r = sta.executeUpdate();
                } catch (Exception e) {
                }
                
                
        return r;
    }
    
    public String obtener_Estado(int opcion){
        String sexo = null;
            if(opcion == 0) sexo = "POR ESPECIFICAR";
            if(opcion == 1) sexo = "RECHAZADO";
            if(opcion == 2) sexo = "ACEPTADO";
        
        return sexo;        
    }
    
    public int ActualizarEstado (cita a ){
        int r = 0;
            int id = a.getId();
            String estado = a.getEstado();
            try{
                    Connection cn = new conexion().getConnection();                    
                    PreparedStatement sta = cn.prepareCall("update citas set estado=? where id_cita=?");  
                    sta.setString(1, estado);
                    sta.setString(2, String.valueOf(id));                    
                    r = sta.executeUpdate();
                } catch (Exception e) {
                }
        return 0;
    }
    
    public String hora(String dato){
        String horas = "";
        String minutos = "";
        String horass = "";
        String minutoss = "";
        String horaf = null;
        int posicion = -1;
        for(int i=0 ; i<dato.length(); i++){
            if(",".equals(String.valueOf(dato.charAt(i))))
                posicion = i;
        }
        System.out.println(posicion);
        for(int i=0 ; i<dato.length(); i++){
            if(i<posicion){                
               horas += String.valueOf(dato.charAt(i));
            }
            if(i>posicion){
               minutos += String.valueOf(dato.charAt(i));
            }
        }
        if(horas.length() == 1){
           horass = "0"+horas; 
        }
        
        if(minutos.length() == 1){
           minutoss = "0"+minutos; 
        }
        
        if(minutos.length() != 1){
           minutoss = minutos; 
        }
        
        if(horas.length() != 1){
           horass = horas; 
        }
        
        horaf = horass + " : " + minutoss;
        System.out.println(horaf);
    
        return horaf;
    }
}
