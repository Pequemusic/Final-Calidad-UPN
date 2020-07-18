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
import java.util.Date;
import java.util.List;
import modelo.asistencia;
import modelo.contrato;
import modelo.empleado;
import modelo.login;

/**
 *
 * @author VB
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        login a = new login("danielvallejos", "danielvallejos", "");
        String mensaje = new Controlador_login().validarIngreso(a);
        System.out.println(mensaje);
    }
    
}
