/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;
import fecha.Fecha;
import java.util.ArrayList;

/**
 *
 * @author VB
 */
public class validacionesContrato {
    public String ValidarContrato(int duracion , String horaentrada , String horasalida){
      
        String r = "";
        if(!ValidarDuracion(duracion).equals("")) r+= ValidarDuracion(duracion);
        if(!ValidarHora(horaentrada, horasalida).equals("")) r+= ValidarHora(horaentrada, horasalida);
    
    return r;
    }
    
    public String ValidarDuracion(int duracion){
    String bandera = "";              
        if(duracion < 1 || duracion > 12) bandera = "cantidad de meses incorrecta<br>";
    return bandera;
    }
    
    public String ValidarHora(String horaentrada , String horasalida){
    String bandera = "";              
        if(Integer.parseInt(horasalida) - Integer.parseInt(horaentrada) != 8) bandera = "Usted debe trabajar 8 horas<br>";
    return bandera;
    }
    
   
}


