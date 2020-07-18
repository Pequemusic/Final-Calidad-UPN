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
public class validacionesAspirante {
    public String ValidarAspirante(String dni,String celular,String fijo,String fecha){
      
        String r = "";
        if(!ValidarDni(dni).equals("")) r+= ValidarDni(dni);
        if(!ValidarCelular(celular).equals("")) r+= ValidarCelular(celular);
        if(!ValidarFijo(fijo).equals("")) r+= ValidarFijo(fijo);
        if(!ValidarFecha(fecha).equals("")) r+= ValidarFecha(fecha);
    
    return r;
    }
    
    public String ValidarDni(String dni){
    String bandera = "";              
        if(dni.length() != 8) bandera = "El Dni debe tener 8 caracteres <br>";
    return bandera;
    }
    
    public String ValidarCelular(String calular){
    String bandera = "";              
        if(calular.length() != 9) bandera = "El Calular debe tener 9 caracteres<br>";
    return bandera;
    }
    
    public String ValidarFijo(String fijo){
    String bandera = "";              
        if(fijo.length() != 7) bandera = "El Fijo debe tener 7 caracteres<br>";
    return bandera;
    }
    
    public String ValidarFecha(String fecha){ 
    String bandera = "";
    boolean menor = false;
        String fechaActual = new Fecha().getDate();
        String day = String.valueOf(fecha.charAt(8)) + String.valueOf(fecha.charAt(9));
        String month = String.valueOf(fecha.charAt(5)) + String.valueOf(fecha.charAt(6));
        String year= String.valueOf(fecha.charAt(0)) + String.valueOf(fecha.charAt(1))+String.valueOf(fecha.charAt(2))+String.valueOf(fecha.charAt(3));
        
        String dayy = String.valueOf(fechaActual.charAt(8)) + String.valueOf(fechaActual.charAt(9));
        String monthh = String.valueOf(fechaActual.charAt(5)) + String.valueOf(fechaActual.charAt(6));
        String yearr= String.valueOf(fechaActual.charAt(0)) + String.valueOf(fechaActual.charAt(1))+String.valueOf(fechaActual.charAt(2))+String.valueOf(fechaActual.charAt(3));
        
        
        if(Integer.parseInt(yearr) - Integer.parseInt(year) <= 0)
            menor = true;
        if(Integer.parseInt(yearr) - Integer.parseInt(year) <= 18)
            if(Integer.parseInt(month) > Integer.parseInt(monthh))
                menor = true;
        
        if(Integer.parseInt(yearr) - Integer.parseInt(year) <= 18)
            if(Integer.parseInt(month) == Integer.parseInt(monthh))
                if(Integer.parseInt(day) > Integer.parseInt(dayy))
                    menor = true;
        
        if(menor) bandera = "Usted es menor de edad<br>";
        
    return bandera;
    }
}


