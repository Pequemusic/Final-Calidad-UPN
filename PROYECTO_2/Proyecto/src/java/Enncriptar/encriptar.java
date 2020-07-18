/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enncriptar;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Usuario
 */
public class encriptar {
    public String encriptar(String a){
        String textoSinEncriptar=a; 
        String textoEncriptadoConMD5=DigestUtils.md5Hex(textoSinEncriptar);        
        return textoEncriptadoConMD5;
    }
}
